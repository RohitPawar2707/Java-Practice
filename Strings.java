//Input of the string.

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name : ");
//         String name = sc.nextLine();

//         System.out.println("Your name is : " + name);

//     }
// }

// Concatenation of String

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your first name ");
//         String FirsrName = sc.nextLine();
//         System.out.println("Enter your last name");
//         String LastName = sc.nextLine();
//         String FullName = FirsrName  +  LastName;

//         System.out.println("Your full name is: " + FullName);

//         // Length of string 
//         System.out.println(FullName.length());

//         //chatAt
//         for (int i=0; i<FullName.length(); i++){

//             System.out.println(FullName.charAt(i));
//         }
//     }
// }

// Compare the string 

// import java.nio.channels.Pipe.SourceChannel;

// public class Strings {

//     public static void main(String[] args) {

//         String name1 = "Rohit";
//         String name2 = "Rohit";

//         if (name1.compareTo(name2) == 0) {
//             System.out.println("Strings are equal");

//         } else {
//             System.out.println("Strings are not equal");
//         }

//     }
// }

// Substring in java

public class Strings {
    public static void main(String args[]) {

        String sentence = "My name is Rohit Vijay Pawar";

        String name = sentence.substring(10, sentence.length());
        System.out.println(name);


    }
}

// String is immutable - ones it defines it can not be change.
