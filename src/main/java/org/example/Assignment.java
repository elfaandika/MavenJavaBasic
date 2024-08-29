package org.example;
import java.util.Scanner;

public class Assignment {

    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("Welcome to ASCII Shape Drawer!\n\n");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");

    }

    public void drawShape(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter the height of triangle: ");
                int height = scanner.nextInt();
                drawTriagle(height);
                break;
            case 2:
                System.out.print("Enter the height of square: ");
                int height2 = scanner.nextInt();
                drawSquare(height2);
                break;
            case 3:
                System.out.print("Enter the rows of rectangle: ");
                int rows = scanner.nextInt();
                System.out.print("Enter the columns of rectangle: ");
                int columns = scanner.nextInt();
                drawRectangle(rows,columns);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public void drawTriagle(int n) {
        for (int i = 1; i <= n; i++) {  // Loop through each row
            // Print leading spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawSquare(int n) {
            for (int i = 1; i <= n; i++) {  // Loop for each row
                for (int j = 1; j <= n; j++) {  // Loop for each column
                    System.out.print("* ");
                }
                System.out.println();  // Move to the next line after each row
            }
    }

    public void drawRectangle(int rows, int columns) {
            for (int i = 1; i <= rows; i++) {  // Loop for each row
                for (int j = 1; j <= columns; j++) {  // Loop for each column
                    System.out.print("* ");
                }
                System.out.println();  // Move to the next line after each row
            }
    }

    public void run() {
        //Loop untuk terus menampilkan menu
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }
    }


    public static void main (String[]args){
        //Runner
        Assignment drawer = new Assignment();
        drawer.run();

    }





}
