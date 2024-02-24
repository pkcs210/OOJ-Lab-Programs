import java.util.Scanner;
import java.util.Math;

class InputScanner {
  Scanner s;
  
  InputScanner() {
    s = new Scanner(System.in);
  }
  
  public int takeInput(String m) {
    System.out.println(m);
    return s.nextInt();
  }
}

abstract class Shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    public void printArea() {
        System.out.println("Area of rectangle = " + (1.0 * dim1 * dim2));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    public void printArea() {
        System.out.println("Area of triangle = " + (0.5 * dim1 * dim2));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, radius);
    }

    public void printArea() {
        System.out.println("Area of circle = " + (3.1415 * dim1 * dim2));
    }
}

public class Main {
    public static void main(String[] args) {
        InputScanner ic = new InputScanner();
        Shape shape1, shape2, shape3;
        int d1, d2;

        System.out.println("Rectagle");
        d1 = ic.takeInput("Enter length:");
        d2 = ic.takeInput("Enter breadth:");
        shape1 = new Rectangle(d1, d2);
        shape1.printArea();

        System.out.println("Triangle");
        d1 = ic.takeInput("Enter base:");
        d2 = ic.takeInput("Enter height:");
        shape2 = new Triangle(d1, d2);
        shape2.printArea();

        System.out.println("Circle");
        d1 = ic.takeInput("Enter radius:");
        shape3 = new Circle(d1, d1);
        shape3.printArea();
    }
}

