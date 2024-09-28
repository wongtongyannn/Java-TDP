package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Drawable interface to be implemented by shapes and text labels
interface Drawable {
    void displayInfo();
}

// Abstract Shape class, now implementing Drawable
abstract class Shape implements Drawable {
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

// TextLabel class representing a text label, implementing Drawable
class TextLabel implements Drawable {
    private String fontFamily;
    private int fontSize;
    private int x;
    private int y;
    private String text;

    public TextLabel(String fontFamily, int fontSize, int x, int y, String text) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void displayInfo() {
        System.out.println("TextLabel - Font Family: " + fontFamily + ", Font Size: " + fontSize
                + ", Top-left: (" + x + ", " + y + "), Text: \"" + text + "\"");
    }
}

    // VectorDrawingApp class to manage shapes, text labels and drawables
public class AddTextLabels {
    private List<Drawable> drawables; // List to store drawable objects (shapes and text labels)

    public AddTextLabels() {
        drawables = new ArrayList<>();
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

        drawables.add(new Rectangle(x, y, length, width));
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

        drawables.add(new Circle(centerX, centerY, radius));
        System.out.println("Circle added successfully!\n");
    }

    // method to create a text label
    public void createTextLabel(Scanner scanner) {
        System.out.print("Enter font family: ");
        scanner.nextLine();  // Clear buffer
        String fontFamily = scanner.nextLine();
        System.out.print("Enter font size: ");
        int fontSize = scanner.nextInt();
        System.out.print("Enter top-left X coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter top-left Y coordinate: ");
        int y = scanner.nextInt();
        System.out.print("Enter the text: ");
        scanner.nextLine();  // Clear buffer
        String text = scanner.nextLine();

        drawables.add(new TextLabel(fontFamily, fontSize, x, y, text));
        System.out.println("Text label added successfully!\n");
    }

    // method to list all drawables
    public void listDrawables() {
        if (drawables.isEmpty()) {
            System.out.println("No drawable objects available.");
        } else {
            System.out.println("\nListing all drawable objects:");
            for (int i=0; i<drawables.size(); i++) {
                System.out.print((i+1)+ ". ");
                drawables.get(i).displayInfo();
            }
        }
        System.out.println();
    }

    // method to create a drawable object (Rectangle, Circle or TextLabel)
    public void createDrawable(Scanner scanner) {
        System.out.println("Choose the drawable to create");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Text Label");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                createRectangle(scanner);
                break;
            case 2:
                createCircle(scanner);
                break;
            case 3: 
                createTextLabel(scanner);
                break;
            // when user did not enter valid options
            default: 
                System.out.println("Invalid option. Please choose again!\n");
        }
    }

// main program loop
public void run() {
    Scanner scanner = new Scanner(System.in);

    while(true) {
        System.out.println("Menu");
        System.out.println("1. Create Drawble");
        System.out.println("2. List Drawables");
        System.out.println("3. Quit");
        System.out.print("Choose an option: ");

        String choice = scanner.next();

        // switch is to execute a particular code block when a certain condition is met
        switch(choice) {
            case "1":
                createDrawable(scanner);
                break;
            case "2":
                listDrawables();
                break;
            case "3":
                System.out.println("Exiting the program.");
                scanner.close();
                return;
            default:
            System.out.println("Invalid option. Please choose again. \n");
        }
    }
}

public static void main(String[] args) {
    AddTextLabels app = new AddTextLabels();
    app.run();
}
}