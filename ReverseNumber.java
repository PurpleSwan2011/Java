import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = 0;

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed
            number /= 10; // Remove the last digit
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversed);

        scanner.close();
    }
} 
    

