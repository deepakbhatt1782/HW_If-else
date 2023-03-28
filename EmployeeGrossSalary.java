import java.util.Scanner;

public class EmployeeGrossSalary {
    public static void main(String[] args) {
        String name;
        int id, basicSalary , hra ,ta ,da ,pf, grossSalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        id = scanner.nextInt();
        System.out.println("Enter Employee Name : ");
        name = scanner.next();
        System.out.println("Enter Employee Basic Salary : ");
        basicSalary = scanner.nextInt();

        //calculating all deduction from gross pay
        // HRA = 10% of basic salary
        hra = (basicSalary * 10)/ 100;
        // DA = 8% of basic salary
        da = (basicSalary * 8)/ 100;
        // TA = 9% of basic salary
        ta = (basicSalary * 9)/ 100;
        // PF = 20% of basic salary
        pf = (basicSalary * 20)/ 100;
        grossSalary = basicSalary + hra + da + ta - pf;

        System.out.println("HRA is £"+hra);
        System.out.println("DA is £"+da);
        System.out.println("TA is £"+ta);
        System.out.println("PF is £"+pf);
        System.out.println("GrossSalary is £"+grossSalary);
    }
}
