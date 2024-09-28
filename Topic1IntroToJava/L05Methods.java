public class L05Methods {
    // the main method is starting point of all your Java programs
    // it is automatically by Java when you run a Java program 
    // dont name any of your methods as 'main'
    public static void main(String[] args) {

    }

    // method that takes two integers as parameters and return their sum
    public static int addTwoNunbers(int x, int y) {
        int sum = x + y;
        return sum; // result of addTwoNumbers is the sum of x and y
    }

    // define a method named calculateGST
    // takes in two parameters, the mount to pay and the gst percentage
    public static double calculateGST(double amount, double gstPercentage) {
        return amount * gstPercentage;
    }

    // define a method named calculatePerimeter
    // what will be the parameters, and what will be the return data types
    // and how do you calculate the perimeter
    public static float calculatePerimeter(int length, int width) {
        return 2* (length + width);
    }

    // if your method doesnt return a value
    public static void sayHello() {
        System.out.println("Hello World");
    }
}