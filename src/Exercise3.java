import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Height : ");
        double heightr = input.nextDouble();

        System.out.print("Width : ");
        double widthr = input.nextDouble();

        heightr= heightr *25.4;
        widthr = widthr*25.4;
        double totalarea = heightr * widthr;

        System.out.printf("%,.2f", totalarea);
        System.out.println(" square millimeters");

    }
}
