import java.util.*;

public class Homework5_3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input matrix dimension");
        int number;
        do {
            System.out.println("Input number>0 and number<11");
            number = scan.nextInt();
        } while (number < 1 && number >10);
        int[][] arr = initArray(number);
        System.out.println("Given array");
        printArray(arr, number);
        if(checkRows(arr, number)){
            System.out.println("Are same numbers on a row");
        }
        else{
            System.out.println("No same numbers on a row");
        }
        if(checkColumns(arr, number)){
            System.out.println("Are same numbers on a column");
        }
        else{
            System.out.println("No same numbers on a column");
        }
        if(checkMajorDiagonal(arr, number)){
            System.out.println("Are same numbers on the major diagonal");
        }
        else{
            System.out.println("No same numbers on the major diagonal");
        }
        if(checkSubDiagonal(arr, number)){
            System.out.println("Are same numbers on the sub-diagonal");
        }
        else{
            System.out.println("No same numbers on the sub-diagonal");
        }
    }

    public static int[][] initArray(int num) {
        //  method returns array
        Random rand = new Random();
        int[][] arr = new int[10][10];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j] = rand.nextInt(2);
            }
        }
        return arr;
    }

    public static boolean checkRows(int[][] arr, int num) {
        boolean t1;
        for (int i=0; i<num; i++){
            t1 = true;
            for(int j=0; j<num-1; j++){
                if(arr[i][j] != arr[i][j+1]){
                    t1 = false;
                    break;
                }
            }
            if (t1) { return true;}
        }
        return false;
    }
    public static boolean checkColumns(int[][] arr, int num) {
        boolean t2;
        for (int j=0; j<num; j++){
            t2 = true;
            for(int i=0; i<num-1; i++){
                if(arr[i][j] != arr[i+1][j]){
                    t2 = false;
                    break;
                }
            }
            if (t2) {return true;}
        }
        return false;
    }

    public static boolean checkMajorDiagonal(int[][] arr, int num) {
        for(int i=0; i<num-1; i++) {
            if (arr[i][i] != arr[i + 1][i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkSubDiagonal(int[][] arr, int num) {
        for(int i=0; i<num-1; i++) {
            if (arr[i][num-1-i] != arr[i + 1][num-1 - (i + 1)]) {
                return false;
            }
        }
        return true;
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