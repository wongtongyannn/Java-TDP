import java.util.Scanner;

public class L06Scanner {
    public static void main(String[] args) {
        // a class is a predefined "container" (or "package")
        // that consists of data and functionality (i.e. methods)
        // in other words, a class provides some kind of feature or functionality
        // before we can use a class, we must create an object (an instance) of the class

        // 'sc' is a variable that can store objects (aka instances) of the class Scanner
        Scanner sc = new Scanner(System.in); // System.in => keyboard (by default)
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, "+ name);
        
        // ask the user for weight 
        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();

         // ask the user for height
         System.out.println("Enter your height (in m): ");
         double height = sc.nextDouble();

        // calculate the bmi
        double bmi = weight/ (height*height);

        System.out.println("Your BMI is "+ bmi);

        // if statements, need to check for both upper and lower limits
        if (bmi <18.5) {
            System.out.println("Underweight");
        }
        if (bmi >=18.5 && bmi <25) {
            System.out.println("Healthy Weight");
        }
        if (bmi >= 25 && bmi <30) {
            System.out.println("Overweight");
         } else {
                System.out.println("Obese");
         }

        //if/else-if statements, usually for range checking
         if (bmi <18.5) {
            System.out.println("Underweight");
         } else if (bmi<=25) {
            System.out.println("Normal Weight");
         } else if (bmi <=30) {
            System.out.println("Overweight");
         } else {
            System.out.println("Obese");
         }
         

    }
}