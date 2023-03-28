import java.util.Scanner;
public class VotingEligibilty {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age : ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        //checking for voting eligibilty
        if(age>=18)
        {
            System.out.println("Person is eligible for vote.");
        } else
        {
            System.out.println("Person is not eligible for vote.");
        }
    }
}