package JavaExamples;
import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Salary");
        float sal = sc.nextFloat();
        System.out.println("Enter Employee service");
        float ser = sc.nextFloat();
        if (ser > 5) {
            float bonus = (sal * 5) / 100;
            float increase_sal = sal + bonus;
            System.out.println("Bonus amount ::" + bonus);
            System.out.println("Net amount ::" + increase_sal);
        }

    }

}
