import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner my_input = new Scanner(System.in);

        System.out.print("Enter 4 digit integer: ");
        int num = my_input.nextInt();

        int firstDigit, secondDigit, thirdDigit, fourthDigit;

        firstDigit = num / 1000;
        num = num % 1000;

        secondDigit = num / 100;
        num = num % 100;

        thirdDigit = num / 10;
        num = num % 10;

        fourthDigit = num;

        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println(fourthDigit);

    }
}


class Question4_2 { // simplify the previous solution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int loop = 1;
        int x = 1000;
        int digit;

        System.out.print("Enter four digit integer: ");
        number = input.nextInt();

        while (loop <= 4) {
            digit = number / x;
            number %= x;
            x /= 10;
            System.out.println(digit);
            loop++;
        }

    }
}
class Question4_3 { // simplify the previous two solutions by using String
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number;
        int loop = 0;

        System.out.print("Enter four digit integer: ");
        number = input.nextLine();

        while (loop <= number.length()-1) {
            System.out.println(number.charAt(loop));
            loop++;
        }

    }
}
