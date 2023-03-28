import java.util.Scanner;
public class PosNegZero {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        number = scanner.nextInt();

        //check condition positive negative and zero
        if (number > 0)
        {
            System.out.println(number + " is positive number. : ");
        } else if ( number < 0)
        {
            System.out.println(number + " is negative number. : ");
        }
        else if ( number == 0)
        {
            System.out.println(number + " is zero number. : " );
        }
    }
}
