import java.util.Scanner;

public class Guess_The_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess The Number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO...CORRECT NUMBER!!");
                break;
            } else if (userNumber < myNumber) {
                System.out.println("THE NUMBER IS TOO SMALL!!");
            } else {
                System.out.println("THE NUMBER IS TOO LARGE!!");
            }
        } while (userNumber >= 0);

        System.out.println("My Number Was : ");
        System.out.println(myNumber);
        sc.close();

    }

}