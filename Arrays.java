// public class Arrays {
//     public static void main(String args[]) {
//         // Array
//         int[] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 97;
//         marks[2] = 97;

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for (int j = 0; j < 3; j++) {
//             System.out.println(marks[j]);
//         }

//     }
// }

// Taking input size from the user ubli

// import java.util.Scanner;

// public class Arrays {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int number [] = new int [size];

//         for (int i=0; i<size; i++){
//             System.out.println(number[i]);
//         }

//     }

// }

// Taking the input of arrays from the user 

// import java.util.*;

// public class Arrays {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         // Initialize Array
//         int number[] = new int[size];

//         // Input
//         for (int i = 1; i < size; i++) {
//             number[i] = sc.nextInt();
//         }

//         // Output
//         for (int i = 1; i < size; i++) {
//             System.out.println(number[i]);
//         }

//     }
// }

// Q. Take an array as input from the user search for a given number x and print index at which it occurs 

import java.util.*;
public class Arrays {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.print("Give the size of an array that you want: ");
        int size = sc.nextInt();

        // Initialize the array 
        int number [] = new int [size];

        //Take the input from the user 
        System.out.println("Enter the array: ");
        for (int i=0; i<size; i++){
            number [i] = sc.nextInt();
        }
        
        System.out.println("Enter the number that you want to find in the array: ");
        int x = sc.nextInt();

        // Output
        for (int i=0; i<size; i++){

            if (number [i] == x){
                System.out.println("The number that you want to find in array is at the index of : " +i);
            }
            else {
                System.out.println("There is no such number in the array");
            }

        }


    }
}