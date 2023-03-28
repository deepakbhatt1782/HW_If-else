import java.util.Scanner;

public class LeapYear {
    // calling main method
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year : ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        // year divided by 400 and divided by 4 and not divided by 100 is a leap year
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Year " + year + " is a leap year.");
        }else {
            System.out.println("Year " + year + " is not a leap year.");
        }
    }
}
