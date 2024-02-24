import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numPages;

    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String v = "";
        v += "Book name: " + this.name + "\n" +
          "Author name: " + this.author + "\n" +
          "Price: " + this.price + "\n" +
          "Number of pages: " + this.numPages;
        return v;
    }
}

public class Main {
    public static void main(String[] args){
        int n;
        Book[] b;
        String name, author;
        int price, numPages;
      
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        n = s.nextInt();
        b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Book " + (i+1));
            System.out.print("Name: ");
            name = s.next();
            System.out.print("Author: ");
            author = s.next();
            System.out.print("Price: ");
            price = s.nextInt();
            System.out.print("Number of pages: ");
            numPages = s.nextInt();
            b[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nDisplaying book details: ");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }
    }
}

