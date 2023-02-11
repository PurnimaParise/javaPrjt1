package JavaExamples;

import java.util.Scanner;

public class grading_switch {
    public static void main(String[] args) {
        String grade=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        switch (marks/10)
        {
            case 10:
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
                case 7:
                    grade="C";
                    break;
            case 6:
                grade="D";
                break;
            case 5:
                grade="E";
                break;
            default:
                grade="F";
                break;
        }
        System.out.println("GRADE: "+grade);
    }
}
