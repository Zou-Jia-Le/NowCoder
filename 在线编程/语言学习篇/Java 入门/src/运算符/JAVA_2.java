package 运算符;

import java.util.Scanner;

public class JAVA_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        //write your code here......
        if (b > a) {
            a = a + b - (b = a);//a、b 置换
        }
        System.out.printf("%d %d %d %d %d", a + b, a - b, a * b, a / b, a % b);
    }
}