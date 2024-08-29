package org.example;
import java.util.Scanner;



public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("Selamat datang");

    }

    public void drawShape(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Masukkan Panjang segitiga siku-siku: ");
                int height = scanner.nextInt();
                drawTriagleSS(height);
                break;
            case 2:
                System.out.println("Masukkan Panjang segitiga sama kaki: ");
                int height2 = scanner.nextInt();
                drawTriagleSK(height2);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public void drawTriagleSS(int height) {
        //Nested loop
        for (int i = 1; i <= height; i++) { //Outer Loop untuk Row atau baris
            //inner Loop (Untuk colom)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void drawTriagleSK(int height) {
        //Nested loop
        for (int i = 1; i <= height; i++) { //Outer Loop untuk Row atau baris
            //inner Loop (Untuk colom)
            for (int j = height - i; j > 0; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

        }
    }

        public void run() {
            //Loop untuk terus menampilkan menu
            while (true) {
                displayMenu();
                System.out.println("Masukkan pilihan anda: ");
                int choice = scanner.nextInt();
                drawShape(choice);
                System.out.println();
            }
        }


        public static void main (String[]args){
            //Runner
            ShapeDrawer drawer = new ShapeDrawer();
            drawer.run();

        }
    }
