import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Salary  : ");
        double sal = input.nextDouble();

        System.out.print("401(k)  : ");
        double k = input.nextDouble();

        System.out.print("Federal : ");
        double fed = input.nextDouble();

        System.out.print("State   : ");
        double state = input.nextDouble();

        double finalPay = sal * (1-k/100) * (1-(fed +state)/100) /24;
        System.out.print("\n$");
        System.out.printf("%,.2f", finalPay);
        System.out.println(".")
    }

}
