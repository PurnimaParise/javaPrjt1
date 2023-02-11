package JavaExamples;
import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        int a , b;
        Scanner grt = new Scanner(System.in);
        System.out.println("Enter value of a :" );
        a = grt.nextInt();
        System.out.println("Enter value of b :" );
        b = grt.nextInt();
        if(a>b)
            System.out.println("a is greater than b");
            else
            System.out.println("b is greater");
    }
}
