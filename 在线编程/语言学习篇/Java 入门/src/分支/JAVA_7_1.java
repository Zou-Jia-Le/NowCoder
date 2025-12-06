package 分支;

import java.util.Scanner;

public class JAVA_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade =scanner.next();

        //write your code here......
        switch (grade) {
            case "A" :
                System.out.print("优秀");
                break;
            case "B" :
                System.out.print("良好");
                break;
            case "C" :
                System.out.print("及格");
                break;
            case "D" :
                System.out.print("不及格");
                break;
            default :
                System.out.print("未知等级");
        }
    }
}