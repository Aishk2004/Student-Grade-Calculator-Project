
import java.util.Scanner;

public class StudentGradeCalculator 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Get grades for assignments
        System.out.print("Enter grade for Assignments (out of 100): ");
        double assignmentGrade = scanner.nextDouble();

        // Get grades for exams
        System.out.print("Enter grade for Exams (out of 100): ");
        double examGrade = scanner.nextDouble();

        // Get grade for participation
        System.out.print("Enter grade for Participation (out of 100): ");
        double participationGrade = scanner.nextDouble();

        // Define weights for each category
        double assignmentWeight = 0.4;  // Assignments have a weight of 40%
        double examWeight = 0.5;        // Exams have a weight of 50%
        double participationWeight = 0.1; // Participation has a weight of 10%

        // Calculate the weighted sum
        double finalGrade = (assignmentGrade * assignmentWeight) + 
                            (examGrade * examWeight) + 
                            (participationGrade * participationWeight);

        // Output the result
        System.out.println("\nStudent: " + studentName);
        System.out.printf("Final Grade: %.2f\n", finalGrade);

        // Determine grade letter based on the final grade
        String letterGrade;
        if (finalGrade >= 90) {
            letterGrade = "A";
        } else if (finalGrade >= 80) {
            letterGrade = "B";
        } else if (finalGrade >= 70) {
            letterGrade = "C";
        } else if (finalGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}
