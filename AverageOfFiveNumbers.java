import java.util.Scanner;

public class AverageOfFiveNumbers {
    public static void main(String[] args) {
        int a,b,c,d,e;
        float average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b : ");
        b = scanner.nextInt();
        System.out.println("Enter the value of c : ");
        c = scanner.nextInt();
        System.out.println("Enter the value of d : ");
        d = scanner.nextInt();
        System.out.println("Enter the value of e : ");
        e = scanner.nextInt();

        //calculating average
        average = (float)(a+b+c+d+e)/5;
        System.out.println("Average of five numbers is :" + average);
    }
}
