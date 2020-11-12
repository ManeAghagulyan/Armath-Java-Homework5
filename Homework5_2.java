import java.util.Scanner;

public class Homework5_2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input matrix dimension");
        int number;
        do {
            System.out.println("Input number>0 and number<11");
            number = scan.nextInt();
        } while (number < 1 && number >10);
        int[][] arr = inputArray(number);
        System.out.println("Given array");
        printArray(arr, number);
        arr = transpose(arr, number);
        System.out.println("Transposed array");
        printArray(arr, number);
    }

    public static int[][] inputArray(int num) {
        //  method returns array
        int[][] arr = new int[10][10];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("Input arr[" + i + "][" + j + "] = ");
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static int[][] transpose(int[][] arr, int num) {
        int[][] ar1 = new int[10][10];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
               ar1[j][i] = arr[i][j];
            }
        }
        return ar1;
    }
    public static void printArray(int[][] arr, int num) {
        //  method prints array
        for (int i=0; i< num; i++){
            for(int j=0; j< num; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}