package 循环;

import java.util.Scanner;

public class JAVA_14 {
    public static void main(String[] args) {
        JAVA_14 main = new JAVA_14();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(main.isPrimeNumber(number));
    }

    public Boolean isPrimeNumber(int number) {

        //write your code here......
        if (number != 2 && number % 2 == 0) {//先排除 1 以及 除 2 以外的偶数（题目已经要求输入大于 1）
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}