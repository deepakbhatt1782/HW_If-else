import java.util.Scanner;
public class NameOfCity {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet : ");
        ch = scanner.next().charAt(0);

        //printing city name according to the alphabet
        if (ch=='a'){
            System.out.println("Anand");
        } else if (ch=='b') {
            System.out.println("Baroda");
        }else if (ch=='c') {
            System.out.println("Chennai");
        }else if (ch=='d') {
            System.out.println("Delhi");
        }else if (ch=='e') {
            System.out.println("Exeter");
        }else if (ch=='f') {
            System.out.println("Florida");
        }else {
            System.out.println("Invalid Entry");
        }
    }
}
