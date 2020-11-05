import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
//    public ArrayList<Student> studentList = new ArrayList<Student>();

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        boolean chose = true;

        while (chose){
            String studentId, fullName, rank;
            float score;
            Scanner sc = new Scanner(System.in);

            System.out.println("Input StudentID: ");
            studentId = sc.nextLine();

            System.out.println("Input full name: ");
            fullName = sc.nextLine();

            try {
                System.out.println("Input score: ");
                score = sc.nextFloat();
            }catch (Exception ex){
                System.out.println("Input is invalid");
                System.out.println("Input all information again: ");
                continue;
            }
            Student getRank = new Student();
            rank = getRank.setRank(score);

            Student student = new Student(studentId,fullName, score, rank);
            studentList.add(student);
            try {
                System.out.println("Continue add student true/false: ");
                chose = sc.nextBoolean();
            }catch (Exception ex1){
                System.out.println("Input is invalid");
                System.out.println("End function add student");
                ex1.printStackTrace();
            }
        }

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
