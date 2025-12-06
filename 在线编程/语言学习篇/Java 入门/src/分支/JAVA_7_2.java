package 分支;

import java.util.Scanner;

public class JAVA_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade =scanner.next();

        //write your code here......
        System.out.print("A".equals(grade) ? "优秀"
                       : "B".equals(grade) ? "良好"
                       : "C".equals(grade) ? "及格"
                       : "D".equals(grade) ? "不及格"
                       : "未知等级");
    }
}