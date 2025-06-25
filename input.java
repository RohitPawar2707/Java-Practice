import java.util.*;

public class input {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number :");
        int b = scanner.nextInt();

        int sum = a + b ;
        System.out.println("The sum of a & b is : " + sum);


        String name = scanner.nextLine();
        System.out.println(name);

        boolean temperature = scanner.nextBoolean();
        System.out.println("THE TEMPERATURE IS : " + temperature);


        scanner.close();

    }
}