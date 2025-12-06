package 分支;

import java.util.*;

public class JAVA5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;

        //write your code here......
        cost = (int)(price >= 5000 ? price * 0.6F
                   : price >= 2000 ? price * 0.7F
                   : price >= 500 ? price * 0.8F
                   : price >= 100 ? price * 0.9F
                   : price * 1.0F);
        System.out.println(cost);
    }
}