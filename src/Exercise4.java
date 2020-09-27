import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Height : ");
        double heightr = input.nextDouble();

        System.out.print("Width : ");
        double widthr = input.nextDouble();

        heightr = heightr * 2.54;
        widthr = widthr *2.54;

        double totalperimiter= 2*heightr + 2*widthr;
        System.out.printf("%,.2f", totalperimiter);
        System.out.println(" centimeters");
}
