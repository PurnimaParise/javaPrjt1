package JavaExamples;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("How many rows : ");
        int row=scn.nextInt();
        System.out.println("Pattern : ");
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"");
            }
            System.out.println();
        }

    }
}
