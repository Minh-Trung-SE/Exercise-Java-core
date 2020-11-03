public class FulltimeEmployee extends Employee {
    protected float baseSalary;
    protected boolean level;
    protected int overTimeDay;

    public FulltimeEmployee(String nameEmployee, String addressEmployee, int age, long numberPhone, boolean isFullTime,float baseSalary, boolean level, int overTimeDay) {
        super(nameEmployee, addressEmployee, age, numberPhone, isFullTime);
        this.baseSalary = baseSalary;
        this.level = level;
        this.overTimeDay = overTimeDay;
    }

    public float calculateSalary(){
        float result = 0;
        if(level){
            result = 20;
        }else{
            result = 10;
        }
        return result;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public boolean isLevel() {
        return level;
    }

    public void setLevel(boolean level) {
        this.level = level;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", level=" + level +
                ", overTimeDay=" + overTimeDay +
                '}';
    }
}
