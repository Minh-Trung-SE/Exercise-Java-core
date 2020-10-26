public class ParttimeEmployee extends Employee {
    protected int workHourNumber;

    public ParttimeEmployee(String nameEmployee, String addressEmployee, int age, long numberPhone, boolean isFullTime, int workHourNumber) {
        super(nameEmployee, addressEmployee, age, numberPhone, isFullTime);
        this.workHourNumber = workHourNumber;
    }

    public float calculateSalary(){
        float result = 0;
        result = 0.1f * workHourNumber;
        return result;
    }
    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }

}
