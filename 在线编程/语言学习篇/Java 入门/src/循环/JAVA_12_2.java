package 循环;

import java.util.Scanner;

public class JAVA_12_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        int n =scanner.nextInt();

        //write your code here......
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += h;
            h /= 2;
            if (i == n - 1) {
                System.out.println(String.format("%.3f", h) + " " + String.format("%.3f", sum));
            }
            sum += h;
        }
    }
}
