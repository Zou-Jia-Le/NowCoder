package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class JAVA_17_2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //write your code here......
        scanner.close();
        for(int i = 0; i < arr.length / 2; i++){
            arr[i] = arr[i] + arr[arr.length-1-i] - (arr[arr.length-1-i] = arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}