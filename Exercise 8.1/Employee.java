public abstract class Employee {
    protected String name;
    protected int age;
    protected String indentificationNumber;

    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract int getWorkingCount();
    public abstract long calculateSalary();

    public Employee(String name, int age, String indentificationNumber) {
        this.name = name;
        this.age = age;
        this.indentificationNumber = indentificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIndentificationNumber() {
        return indentificationNumber;
    }

    public void setIndentificationNumber(String indentificationNumber) {
        this.indentificationNumber = indentificationNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", indentificationNumber='" + indentificationNumber + '\'' +
                '}';
    }
}
