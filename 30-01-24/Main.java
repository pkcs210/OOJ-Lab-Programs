import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father extends InputScanner {
    private int fatherAge;

    public Father() throws WrongAge {
        super();  
        super.s = new Scanner(System.in);
        System.out.print("Enter father's age: ");
        fatherAge = super.s.nextInt();
        super.s.close();
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    public void display() {
        System.out.println("Father's age: " + fatherAge);
    }
}

class Son extends Father {
    private int sonAge;

    public Son() throws WrongAge {
        super();
        super.s = new Scanner(System.in);
        System.out.print("Enter son's age: ");
        sonAge = super.s.nextInt();
        super.s.close();
        if (sonAge >= super.fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        } else if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    public void display() {
        super.display();
        System.out.println("Son's age: " + sonAge);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Son son = new Son();
            son.display();
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class InputScanner {
    Scanner s;
    public InputScanner() {
    }
}
