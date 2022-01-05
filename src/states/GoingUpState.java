package states;

import factory.Elevator;
import factory.ElevatorInterface;

import java.util.logging.Logger;

public class GoingUpState extends ElevatorState{


    public GoingUpState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up() {
        throw new IllegalStateException("Elevator is already going up");
    }

    @Override
    public void down() {
        throw new IllegalStateException("Elevator is going up and cannot go down");
    }

    @Override
    public void stop() {
        elevator.changeState(new StopState(elevator));
    }

    @Override
    public void rest() {
        elevator.changeState(new RestingState(elevator));
    }

    @Override
    public int distanceFromFloor(int floor) {
        if (floor >= elevator.getCurrentFloor())
            return floor - elevator.getCurrentFloor();
        else
            return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();
    }
}
