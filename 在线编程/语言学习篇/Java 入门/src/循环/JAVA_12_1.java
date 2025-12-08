package 循环;

import java.util.Scanner;

public class JAVA_12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float h = scanner.nextFloat();
        int n = scanner.nextInt();

        //write your code here......
        float sum = 0;
        if (n == 1) {
            sum = h;
            System.out.print(String.format("%.3f", h / 2) + " " + String.format("%.3f", sum));
        } else {
            int i = 1;
            sum += h;
            while (i < n) {
                sum += h * (2 / Math.pow(2,i));
                i++;
            }
            System.out.print(String.format("%.3f", h / Math.pow(2, n)) + " " + String.format("%.3f", sum) +" ");
        }
        //输出格式为：System.out.println(String.format("%.3f", h) + " " + String.format("%.3f", sum));
    }
}
