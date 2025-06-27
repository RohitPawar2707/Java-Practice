// To take the input decleare the package 
import java.util.Scanner;

public class Conditions {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        
        //   *************************************************IF ELSE*********************************************************
        // System.out.println("Enter your age : ");
        // int age = sc.nextInt();
        // // CONDITION

        // if (age > 18){
        //     System.out.println("You are Adult");
        // }else{
        //     System.out.println("Your are not Adult");
        // }

        
      
        
        // //INITIALIZE THE VARIABLE
        // System.out.println("Enter the first number :");
        // int a = sc.nextInt();
        // System.out.println("Enter the secong number :");
        // int b = sc.nextInt();

        // //CONDITION
        // if (a==b){
        //     System.out.println("Equal");
        // }else{
        //     if (a>b){
        //         System.out.println("A is greater than b ");
        //     }else {
        //         System.out.println("A is less than b");
        //     }
        // }

       //*******************************************************ELSE IF********************************************************  
       
    //    System.out.println("Enter c : ");
    //    int c = sc.nextInt();
    //    System.out.println("Enter d :");
    //    int d = sc.nextInt();

    //    if (c==d){
    //     System.out.println("c is equal to d");
    //    } else if (c>b){
    //     System.out.println("c is greater than d ");
    //    }else if (c<d){
    //     System.out.println("C is less than d");
    //    }else{
    //     System.out.println("c is not queal to any number");
    //    }

    // ***************************************************SWITCH********************************************************** 
    System.out.print("Enter the number of button :");
    int button = sc.nextInt(); 

    switch(button){
        case 1 : System.out.println("Hello");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3: System.err.println("Bonjour");
        break;
        case 4 : System.out.println("Invalid Button ");
        break;
        default : System.out.println("Enter vallid button");
    }

    
    }
}