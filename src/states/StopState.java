package states;

import factory.Elevator;
import factory.ElevatorInterface;

public class StopState extends ElevatorState{
    protected StopState(Elevator elevator) {
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
        throw new IllegalStateException("elevator already stopped");
    }

    @Override
    public void rest() {
        elevator.changeState(new RestingState(elevator));
    }

    @Override
    public int distanceFromFloor(int floor) {
        return -1;
    }
}
