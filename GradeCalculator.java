package VariablesDataTypesandOperators;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's grade (0 - 10): ");
        int grade = scanner.nextInt();

        String result = calculateGrade(grade);

        System.out.println("The student's grade is: " + result);

        scanner.close();
    }

    public static String calculateGrade(int grade) {
        if (grade < 0 || grade > 10) {
            return "Invalid grade! Please enter a grade within the range of 0 to 10.";
        } else if (grade <= 3) {
            return "Failed";
        } else if (grade <= 5) {
            return "Insufficient";
        } else if (grade <= 8) {
            return "Good";
        } else if (grade == 10) {
            return "Excellent Grade";
        } else {
            // Handle any other values
            return "Invalid grade! Please enter a valid grade.";
        }
    }
}
