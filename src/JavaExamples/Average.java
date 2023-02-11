package JavaExamples;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       System.out.println("Enter number of Integers to be entered : ");
       int count= scn.nextInt();
        for (int i=1;i<=count;i++){
            System.out.println(scn.nextInt());
            System.out.println();
            int average = (i/4);
            System.out.println("your average is"+average);

        }
    }
}
