import java.util.Scanner;
public class MarkSheetWithPercentageAndGrade {
    // calling main method
    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name : " );
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
        int total = maths+sci+eng;

        //counting percentage
        float percentage = (float) total/3;
        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        //declaring grade of the student with percentage
        if (percentage >= 80)
        {
            System.out.println(name + " is passed and achieved A+ grade with "+ percentage + "%");
        }
        else if (percentage >=60)
        {
            System.out.println(name + " is passed and achieved A grade with "+ percentage + "%");
        }
        else if (percentage >=50)
        {
            System.out.println(name + " is passed and achieved B grade with "+ percentage + "%");
        }
        else if (percentage >=35)
        {
            System.out.println(name + " is passed and achieved C grade with "+ percentage + "%");
        }
    }
}
