public class FulltimeEmployee extends Employee{
    public static final long MEAL_ALLOWANCE = 2000000;
    private int totalWorkingDays;
    private long dailySalary;

    public FulltimeEmployee(String name, int age, String indentificationNumber, int totalWorkingDays, long dailySalary) {
        super(name, age, indentificationNumber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return 0;
    }

    @Override
    public int getWorkingCount() {
        return 0;
    }

    @Override
    public long calculateSalary() {
        return getTotalWorkingDays()*getDailySalary()+getMealAllowance();
    }

    @Override
    public String toString() {
        return  "FulltimeEmployee: |" +
                " TotalWorkingDays: " + totalWorkingDays +
                " DailySalary: " + dailySalary +
                " Name: " + name + '\'' +
                " Age: " + age +
                " IndentificationNumber: " + indentificationNumber + " |"
                +"Total salary: "+ getTotalWorkingDays()*getDailySalary()+getMealAllowance();
    }
}
