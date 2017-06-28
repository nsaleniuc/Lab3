import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer");
        userNum = scan.nextInt();


        System.out.println("Number      Squared     Cubed");
        System.out.println("======      =======     =====");

        for (int i = 1; i <= userNum; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }

    }
}
