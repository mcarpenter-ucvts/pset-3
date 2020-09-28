import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Students : ");
        int studentsTotal= input.nextInt();

        System.out.print("Teachers : ");
        int teachersTotal= input.nextInt();

        System.out.print("Capacity : ");
        int busCapacity = input.nextInt();

        int busNum = (studentsTotal + teachersTotal + busCapacity -1) / busCapacity;
        int busOverflow = (studentsTotal + teachersTotal)% busCapacity;

        System.out.printf("\n");
        System.out.print("Buses required      : " + busNum);
        System.out.print("\nOverflow passengers : " + busOverflow)
    }
}
