
import java.util.*;

interface Vehicle {
    void Gear_change(int g);

    void speed_Up(int s);

    void apply_brakes(int a);
}

class Bicycle implements Vehicle {
    int speed, gear;

    public void Gear_change(int ge) {
        gear = ge;
    }

    public void speed_Up(int incr) {
        speed = speed + incr;
    }

    public void apply_brakes(int decr) {
        speed = speed - decr;
    }

    public void display() {
        System.out.println("Speed is = " + speed + "\n Gear is = " + gear);
    }
}

class Car implements Vehicle {
    int speed, gear;

    public void Gear_change(int ge)

    {
        gear = ge;
    }

    public void speed_Up(int incr) {
        speed = speed + incr;
    }

    public void apply_brakes(int decr) {
        speed = speed - decr;
    }

    public void display() {
        System.out.println("Speed is = " + speed + "\n Gear is = " + gear);
    }
}

class Bike implements Vehicle {
    int speed, gear;

    public void Gear_change(int ge) {
        gear = ge;
    }

    public void speed_Up(int incr) {
        speed = speed + incr;
    }

    public void apply_brakes(int decr) {
        speed = speed - decr;
    }

    public void display() {
        System.out.println("Speed is = " + speed + "\n Gear is " + gear);
    }
}

public class OOPS_5 {
    public static void main(String args[]) {
        Bicycle bc = new Bicycle();
        bc.Gear_change(5);
        bc.speed_Up(45);
        bc.apply_brakes(25);
        System.out.println("For Bicycle: ");

        bc.display();

        Car c = new Car();
        c.Gear_change(8);
        c.speed_Up(40);
        c.apply_brakes(30);
        System.out.println("For Car :");
        c.display();

        Bike bk = new Bike();
        bk.Gear_change(10);
        bk.speed_Up(35);
        bk.apply_brakes(20);
        System.out.println("For Bike :");
        bk.display();

    }
}
