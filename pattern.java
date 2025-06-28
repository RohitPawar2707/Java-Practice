// Q.1 Print the pattern (Solid rectangle)

// import java.util.*;
// public class pattern {
//     public static void main (String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the value of n : ");
//         int n = sc.nextInt();
//         System.out.println("Enter the value of m :");
//         int m = sc.nextInt();

//         for (int i = 1; i <=n; i++){
//             for (int j = 1; j <=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     } 
// }

// Q.2 Print the Rectangle (Hollow Rectangle)

// public class pattern{
//     public static void main (String args [] ){
//         int n = 4;
//         int m = 5; 

//         //Outer loop 
//         for (int i=1; i<=n; i++){
//             // Inner loop 
//             for (int j=1; j<=m; j++){
//                 //Cell >- (i,j)
//                 if (i==1 || j==1 || i==n || j==m) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

// }

// Q.3 Print the (Half Pyramid)



// public class pattern {
//     public static void main (String args [] ){

//         int n = 5;
//         //Outer loop
//         for (int i=1; i<=n; i++){
//             //Outer 
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }

// Q.4 Print the pattern ( inverted Half Pyramid )

// public class pattern {
//     public static void main (String args [] ){
 
//         //Outer loop
//         for (int i=n; i>=1; i--){
//             //Outer 
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }

// Q.5 Print the pattern Inverted half pyramid (Rotated by 180 degree)

// / public class pattern{
//     public static void main(String[] args) {
        
//         int n=4;
        
//         //Outer loop 
//         for (int i=1; i<=n; i++){

//             //Inner loop for printing the space
//             for (int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             // Inner loop for printing the *
//             for (int j=1; j<=i; j++){
//                 System.out.print("1");
//             }
//             System.out.println();
            
//         }
//     }
// }

// Q.6 Print the pattern (Number Oyramid)

// public class pattern {
//     public static void main (String args []){

//         int n = 5 ;

//         // Outer loop
//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Print the pyramid (Inverted by 180 degree)

// public class pattern{
//     public static void main(String[] args) {
        
//         int n=5;

//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=n-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Q.8 Print the pattern (Floyds triangle)
 
public class pattern {
    public static void main (String args []){

        int n=5;
        int number = 1;

        //Outer loop 
        for (int i=1; i<=n; i++){ 
            for (int j=1; j<=i; j++);

            System.out.print(number);
            number ++;

        }
        System.err.println();
    }
}
