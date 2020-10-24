public class Student {
    private String name;
    private float gpa;
//constructor
    public Student (String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }
//method check
    public boolean checkPass() {
        if(gpa>=1.5) {
            return  true;
        } else {
            return false;
        }
    }
//method print gpa
    public void displayGpa() {

        System.out.println("GPA:" + gpa);
    }
//method print name
    public void displayName() {
        System.out.println("Name:" + name);
    }
//method set name
    public void setName(String name) {
        this.name = name;
    }
//method return name
    public String getName() {
        return name;
    }
//method set gpa
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
//method return gpa
    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " - Gpa: " + gpa;
    }
}