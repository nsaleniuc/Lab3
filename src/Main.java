import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNum;
        String cont = "y";
        int numberOfSpaces = 11;

        Scanner scan = new Scanner(System.in);

        while (cont.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer:");
            userNum = scan.nextInt();
            Formatter fmt;

            System.out.println("Number    Squared     Cubed");
            System.out.println("======    =======     =====");

            for (int i = 1; i <= userNum; i++) {
                fmt = new Formatter();
                fmt.format("%4d      %4d       %4d", (i), (i*i), (i*i*i));
                System.out.println(fmt);
            }

            scan.nextLine();
            System.out.println("Continue? (y/n)");
            cont = scan.nextLine();
        }

    }
}
