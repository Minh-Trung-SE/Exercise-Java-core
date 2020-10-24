import java.util.Scanner;

public class StudentManagement {
   private int totalOfStudent; //attribute
   private Student[] students; //attribute
//method input list student
   public void inputStudents(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input number student: ");
      this.totalOfStudent = scanner.nextInt();
      students = new Student[totalOfStudent]; //?

      for(int i = 0; i < students.length; i++) {
         System.out.print("Name student " + (i +1) + ": ");
         scanner.nextLine();
         String name = scanner.nextLine();
         System.out.print("Gpa student " + (i +1) + ": ");
         float gpa = scanner.nextFloat();
         Student student = new Student(name, gpa);
         students[i] = student;
         System.out.println("");
      }
   }

//method check student pass
   public int countStudentPass() {
      int count = 0;
      for(Student element:students){
         if(element.checkPass()){
            count++;
         }
      }
      return count;
   }

 //method check student failed
   public int countStudentFailed() {
      int count = 0;
      for(Student element:students){
         if(element.checkPass()){
            count++;
         }
      }
      return count;
   }

   //method display information student highest
   public Student getMaxGpa() {
      Student result = students[0];
      for(Student element: students){
         if(element.getGpa() > result.getGpa()){
            result = element;
         }
      }
      return result;
   }
   //method display information student lowest
   public Student getMinGpa() {
      Student result = students[0];
      for(Student element: students){
         if(element.getGpa() <= result.getGpa()){
            result = element;
         }
      }
      return result;
   }
}
