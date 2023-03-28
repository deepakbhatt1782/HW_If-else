import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        int id,salesAmount,salaryBasic;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales ID : ");
        id = scanner.nextInt();
        System.out.println("Enter seller's Name : ");
        name = scanner.next();
        System.out.println("Enter sales amount : ");
        salesAmount = scanner.nextInt();
        System.out.println("Enter Employee salary basic : ");
        salaryBasic = scanner.nextInt();

        if(salaryBasic >= 50000)
        {   //on 50000 and above sales commission is 35%
            System.out.println("Sales commission = " + (50000 * 35)/100);
        }
        else if (salaryBasic >= 30000)
        {   //on 30000 and above sales commission is 20%
            System.out.println("Sales commission = "+ (30000 * 20)/100);
        }
        else if (salaryBasic >= 20000)
        {   //on 20000 and above sales commission is 10%
            System.out.println("Sales commission = " + (20000 * 10) / 100);
        }
        else if (salaryBasic >= 10000)
        {  //on 10000 and above sales commission is 5%
            System.out.println("Sales commission = " + (10000 * 5) / 100);
        }
        else if (salaryBasic < 10000)
        {  //on below than 10000 sales commission is 2%
            System.out.println("Sales commission = " + (10000 * 10) / 100);
        }
    }
}
