package JavaExamples;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table");
        int mul = sc.nextInt();
        for (int i = 1; i <= 20; i++) {

            System.out.println(mul + " * " + i + " = " + mul * i);

        }
    }
}
