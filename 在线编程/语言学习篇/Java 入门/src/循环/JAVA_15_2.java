package 循环;

import java.util.Scanner;

public class JAVA_15_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //write code here......
        if (num <= 0) {
            System.out.print(num);
        } else {
            System.out.print((num + "").length());
        }
    }
}
