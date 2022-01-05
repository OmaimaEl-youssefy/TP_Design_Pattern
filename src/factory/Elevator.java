package factory;

import states.ElevatorState;
import states.RestingState;

public class Elevator {
    private String id;
    private int currentFloor;
    private int numberOfFloors;

    private ElevatorState elevatorState;

    public Elevator(String id, int currentFloor, int numberOfFloors) {

        this.elevatorState = new RestingState(this);
        this.id = id;
        this.currentFloor = currentFloor;
        this.numberOfFloors = numberOfFloors;
    }

    public void changeState(ElevatorState state) {
        this.elevatorState = state;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public String getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

}
