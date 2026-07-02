package day12_Activity;


import java.util.Scanner;

public class Activity8_GradeAverage_Buhayan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display program title
        System.out.println("=================================");
        System.out.println("        Average Calculator");
        System.out.println("=================================");

        // Ask the user for the number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt(); // Store number of students

        // Ask the user for the number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt(); // Store number of subjects

        input.nextLine(); // Clear the newline character left by nextInt()

        // Create an array to store subject names
        String[] subjectName = new String[subjects];

        // Create an array to store student names
        String[] studentName = new String[students];

        // Create a 2D array to store grades
        // Rows = students, Columns = subjects
        double[][] grades = new double[students][subjects];

        // Create an array to store each student's average
        double[] average = new double[students];

        // Ask the user to enter subject names
        System.out.println("\nEnter subject names:");

        // Loop to input each subject name
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": "); // Display subject number
            subjectName[i] = input.nextLine(); // Store subject name
        }

        // Loop for each student
        for (int i = 0; i < students; i++) {

            // Ask for the student's name
            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentName[i] = input.nextLine(); // Store student name

            // Variable to store the total grades of the student
            double sum = 0;

            // Ask the user to enter grades
            System.out.println("Enter grades for each subject:");

            // Loop through every subject
            for (int j = 0; j < subjects; j++) {

                // Display subject name
                System.out.print(subjectName[j] + ": ");

                // Read and store the student's grade
                grades[i][j] = input.nextDouble();

                // Add the grade to the total
                sum += grades[i][j];
            }

            // Compute the student's average
            average[i] = sum / subjects;

            // Clear the newline character left by nextDouble()
            input.nextLine();
        }

        // Display report title
        System.out.println("\n=================================");
        System.out.println("          Grades Report");
        System.out.println("=================================");

        // Print table header
        System.out.printf("%-12s", "Student");

        // Print each subject name as a column header
        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-10s", subjectName[i]);
        }

        // Print Average column header
        System.out.printf("%-10s%n", "Average");

        // Print separator line
        System.out.println("-------------------------------------------------------------");

        // Loop through each student
        for (int i = 0; i < students; i++) {

            // Print student's name
            System.out.printf("%-12s", studentName[i]);

            // Print all grades of the student
            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-10.0f", grades[i][j]); // Display grade with no decimal places
            }

            // Print the student's average with 2 decimal places
            System.out.printf("%-10.2f%n", average[i]);
        }

        // Close the Scanner object to free resources
        input.close();
    }
}
