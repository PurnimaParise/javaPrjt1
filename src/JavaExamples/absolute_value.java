package JavaExamples;

import java.util.Scanner;

import static java.lang.Math.abs;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one value");
        int num=sc.nextInt();
        int a=abs(num);
        System.out.println("Absolute value : "+ a);
    }
}
