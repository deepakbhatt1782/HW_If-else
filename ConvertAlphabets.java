import java.util.Scanner;

public class ConvertAlphabets {
    public static void main(String[] args) {
        char ch,ch2;
        System.out.println("Enter any character ");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);

        if (ch>='A' &&  ch<= 'Z')
        {//converting uppercase to lowercase
            ch2 = Character.toLowerCase (ch);
            System.out.println("Lowercase " + ch2);
        }
        else
        {//converting lowercase to uppercase
            ch2 = Character.toUpperCase (ch);
            System.out.println("Uppercase " +  ch2);
        }
    }
}
