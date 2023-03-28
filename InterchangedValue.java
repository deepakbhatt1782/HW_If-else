import java.util.Scanner;

public class InterchangedValue {
    //calling main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a and b :" );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before interchanging the numbers a = " + a + " and b = " + b );

        //interchanging values
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After interchanging the numbers a = " + a + " and b = " + b );
    }
}
