package org.example;

//Overloading
class Operation{

    public int add(int a, int b){
        return a+b;
    }

    //Overloading: ubah int menjadi double
    public double add(double a, double b){
        return a+b;
    }

    //Overloading: Parameter menjadi 3 int
    public int add(int a, int b, int c){
        return a+b+c;
    }
}

//Overriding
class MultiplyOverride extends Operation{
    @Override
    public  int add (int a, int b){
        return a*b; //Melakukan Override operasi diganti menjadi perkalian
    }


}


public class PolyMorphism {



    public static void main(String[] args) {
        Operation op = new Operation();
        Operation MulOv = new MultiplyOverride();

        int result1 = op.add(5,10);
        double result2 = op.add(5.1,10.3);
        int result3 = op.add(5,10,15);

        int result4 = MulOv.add(5,5);

        System.out.println("Operation (5,10): " + result1);
        System.out.println("Operation (5 x 5): " + result4);


        try{
            int result = 10/0;
        } catch (Exception e) {
            System.out.println("Caught AritmaticExecption " + e.getMessage());

        }

        try{
            int[] arr = new int[5];
            int index = arr[10];;
        } catch (Exception e) {
            System.out.println("Caught ArrayaIndexOutOfBoundsException " + e.getMessage());
        }

        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            System.out.println("Caught NullPointerException " + e.getMessage());
        }

        try {
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException " + e.getMessage());
        }

        try {
            Thread t = new Thread();
            t.start();
            t.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught StringIndexOutOfBoundsException " + e.getMessage());
        }


    }
}
