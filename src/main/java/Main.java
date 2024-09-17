import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the subtotal and the gratuity rate
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate (as a percentage): ");
        double gratuityRate = input.nextDouble();

        // Calculate the gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // Display the results
        System.out.println("The gratuity is $" + gratuity);
        System.out.println("The total is $" + total);
    }
}
