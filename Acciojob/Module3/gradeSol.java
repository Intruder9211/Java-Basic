public class GradeAssignment {

    public static String grade(int marks) {
        if (marks > 90) {
            return "Excellent";
        } else if (marks > 80) {
            return "Good";
        } else if (marks > 70) {
            return "Fair";
        } else if (marks > 60) {
            return "Meets Expectations";
        } else {
            return "Below Expectations";
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int studentMarks = 75;
        String result = grade(studentMarks);
        System.out.println("Student's grade: " + result);
    }
}
