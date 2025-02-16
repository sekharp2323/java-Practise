class Vehicle{
    void start(){
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is being driven.");
    }
}
class ElectricCar extends Car{
    void charge(){
        System.out.println("Electric Car is Charging");
    }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("Bike is being ridden.");
    }
}
public class C3 {
    public static void main(String[] args) {
        ElectricCar tesla=new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.charge();
        System.out.println("----------------");
        Car car=new Car();
        car.start();
        car.drive();
        System.out.println("----------------");
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        System.out.println("----------------");
        Bike bike=new Bike();
        bike.start();
        bike.ride();
    }
}
