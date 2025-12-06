package 基本数据类型;

import java.util.Scanner;

public class JAVA_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(JAVA_1.typeConversion(d));
    }
    public static int typeConversion(double d){

        //write your code here......
        return (int)d;
    }
}