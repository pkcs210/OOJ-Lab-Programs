public class Program1 {
    public static void main(String[] args) {
      
        System.out.println("Using String Literal");
        String str1 = "Hello, World!";
        System.out.println("String 1: " + str1);

        System.out.println("Using new keyword");
        String str2 = new String("Apple");
        System.out.println("String 2: " + str2);

        System.out.println("Using char array");
        char[] charArray = {'O', 'r', 'a', 'n', 'g', 'e'};
        String str3 = new String(charArray);
        System.out.println("String 3: " + str3);

        System.out.println("Using byte array with character encoding");
        byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
        String str4 = new String(byteArray);
        System.out.println("String 4: " + str4);

        System.out.println("Substring of an existing string");
        String originalStr = "Java Programming";
        String str5 = new String(originalStr.substring(0, 4)); // Extract "Java"
        System.out.println("String 5: " + str5);

        System.out.println("Using StringBuilder");
        StringBuilder stringBuilder = new StringBuilder("Hello");
        String str6 = new String(stringBuilder.toString());
        System.out.println("String 6: " + str6);
      
    }
}


public class Program234 {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "World";
        int length = str1.length();
        
        System.out.println("Program 2");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Length of String 1: " + length);
        String concatenatedString = str1.concat(", " + str2);
        System.out.println("Concatenated String: " + concatenatedString);

	      System.out.println("Program 3");
        String toStringExample = "This is an example.";
        System.out.println("Using toString(): " + toStringExample);

	      System.out.println("Program 4");        
        String originalString = "Welcome to Bmsce college";
        char[] targetArray = new char[5];
        originalString.getChars(11, 16, targetArray, 0);
        String extractedString = new String(targetArray);
        System.out.println("Extracted String: " + extractedString);
      
    }
}


public class Program5 {
    public static void main(String args[])
    {
        String str = "Abracadbara";
	      byte[] ba = str.getBytes();
        char[] ca = str.toCharArray();
       
	      System.out.println("Bytes:");
        for (int i = 0; i < ba.length; i++) {
            System.out.println(ba[i]);
        }
	
      	System.out.println("\nCharacter Array:");
        for (int i = 0; i < ca.length; i++) {
            System.out.println(ca[i]);
        }
    }
}


public class Program6 {
    public static void main(String[] args)   
        String str1 = "Bmsce";
        String str2 = "College";
        String str3 = "BMSCE";
  
        System.out.println("Bmsce equals Bmsce -> " + str1.equals(str1));
	      System.out.println("Bmsce equals College -> " + str1.equals(str2));
	      System.out.println("Bmsce equals BMSCE -> " + str1.equals(str3));
	      System.out.println("Bmsce equalsIgnoreCase BMSCE -> " + str1.equalsIgnoreCase(str3));
    }
}


public class Program7 {
    public static void main(String[] args) {
      	System.out.println("Program 7");
        String str1 = "Welcome to Bmsce College of Engineering";
        String str2 = "Bmsce college";

        if (str1.regionMatches(true, 11, str1, 0, str2.length())
            System.out.println("Substring is matched");
        } else {
            System.out.println("Substring is not matched");
        }
    }
}


public class Program8910 {
    public static void main(String[] args) {
	  System.out.println("Program 8");
	  System.out.println("Mango startsWith Man -> " + "Mango".startsWith("Man"));

  	System.out.println("Program 9");
	  System.out.println("Orange endsWith range -> " + "Orange".startsWith("range"));

	  System.out.println("Program 10"); 
	  String str1 = "Apple";
	  String str2 = new String("Apple");
	  System.out.println("String 1: " + str1);
	  System.out.println("String 2: " + str2);
	  System.out.println("String 1 equals String 2 -> " + str1.equals(str2));
	  System.out.println("String 1 == String 2 -> " + (str1 == str2));
    }
}
