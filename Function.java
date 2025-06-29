// Function to print my name 

// import java.util.*;

// public class Function {

//     //New Function
//     public static void printMyName (String name){
//         System.out.println(name);
//         return;
//     }
//     //Main Function
//     public static void main(String args []){

//         Scanner sc = new Scanner (System.in);
//         String name = sc.next();

//         // Call the Function
//         printMyName(name);

//     }
// }

// Q. Make the function to add two numbers and return there sum

// import java.util.*;

// public class Function {

//     //New Function
//     public static int calculateSum (int a, int b){
//         int sum = a+b;
//         return sum ;
//     }

//     //Main Function
//     public static void main(String args []){

//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter number a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter number b : ");
//         int b = sc.nextInt();

//         // Make the sum for the main function
//         int sum = calculateSum(a, b);
//             System.out.print("sum of given 2 number is : " + sum );
//     }
// }

// Make the sunction to multiply 2 numbers and return there product 

// import java.util.*;

// public class Fuctions {

//     // New Function
//     public static int printCalculateProduct (int a, int b){
//         int product = a*b;
//         System.out.println("The product of two number is: " + product);
//         return product;
//     }

//     // Main Function
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter b: " );
//         int b = sc.nextInt();

//         int product = printCalculateProduct(a, b);
//         // System.out.println(product);

//     }

// }

// Q. Find the factorial of number

    import java.util.*;

    public class Function {
        // New Function
        public static int calculateFactorial(int n) {

            int factorial = 1;
            for (int i = n; i > 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("The Factorial Of Given Number Is: " + factorial);
            return factorial;
        }

        // Main Class
        public static void main(String args[]) {
            // Take the input from user
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            // Call the function
            calculateFactorial(n);

        }
    }
