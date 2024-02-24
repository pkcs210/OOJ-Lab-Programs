import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        double D;
        double r1, r2;

        System.out.print("Enter a, b, & c: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        D = b * b - 4 * a * c;

        if (D >= 0) {
            r1 = (-b + Math.sqrt(D)) / (2 * a);
            r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        } else {
            r1 = -b / (2 * a);
            r2 = Math.sqrt(-D) / (2 * a);
            System.out.println("r1 = " + r1 + "+" + r2 + "i");
            System.out.println("r2 = " + r1 + "-" + r2 + "i");
        }
    }
}
