import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Wage      : ");
        double wage = input.nextDouble();

        System.out.print("Monday    : ");
        double hrsMon = input.nextDouble();

        System.out.print("Tuesday   : ");
        double hrsTue = input.nextDouble();

        System.out.print("Wednesday : ");
        double hrsWed = input.nextDouble();

        System.out.print("Thursday  : ");
        double hrsThu = input.nextDouble();

        System.out.print("Friday    : ");
        double hrsFri = input.nextDouble();

        System.out.print("Saturday  : ");
        double hrsSat = input.nextDouble();

        System.out.print("Sunday    : ");
        double hrsSun= input.nextDouble();

        double grossPay = wage * (hrsMon + hrsTue +hrsWed +hrsThu +hrsFri +hrsSat +hrsSun);
        System.out.print("\n$");
        System.out.printf("%.2f", grossPay);
        System.out.println(".");
    }

}