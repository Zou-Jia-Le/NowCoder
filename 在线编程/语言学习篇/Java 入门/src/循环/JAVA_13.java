package 循环;

import java.util.Scanner;

public class JAVA_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write your code here......
        float sum = 0.0F;
        int count = 0;
        while (true) {
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            count++;
        }
        float avg = sum / count;
        System.out.println(String.format("%.2f",avg));
        //输出格式为：System.out.println(String.format("%.2f",avg));
    }
}