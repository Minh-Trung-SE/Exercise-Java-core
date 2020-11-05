
public class Student {
    private String studentId;
    private String fullName;
    private float score;
    private String rank;

    public Student(){

    }
    public Student(String studentId, String fullName, float score, String rank) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.score = score;
        this.rank = rank;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }


    public void setRank(String rank) {
        this.rank = rank;
    }

    public String setRank(float score){
        float Score = score;
        if(Score < 5.0){
            return "least";
        }else if(Score < 7.0){
            return "average";
        }else if(Score < 8.0){
            return "good";
        }else {
            return "excellent";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", score=" + score +
                ", rank='" + rank + '\'' +
                '}';
    }
}
