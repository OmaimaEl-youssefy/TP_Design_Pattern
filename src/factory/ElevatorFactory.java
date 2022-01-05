package factory;

public class ElevatorFactory {
    private static ElevatorFactory  instance = null ;

    private ElevatorFactory(){}

    public static ElevatorFactory getINSTANCE() {
        if(instance==null)
            instance = new ElevatorFactory();
        return instance;
    }

    public Elevator createElevator(String identifier,int numberOfFloors) {

        var id = identifier.split(":")[0];
        var currentFloor = Integer.parseInt(identifier.split(":")[1]);
        return new Elevator(id,currentFloor,numberOfFloors);
    }


}
