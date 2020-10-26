public class Employee {
    protected String nameEmployee;
    protected String addressEmployee;
    protected int age;
    protected long numberPhone;
    protected boolean isFullTime;

    public Employee(String nameEmployee, String addressEmployee, int age, long numberPhone, boolean isFullTime) {
        this.nameEmployee = nameEmployee;
        this.addressEmployee = addressEmployee;
        this.age = age;
        this.numberPhone = numberPhone;
        this.isFullTime = isFullTime;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }


}
