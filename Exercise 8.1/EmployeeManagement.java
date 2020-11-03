import java.util.Random;

public class EmployeeManagement {
    private int totalEmployee;
    private Employee[] employees;

    public EmployeeManagement(int totalEmployee){
        this.totalEmployee = totalEmployee;
        employees = new Employee[totalEmployee];
        Random rd = new Random();
        for(int i = 0; i < employees.length; i++){
            String name = "Name " + i;
            int age = rd.nextInt(50);
            String indentificationNumber = "VN " + rd.nextInt(600);
            boolean isFullTime = rd.nextBoolean();;

            if(isFullTime){
                int totalWorkingDays = 20 + i;
                long dailySalary = 3000000 + rd.nextInt(20);
                FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name, age, indentificationNumber, totalWorkingDays, dailySalary);
                employees[i] = fulltimeEmployee;
            }else {
                int totalWorkingShift = 20 + rd.nextInt(10);
                long baseSalary = 1000000 + i;
                ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name, age, indentificationNumber, totalWorkingShift, baseSalary);
                employees[i] = parttimeEmployee;
            }
        }
    }

    public Employee getMaxSalary(boolean getMax){
        Employee result = employees[0];
        if(getMax){
            for(Employee employee: employees){
                if(employee.calculateSalary() > result.calculateSalary()){
                    result = employee;
                }
            }
            return result;
        }else {
            for(Employee employee: employees){
                if(employee.calculateSalary() < result.calculateSalary()){
                    result = employee;
                }
            }
        }
        return result;
    }

    public void displayEmployee(){
        for(Employee employee: employees){
            System.out.println(employee.toString());
        }
    }
}
