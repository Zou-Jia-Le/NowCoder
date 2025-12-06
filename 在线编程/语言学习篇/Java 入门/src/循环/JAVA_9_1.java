package 循环;

public class JAVA_9_1 {
    public static void main(String[] args) {

        //write your code here........
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            long num = 0;
            for (int j = 0; j <= i; j ++) {
                num += (long)(9 * Math.pow(10,j));
            }
            sum += num;
        }
        System.out.print(sum);
    }
}
