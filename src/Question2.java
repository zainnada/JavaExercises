import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even integer.");
        } else
            System.out.println("Odd integer.");

    }
}
