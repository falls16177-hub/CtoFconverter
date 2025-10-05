import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Celsius = 0.0;
        double Fahrenheit;
        boolean inputvalid = false;

        System.out.print("Enter Celsius : ");

        while (!inputvalid) {
            if (input.hasNextInt()) {
                Celsius = input.nextInt();
                inputvalid = true;
            } else {
                System.out.print("Invalid input, Enter a valid number: : ");
                input.next();
            }
        }

        Fahrenheit = Celsius * 1.8 + 32;
        System.out.println("Celsius temperature in Fahrenheit : " + Fahrenheit);
    }
}


