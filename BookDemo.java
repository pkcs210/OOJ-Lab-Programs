import java.util.Scanner;


class Books {
	String name;
	String author;
	int  price;
	int numPages;
	

	Books(String name, String author, int price, int numPages)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.numPages = numPages;
	}


	public String toString()
	{
		String v = "";
		v += "Book name:" + this.name + "\n";
		v += "Author name:" + this.author + "\n";
		v += "Price:" + this.price + "\n";
		v += "Number of pages:" + this.numPages + "\n";
		return v;	
	}

}


public class BookDemo {

	public static void main(String arg[])
	{
		int n;
		Books b[];
		String name, author;
		int price, numPages;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of books: ");
		n = s.nextInt();
		b = new Books[n];
		

		for(int i=0; i<n; i++)
		{
			System.out.println("\nEnter details of Book "+(i+1)+"\n");
			System.out.print("Name: ");
			name = s.next();
			System.out.print("Author: ");
			author = s.next();
			System.out.print("Price: ");
			price = s.nextInt();
			System.out.print("Number of pages: ");
			numPages = s.nextInt();
			b[i] = new Books(name, author, price, numPages);
		}
		


		System.out.println("\nDisplaying book details:\n");
		for(int i=0; i<n; i++)
		{
			System.out.println(b[i].toString());
		}		
		
	}

}