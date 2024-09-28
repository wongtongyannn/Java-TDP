package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// abstarct Shape class
abstract class Shape {
    public abstract void displayInfo();
    public abstract void edit(Scanner scanner);
    public abstract double getArea();
}

// Rectangle class, inheriting from Shape 
class Rectangle extends Shape {
    private int x;
    private int y;
    private int length;
    private int width;

    public Rectangle (int x, int y, int length, int width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    @Override 
    public void displayInfo() {
        int bottomRightX = x + length;
        int bottomRightY = y + width;
        System.out.println("Rectangle- Top-left: (" + x+","+y+"), "
        + "Bottom-right: (" + bottomRightX+ ","+bottomRightY+ "), "
        + "Length: "+ length + ", Width: "+ width+ ", Area"+ getArea());
    }

    @Override
    public void edit(Scanner scanner) {
        System.out.println("Enter new top-left X coordinate: ");
        x = scanner.nextInt();
        System.out.println("Enter new top-left Y coordinate: ");
        y = scanner.nextInt();
        System.out.println("Enter new length of the rectangle: ");
        length = scanner.nextInt();
        System.out.println("Enter new width of the rectangle: ");
        width = scanner.nextInt();
    }

    @Override
    public double getArea() {
        return length*width;
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle (int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle- Center: ("+ centerX + ", "+ centerY+ "), "
        + "Radius: "+radius +", Area: "+ getArea());
    }

    @Override 
    public void edit(Scanner scanner) {
        System.out.println("Enter new center X coordinate: ");
        centerX = scanner.nextInt();
        System.out.println("Enter new center Y coordinate: ");
        centerY = scanner.nextInt();
        System.out.println("Enter new radius: ");
        radius = scanner.nextInt();
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}

// Handling Different Kind Of Shapes class to manage Shapes
public class HandlingDifferentKindOfShapes {
    private List<Shape> shapes; // List to store shapes

    public HandlingDifferentKindOfShapes() {
        shapes = new ArrayList<>();
    }

    // method to create a rectangle
    public void createRectangle(Scanner scanner) {
        System.out.println("Enter top-left X coordinate: ");
        int x = scanner.nextInt();
        System.out.println("Enter top-left Y coordinate: ");
        int y = scanner.nextInt();
        System.out.println("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter width of the rectangle: ");
        int width = scanner.nextInt();

        shapes.add(new Rectangle(x, y, length, width));
        System.out.println("Rectangle added successfully!\n");
    }

       // method to create a circle
       public void createCircle(Scanner scanner) {
            System.out.println("Enter center X coordinate: ");
            int centerX = scanner.nextInt();
            System.out.println("Enter center Y coordinate: ");
            int centerY = scanner.nextInt();
            System.out.println("Enter radius: ");
            int radius = scanner.nextInt();

        shapes.add(new Circle(centerX, centerY, radius));
        System.out.println("Circle added successfully!\n");
    }

    // Method to list all shapes
    public void listShapes() {
        if (shapes.isEmpty()) {
            System.out.println("No shapes available.");
        } else {
            System.out.println("\nListing all shapes:");
            for (int i=0; i<shapes.size(); i++) {
                System.out.print((i+1)+ ". ");
                shapes.get(i).displayInfo();
            }
        }
        System.out.println();
    }

    // Method to edit a shape
    public void editShape(Scanner scanner) {
        listShapes();
        if (!shapes.isEmpty()) {
            System.out.println("Select shape number to edit: ");
            int choice = scanner.nextInt();
            if (choice > 0 && choice <= shapes.size()) {
                shapes.get(choice-1).edit(scanner);
                System.out.println("Shapes updated successfully!\n");
            } else {
                System.out.println("Invalid selection. \n");
            }
        }
    }

    // Method to create a shape (Rectangle or Circle)
    public void createShape(Scanner scanner) {
        System.out.println("Choose the shape to create");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                createRectangle(scanner);
                break;
            case 2:
                createCircle(scanner);
                break;
            // when user did not enter valid options
            default: 
                System.out.println("Invalid option. Please choose again!\n");
        }
    }

    // Main program loop
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Menu");
            System.out.println("1. Create Shapes");
            System.out.println("2. List Shapes");
            System.out.println("3. Edit Shape");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            String choice = scanner.next();

            // switch is to execute a particular code block when a certain condition is met
            switch(choice) {
                case "1":
                    createShape(scanner);
                    break;
                case "2":
                    listShapes();
                    break;
                case "3":
                    editShape(scanner);
                    break;
                case "4":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                System.out.println("Invalid option. Please choose again. \n");
            }
        }
    }

    public static void main(String[] args) {
        HandlingDifferentKindOfShapes app = new HandlingDifferentKindOfShapes();
        app.run();
    }
}
