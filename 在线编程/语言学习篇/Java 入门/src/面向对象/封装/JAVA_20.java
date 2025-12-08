package 面向对象.封装;

import java.util.Scanner;

public class JAVA_20 {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }
}

class Person {
    private int age;

    //write your code here......
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > 200){
            this.age = 200;
        } else {
            this.age = age;
        }
    }
}
