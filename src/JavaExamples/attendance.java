package JavaExamples;

import java.util.Scanner;
public class attendance {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Number of classes held");
    float held=sc.nextFloat();
        System.out.println("Number of classes attended");
    float atten=sc.nextFloat();
    float percent=(atten/held)*100;
       System.out.println(percent+"%");
        if(percent>=75)
    {
        System.out.println("Student allowed to exam");
    }
        else
    {
        System.out.println("Student can't attend the exam ");
    }

}
}
