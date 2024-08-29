package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Ferdinan";
        char q = 'Y';
        boolean flag = true;

        //Aritmetic Operation
        int result = a/b;
        int result2 = (int) (a+c);

        System.out.println(result);

        int timeStart = 9;
        int timeFinish = 18;
        int waktuMasuk = 10;
        int waktuPulang = 17;

        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish){
            System.out.println("Selamat anda sudah jadi CEO");
            System.out.println("Anda sampai" + (timeStart - waktuMasuk) + "jam lebih cepat");
        } else if (waktuMasuk <= timeStart && waktuPulang < timeFinish) {
            System.out.println("Wah cabut");
        } else {
            System.out.println("Selamat anda sudah jadi Komisaris");
        }


        System.out.println("Hello and welcome!");

        for (int i = 0; i <= 5; i++) {
            if (i ==4) {
                break;
            }
            System.out.println("i = " + i);
        }


        //Switch case
        int day = 0;

        switch (day){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            default:
                System.out.println("case default");
                break;
        }

        //loop
        for (int i = 1; i < 10; i = i+2) {
            if (i == 7){
                break;
            }
            System.out.println("Outer loop" + i);


            for (int j = 0; j <= 5 ; j++) {
                System.out.println(j+i);
            }
        }

    }
}