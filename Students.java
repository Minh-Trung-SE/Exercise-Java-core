public class Students {
    private String name;
    private float gpa;

    public Students(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public boolean checkPass() {
        if(gpa>=1.5) {
            return  true;
        } else {
            return false;
        }
    }

    public void displayGpa() {

        System.out.println("GPA:" + gpa);
    }

    public void displayName() {
        System.out.println("Name:" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {

        this.gpa = gpa;
    }
}