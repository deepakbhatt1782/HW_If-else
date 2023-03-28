import java.util.Scanner;

public class CalculationAsRequired {
    public static void main(String[] args) {
        float a,b;
        String symbol;
        System.out.println("Enter value of a and b : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Enter any symbol from + , - , / , * : ");
        symbol = scanner.next();

        //calculating the value as per user requirement
        if (symbol.equals("+"))
        {
            System.out.println("Addition of a and b is : " + (a + b));
        }
        else if (symbol.equals("-"))
        {
            System.out.println("Subtraction of a and b is : " + (a - b));
        }
        else if (symbol.equals("/"))
        {
            System.out.println("Division of a and b is : " + (a / b));
        }
        else if (symbol.equals("*"))
        {
            System.out.println("Multiplication of a and b is : " + (a * b));
        }
    }
}
