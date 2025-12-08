package 循环;

import java.util.*;

public class JAVA_11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    //求最小公倍数
    public static int getCM (int m, int n) {
        //write your code here......
        if (m == 0 || n == 0) {
            return 0;
        } else {
            return (m * n) / GCD(m, n);
        }
    }

    //求最大公约数
    public static int GCD (int m, int n) {
        int x = Math.max(m, n);
        int y = Math.min(m, n);

        while (x % y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return y;
    }
}