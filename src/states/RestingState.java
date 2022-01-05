package states;

import factory.Elevator;

public class RestingState extends ElevatorState{


    public RestingState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void up() {
        elevator.changeState(new GoingUpState(elevator));
    }

    @Override
    public void down() {
        elevator.changeState(new GoingDownState(elevator));
    }

    @Override
    public void stop() {
        elevator.changeState(new StopState(elevator));
    }

    @Override
    public void rest() {
        throw new IllegalStateException("elevator already resting");
    }

    @Override
    public int distanceFromFloor(int floor) {
        return Math.abs(floor - elevator.getCurrentFloor());
    }
}
