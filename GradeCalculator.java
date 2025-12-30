public class GradeCalculator {
    public double calculateAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public String getLetterGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public void displayGrade(String studentName, double average, String grade) {
        System.out.println(studentName + "\t\tAverage: " + average + ", Grade: " + grade);
    }
}
