package 循环;

import java.util.*;

public class JAVA_10 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        //write your code here......
        while (scanner.nextInt() > 0) {
            count ++;
        }
        System.out.print(count);
    }
}