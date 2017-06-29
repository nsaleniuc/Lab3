import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNum;
        String cont = "y";

        Scanner scan = new Scanner(System.in);

        while (cont.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer:");
            userNum = scan.nextInt();

            Formatter fmt;

            System.out.println("Number    Squared     Cubed");
            System.out.println("======    =======     =====");

            for (int i = 1; i <= userNum; i++) {
                fmt = new Formatter();
                fmt.format("%6d    %6d    %7d", (i), (i*i), (i*i*i));
                System.out.println(fmt);
            }

            scan.nextLine();
            System.out.println("Continue? (y/n)");
            cont = scan.nextLine();
        }
        System.out.println("Goodbye");

    }
}
