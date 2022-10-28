import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
            if (num3 < num2) {
                System.out.println(num3 + " is the smallest number");
            } else
                System.out.println(num2 + " is the smallest number");


        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number");
            if (num3 < num1) {
                System.out.println(num3 + " is the smallest number");
            } else
                System.out.println(num1 + " is the smallest number");


        } else {
            System.out.println(num3 + " is the largest number");
            if (num1 < num2) {
                System.out.println(num1 + " is the smallest number");
            } else
                System.out.println(num2 + " is the smallest number");
        }

    }
}
