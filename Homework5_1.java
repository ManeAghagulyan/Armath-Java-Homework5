import java.util.Scanner;

public class Homework5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input number >0");
            number = scan.nextInt();
        } while (number < 1);
        System.out.println("Patern 1");
        printImage1(number);
        System.out.println("Patern 2");
        printImage2(number);
    }

    public static void printImage1(int num) {
        //  method prints image1.a
        for(int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j < num - i-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 0; j < i; j++)
            {
               System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num-1; i++){
             for (int j = 0; j < num-1; j++) {
                 if (j <= i) {
                     System.out.print(" ");
                 } else {
                     System.out.print("*");
                 }
             }
             for (int j = 0; j < num - i -1; j++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
    }

    public static void printImage2(int num) {
        //  method prints image1.b
        for(int i = 0; i < num-1; i++) {
            for (int j = 0; j <= num; j++) {
                if (j < num - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j < num; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= num; j++)
            {
                if (j < num - i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}