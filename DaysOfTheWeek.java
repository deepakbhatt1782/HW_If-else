import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7.");
        day = scanner.nextInt();

        //printing days according to number.
        if(day==1)
        {
            System.out.println( "Sunday ");
        }
        else if (day==2)
        {
            System.out.println( "Monday ");
        }
        else if (day==3)
        {
            System.out.println( "Tuesday ");
        }
        else if (day==4)
        {
            System.out.println( "Wednesday ");
        }
        else if (day==5)
        {
            System.out.println( " Thursday ");
        }
        else if (day==6)
        {
            System.out.println( " Friday ");
        }
        else
        {
            System.out.println( " Saturday ");
        }
    }
}
