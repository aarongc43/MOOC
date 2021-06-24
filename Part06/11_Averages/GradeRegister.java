import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;

        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {

        if (grades.isEmpty()) {
            return -1;
        }
        
        int counter = 0;

        for (int grade: grades) {
            counter += grade;
        }

        return (double)counter / this.grades.size();
    }

    public double averageOfPoints() {
        
        DecimalFormat df = new DecimalFormat(".00");
        if (examPoints.isEmpty()) {
            return -1;
        }

        int counter = 0;

        for (int points: examPoints) {
            counter += points;
        }

        double d = (double) counter / this.examPoints.size();
        return df.format(d);

    }
}
