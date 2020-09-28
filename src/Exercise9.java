import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Amount : ");
        double amountTotal = input.nextDouble();

        int maxQuarters = (int)((amountTotal-amountTotal % 0.25)/0.25);
        amountTotal = amountTotal - maxQuarters * 0.25;

        int maxDimes = (int)((amountTotal-amountTotal % 0.1)/0.1);
        amountTotal = amountTotal - maxDimes * 0.1;

        int maxNickels = (int)((amountTotal-amountTotal % 0.05)/0.05);
        amountTotal = amountTotal - maxNickels * 0.05;

        int maxPennies = (int)((amountTotal-amountTotal % 0.01)/0.01);

        System.out.printf("\n");
        System.out.printf("Quarters : " + maxQuarters + "\nDimes    : " + maxDimes + "\nNickels  : " + maxNickels + "\nPennies  : " + maxPennies)

    }
}
