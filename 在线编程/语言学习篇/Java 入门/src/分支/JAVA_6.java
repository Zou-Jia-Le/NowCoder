package 分支;

import java.util.Scanner;

public class JAVA_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        //write your code here......
        double BMI = weight / (height * height);
        String result = BMI < 18.5 ? "偏瘦"
                : BMI < 20.9 ? "苗条"
                : BMI <= 24.9 ? "适中"
                : "偏胖";
        System.out.print(result);
    }
}
