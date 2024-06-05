
    import java.util.ArrayList;
import java.util.Scanner;
/*without using collections  */
public class studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[] grades = new double[numStudents];

        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate highest, average, and lowest grades
        double highest = grades[0];
        double lowest = grades[0];
        double total = grades[0];

        for (int i = 1; i < numStudents; i++) {
            total += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = total / numStudents;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Highest grade: " + highest);
        System.out.println("Average grade: " + average);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}

