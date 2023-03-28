import java.util.Scanner;

public class FindTypeOfValue {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        ch = scanner.next().charAt(0);

        //checking for alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("Entered Character is an Alphabet.");
        }
        //checking for numbers
        else if (ch >= '0' &&  ch <= '9')
        {
            System.out.println("Entered Character is Number.");
        }
        else
        //checking for symbols
        {
            System.out.println("Enter Character is Symbol.");
        }
    }
}
