import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> studentGrades = new HashMap<>();

        // Adding student numbers and grades to the Map
        studentGrades.put(1, 85);
        studentGrades.put(2, 90);
        studentGrades.put(3, 75);
        studentGrades.put(4, 92);
        studentGrades.put(5, 80);

        // Variables to track the minimum and maximum grades
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        int totalGrade = 0;

        // Looping over the Map to find the minimum and maximum grades and calculate the total grade
        for (int grade : studentGrades.values()) {
            if (grade < minGrade) {
                minGrade = grade;
            }

            if (grade > maxGrade) {
                maxGrade = grade;
            }

            totalGrade += grade;
        }

        // Calculating the average grade of the class
        double averageGrade = (double) totalGrade / studentGrades.size();

        // Printing the results
        System.out.println("Minimum grade: " + minGrade);
        System.out.println("Maximum grade: " + maxGrade);
        System.out.println("Average grade of the class: " + averageGrade);
    }
}
