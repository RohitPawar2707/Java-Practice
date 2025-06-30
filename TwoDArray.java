import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int columns = sc.nextInt();

        int number[][] = new int[rows][columns];

        // Input
        // Arrays

        for (int i = 0; i < rows; i++) {
            // Colums 
            for (int j = 0; j < columns; j++) {
                number[i][j] = sc.nextInt();

            }
        }
        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
                System.out.print(number[i][j] + "   ");
            }
             System.out.println();
        }

    }

}

// Q. Take the matrix as input from the user .Search for a given number x and print the indices at which it occurs
// import java.util.*;
// import java.util.Scanner;

// public class TwoDArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int rows = sc.nextInt();
//         int columns = sc.nextInt();

//         int number[][] = new int[rows][columns];

//         // Input
//         for (int i = 0; i < rows; i++) {
//             // Output
//             for (int j = 0; j < columns; j++) {
//                 number[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {

//                 if (number[i][j] == x) {
//                     System.out.print("X will be found at the index of (" + i + "," + j + ")");
//                 }

//             }
//         }
       
//     }
// }