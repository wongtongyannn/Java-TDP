import java.util.Scanner;

public class L07Branching {
    public static void main (String[] args) {
        // ask user to enter a password
        // assume the password is rotiprata123
        Scanner sc = new Scanner(System.in);

        // String password = sc.next();
        // capture the input as string, but enter and spaces round as end of line

        String password = sc.nextLine();
        System.out.println("Password= "+ password);

        // use .equals() method
        // Strings are objects, npt primitive values (to compare objects, we use .equals())
        // in Java, we use "==" only for primitive values (int, char, boolean, double, float etc.) 
        if (password.equals("snow white")){
            System.out.println("User has logged in successful");
         } else {
            System.out.println("Invalid password");
         } 
        }
    }
