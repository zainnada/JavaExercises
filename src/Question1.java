import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        double DegreeF, DegreeC;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        DegreeF = input.nextDouble();

        DegreeC = 5 * (DegreeF - 32) / 9;

        System.out.printf("%.0f degrees Fahrenheit is %.1f degrees Celsius.\n", DegreeF, DegreeC);
        // %.nf -> n is the number of digits after the decimal point.

    }
}
