// ******************************************************************GET BIT**********************************************************************

//[ Get the 3rd bit (Position=2) of a number n (n=0101)]

// public class Bit {
//     public static void main(String[] args) {

//         int n = 10;
//         int pos = 3;
//         // Step 1 >- Perform the bitMask operation 
//         int bitMask = 1 << pos;

//         // Step 2 >- Perform the AND operation
//         if ((bitMask & n) == 0) {
//             System.out.println("Bit is zero bit.");

//         } else {
//             System.out.println("bit is Non-zero bit.");
//         }
//     }
// }
//******************************************************************SET BIT*****************************************************************

//Q. Set the 2nd bit (Position=1) of n=0101 >- 5

// public class Bit {
//     public static void main(String[] args) {

//         int n = 5;
//         int Position = 1;

//         int bitMask = 1 << Position;

//         // Operation that i need to perform (OR Operation)
//         int newNumber = bitMask | n;
//         System.out.println(newNumber);
//     }
// }

//*****************************************************************CLEAR BIT*************************************************************** */
// public class Bit {
//     public static void main(String[] args) {

//         int n = 4 ;
//         int Position = 2;

//         int bitMask = 1<<2;
//         // Perform the AND with NOT operation 

//         // NOT Operation of bitMask
//         int notbitMask = ~ (bitMask);

//         int newNumber = notbitMask & n;
//         System.out.println(newNumber);

//     }
// }

//****************************************************************UPDATE BIT************************************************************* */
import java.util.*;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operation = sc.nextInt();

        int n = 7;
        int Position = 2;
        int bitMask = 1 << Position;

        if (operation == 1) {
            // Perform the Set operation---
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {

            int newBitMask = ~(bitMask);
            int newNumber = bitMask & n;
            System.out.println(newNumber);
        }

    }
}