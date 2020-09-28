
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double fDegrees = input.nextDouble();

        double cDegrees = (fDegrees-32)*5/9;
        double kDegrees = (cDegrees+273.15);

        System.out.printf("\n");
        System.out.printf("Celsius    : %,.2f", cDegrees);
        System.out.printf("\nKelvin     : %,.2f", kDegrees )

    }
}
