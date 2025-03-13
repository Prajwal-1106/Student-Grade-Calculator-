import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            int[] marks = new int[numSubjects];
            int totalMarks = 0;

           
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks obtained in Subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();

               
                while (marks[i] < 0 || marks[i] > 100) {
                    System.out.print("Invalid marks! Enter again (0-100): ");
                    marks[i] = scanner.nextInt();
                }

                totalMarks += marks[i];
            }

            double averagePercentage = (double) totalMarks / numSubjects;

            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F'; 
            }

            System.out.println("\n Results:");
            System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }
}
