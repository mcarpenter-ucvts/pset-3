import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Homework 1 : ");
        int firstHw = input.nextInt();

        System.out.print("Homework 2 : ");
        int secondHw = input.nextInt();

        System.out.print("Homework 3 : ");
        int thirdHw = input.nextInt();

        System.out.print("Quiz 1     : ");
        int firstQz = input.nextInt();

        System.out.print("Quiz 2     : ");
        int secondQz = input.nextInt();

        System.out.print("Test 1     : ");
        int firstTest = input.nextInt();

        double averageGrade = 0.15 * (firstHw + secondHw + thirdHw)/3 + 0.35 * (firstQz + secondQz)/2 + 0.5 * firstTest;

        System.out.print("\n");
        System.out.printf("%.2f", averageGrade);
        System.out.println("%")
    }
}