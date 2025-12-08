package 循环;

import java.util.Scanner;

public class JAVA_15_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //write code here......
        int count = 0;
        if (num <= 0) {
            System.out.println(num);
        } else {
            while (num > 0) {
                count++;
                num /= 10;
            }
            System.out.println(count);
        }
    }
}
