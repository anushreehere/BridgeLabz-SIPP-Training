import java.util.Scanner;

public class MarksPercentageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Marks: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+ | Remarks: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: A | Remarks: Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: B | Remarks: Good");
        } else if (percentage >= 50) {
            System.out.println("Grade: C | Remarks: Average");
        } else {
            System.out.println("Grade: D | Remarks: Needs Improvement");
        }

        sc.close();
    }
}
