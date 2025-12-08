package 数组;

import java.util.Scanner;
import java.util.Arrays;

public class JAVA_16_3 {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ary.length ; i++) {
            ary[i] = scanner.nextInt();
        }

        //write your code here......
        Arrays.sort(ary);
        max = ary[ary.length-1];
        min = ary[0];
        System.out.println(max + " " + min);
    }
}