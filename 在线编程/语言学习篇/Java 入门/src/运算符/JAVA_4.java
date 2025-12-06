package 运算符;

import java.util.Scanner;

public class JAVA_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //write your code here.......
        a = a + b - (b = a);//a、b 置换
        System.out.println(a + " " + b);
    }
}
