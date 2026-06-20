import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        String subjects[] = {
            "Java",
            "Python",
            "DBMS",
            "Operating System",
            "Computer Networks"
        };

        int marks[] = new int[5];
        int total = 0;

        for(int i = 0; i < 5; i++) {

            System.out.print("Enter " + subjects[i] + " Marks: ");
            marks[i] = sc.nextInt();

            total = total + marks[i];
        }

        double avg = total / 5.0;

        String grade;

        if(avg >= 75) {
            grade = "A";
        }
        else if(avg >= 50) {
            grade = "B";
        }
        else if(avg >= 35) {
            grade = "C";
        }
        else {
            grade = "Fail";
        }

        System.out.println("\n----- Student Report -----");
        System.out.println("Student Name : " + name);

        for(int i = 0; i < 5; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("Total Marks : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}