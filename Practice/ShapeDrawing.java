package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Rectangle {
    private int x;
    private int y;
    private int length;
    private int width;

// constructors
public Rectangle(int x, int y, int length, int width) {
    this.x = x;
    this.y = y;
    this.length = length;
    this.width = width;
}

// getters
public int getBottomRightX() {
    return this.x + this.length;
}

public int getBottomRightY() {
    return this.y + this.width;
}

@Override
public String toString() {
    return "Top left coordinate: (" + x + "," + y + ")" + ", "
    + "Bottom Right coordinate: (" + getBottomRightX()+ ", " + getBottomRightY() + ")" + ", "
    + "Length: " + length + ", " + "Wdith: " + width; 
}
}

public class ShapeDrawing {
    private List<Rectangle> rectangles;

    // create a list
    public ShapeDrawing() {
        rectangles = new ArrayList<>();
    } 

    // ask user to provide input
    public void addRectangle(Scanner scanner) { 
        try {
            System.out.print("Enter top-left coordiante X: ");
            int x = scanner.nextInt();

            System.out.print("Enter top-left coordiante Y: ");
            int y = scanner.nextInt();

            System.out.print("Enter length of the rectangle: ");
            int length = scanner.nextInt();

            System.out.print("Enter width of the rectangle: ");
            int width = scanner.nextInt();
            
            Rectangle rectangle = new Rectangle(x, y, length, width);
            rectangles.add(rectangle);
            System.out.println("Rectangle added successfully!\n");

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers for coordinates, lenghth and width.\n");
            scanner.nextLine(); //clear input buffer
        }
    }

    // use of if-else method to add rectangles into the list
    // if list not empty, use for loop method to list all rectangles
    public void listRectangles() {
        if (rectangles.isEmpty()) {
            System.out.println("No rectangles available.");
        } else {
            System.out.println("\nlisting all rectangles: ");
            for (int i = 0; i < rectangles.size(); i++) {
                System.out.println((i+1) + ", " + rectangles.get(i));
            }
        }
        System.out.println();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // create a while loop, allows the user to enter a shape, list all shapes and to quit the program
        // println will display the message on a new line, while print() will print the message on the same line
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add Rectangle");
            System.out.println("2. List Rectangles");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");

            String choice = scanner.next();

            // switch is to execute a particular code block when a certain condition is met
            switch(choice) {
                case "1":
                    addRectangle(scanner);
                    break;
                case "2":
                    listRectangles();
                    break;
                case "3":
                    System.out.println("Exit the program.");
                    scanner.close();
                    return;

                // when user did not enter valid options
                default: 
                    System.out.println("Invalid option. Please choose again!\n");
            }
        }
    }
// main method to start the program
public static void main(String[] args) {
    ShapeDrawing app = new ShapeDrawing();
    app.run();
    }
}



