import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car =new Car(100);
        Bicycle cycle=new Bicycle(100);
        Scooter scooter=new Scooter(100);
        Vehicle []vehicles={car,scooter};
        Person ali=new Person("ali",vehicles);
        Person alu=new Person("alu",new Vehicle[]{cycle,scooter});
        System.out.println(alu.getName());
        System.out.println(Arrays.toString(alu.getVehicles()));
        car.move(20);
        System.out.println(car.getSpeed());


        System.out.println(Vehicle.PURCHASE_RATE);
        System.out.println(car.kmToMeter());
    }
}