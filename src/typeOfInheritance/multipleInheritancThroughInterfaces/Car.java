package typeOfInheritance.multipleInheritancThroughInterfaces;

interface Vehicle{
    public void print_vehicle();
}

interface Motorcycle{
    public void printMotorCycle();
}
interface Tractor extends Vehicle, Motorcycle{
    public void printTractor();
}
class Suv implements Tractor{
    public void printTractor(){
        System.out.println("printTractor for SUV");
    }

    @Override
    public void print_vehicle() {
    System.out.println("it is from Vehicle");
    }

    @Override
    public void printMotorCycle() {

    }
}
public class Car {
    public static void main(String[] args) {
        Car mySUV = new Car();
        mySUV.print_vehicle();
    }

    private void print_vehicle() {
    }
}




