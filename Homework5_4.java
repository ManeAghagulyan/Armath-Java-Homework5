import java.util.*;

public class Homework5_4 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input matrix dimension");
        int number;
        do {
            System.out.println("Input number>0 and number<11");
            number = scan.nextInt();
        } while (number < 1 && number >10);
        int[][] arr1 = initArray(number);
        System.out.println("Given array 1");
        printArray(arr1, number);
        int[][] arr2 = initArray(number);
        System.out.println("Given array 2");
        printArray(arr2, number);
        int[][] arr3 = sumArrays(number, arr1, arr2);
        System.out.println("New array");
        printArray(arr3, number);
    }

    public static int[][] initArray(int num) {
        //  method returns array
        Random rand = new Random();
        int[][] arr = new int[10][10];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j] = rand.nextInt(200)-100;
            }
        }
        return arr;
    }
    public static int[][] sumArrays(int num, int[][] ar1, int[][] ar2) {
        //  method returns aum of given arrays
        Random rand = new Random();
        int[][] arr = new int[10][10];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        return arr;
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