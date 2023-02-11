package JavaExamples;
import java.util.Scanner;
public class squareexample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length and breadth :");
        int a,i;
        a= scn.nextInt();
        i= scn.nextInt();
        System.out.println("Length : "+a+ " Breadth :" +i);
        if(a==i)
            System.out.println("Its a square");
        else
            System.out.println("Its a rectangle");

    }
}


