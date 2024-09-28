package Topic06Exceptions;
import java.util.Scanner;

public class L00WithNoException{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        
        int number = sc.nextInt();
        System.out.println("Number = " + number);
    
        System.out.println("Program ends");
        sc.close();
    }
}
