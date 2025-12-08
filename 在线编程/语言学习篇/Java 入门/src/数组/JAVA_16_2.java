package 数组;

import java.util.Scanner;

public class JAVA_16_2 {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            ary[i] = scanner.nextInt();
        }

        //write your code here......
        min = max = ary[0];
        for (int num : ary) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        System.out.println(max + " " + min);
    }
}