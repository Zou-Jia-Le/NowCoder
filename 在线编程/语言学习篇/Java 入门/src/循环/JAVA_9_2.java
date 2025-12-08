package 循环;

public class JAVA_9_2 {
    public static void main(String[] args) {

        //write your code here........
        long sum = 0;
        long num = 0;
        for(int i = 0; i < 10; i++){
            num += 9 * Math.pow(10, i);
            sum += num;
        }
        System.out.println(sum);
    }
}