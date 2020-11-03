public class ParttimeEmployee extends Employee{
    public static final long MEAL_ALLOWANCE = 0;
    private int totalWorkingShift;
    private long baseSalary;

    public ParttimeEmployee(String name, int age, String indentificationNumber, int totalWorkingShift, long baseSalary) {
        super(name, age, indentificationNumber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
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
        return getBaseSalary() * getTotalWorkingShift() + getMealAllowance(); //??
    }

    @Override
    public String toString() {
        return  "ParttimeEmployee: |" +
                " TotalWorkingShift: " + totalWorkingShift +
                " BaseSalary: " + baseSalary +
                " Name: " + name + " Age: " + age +
                " IndentificationNumber: " + indentificationNumber + " |"
                + "Total salary: " + getBaseSalary() * getTotalWorkingShift() + getMealAllowance();
    }

}