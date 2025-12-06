package 循环;

public class JAVA_9_3 {
    public static void main(String[] args) {

        //write your code here........
        String a = "9";
        long sum = 0;
        for(int i = 0;i<10;i++){
            sum = Long.parseLong(a) + sum;
            a = a + "9";
        }
        System.out.println(sum);
    }
}