public class Test {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.inputStudents();
        System.out.println("Total student passed is " + studentManagement.countStudentPass());
        System.out.println("Total student failed is " + studentManagement.countStudentFailed());
        System.out.println("Student max gpa is " + studentManagement.getMaxGpa());
        System.out.println("Student max gpa is " + studentManagement.getMinGpa());
    }
}




