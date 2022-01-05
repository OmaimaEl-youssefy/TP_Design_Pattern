package factory;

import states.ElevatorState;

public interface ElevatorInterface {
    int getCurrentFloor();
    void setCurrentFloor(int currentFloor);
    ElevatorState getElevatorState();
    int getNumberOfFloors();
    String getId();
    void setElevatorState(ElevatorState elevatorNewState);
    void serve(int floor);
    void stop(int floor);

}
