package 分支;

import java.util.Scanner;

public class JAVA_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        //write your code here......
        System.out.print(str.matches(emailMatcher) ? "邮箱格式合法" : "邮箱格式不合法");
    }
}
