
//OM KENGE SI25
import java.util.*;

abstract class Shape {
    double area;

    public Shape() {
    }

    abstract void getArea();
}

class Triangle extends Shape {
    double height, base;

    Triangle(double height, double base) {
        super();
        this.height = height;
        this.base = base;
    }

    public void getArea() {
        area = height * base / 2;
        System.out.println("Area of Triangle : " + area);
    }
}

class Rectangle extends Shape {
    double width, length;

    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public void getArea() {
        area = width * length;
        System.out.println("Area of Rectangle : " + area);
    }
}

public class OOPS_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of Triangle: ");
        float a = sc.nextInt();
        System.out.println("Enter lenght of Base of Triangle: ");
        float b = sc.nextInt();
        Triangle t = new Triangle(a, b);
        t.getArea();
        System.out.println("Enter width of Rectangle: ");
        float c = sc.nextInt();
        System.out.println("Enter lenght of Rectangle: ");
        float d = sc.nextInt();
        Rectangle r = new Rectangle(c, d);

        r.getArea();
    }
}