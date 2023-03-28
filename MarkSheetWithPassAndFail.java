import java.util.Scanner;
public class MarkSheetWithPassAndFail {
    // calling main method
    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name : ");
        name = scanner.next();
        System.out.println("Enter student roll number : ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter marks for Maths : ");
        int maths = scanner.nextInt();
        System.out.println("Enter marks for Sci : ");
        int sci = scanner.nextInt();
        System.out.println("Enter marks for Eng : ");
        int eng = scanner.nextInt();

        //counting total of all subjects
        int total = maths + sci + eng;

        //counting percentage
        float percentage = (float) total / 3;
        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        //declaring pass and fail
        if ((maths>=35) && (sci>=35) && (eng>=35))
        {
            System.out.println(name + " is passed .");
        }
        else
        {
            System.out.println(name + " is failed .");
        }
    }
}
