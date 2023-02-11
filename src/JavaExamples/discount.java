package JavaExamples;
import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cost of 1 unit");
        int unit=sc.nextInt();
        System.out.println("Number of unit");
        int num=sc.nextInt();
        int value=unit*num;
        float dismat = 0;
        if(value>1000)
        {
            System.out.println("Amount before discount ::" +value);
            dismat = (float)(value * 10) / 100;
            System.out.println("Discount amt :" + dismat);
            float aftdis = value-dismat;
            System.out.println("Amount to be paid after Discount ::" + aftdis);
        }
        else
        {
            System.out.println("Amount to be paid::" + value);
        }
    }
    }
