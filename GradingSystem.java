import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for marks
        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        // Determine grade
        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Output the grade
        System.out.println("The grade is: " + grade);

        scanner.close();
    }
}
