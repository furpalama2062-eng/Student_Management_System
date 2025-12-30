public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Student Management System:\n\n");
		
		Student s = new Student("Ram", 20);
		GradeCalculator g = new GradeCalculator();

	        double avg = g.calculateAverage(85, 90, 78);
	        String grade = g.getLetterGrade(avg);
	        g.displayGrade(s.getName(), avg, grade);
			}
}
