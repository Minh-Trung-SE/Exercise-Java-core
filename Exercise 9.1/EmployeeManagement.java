import java.util.ArrayList;
import java.util.Random;

public class EmployeeManagement {
    private int totalEmployee;
    private ArrayList<Employee>employeeArrayList;

    public EmployeeManagement(int totalEmployee){
        this.totalEmployee = totalEmployee;
        employeeArrayList = new ArrayList<Employee>();
        Random rd = new Random();
        for(int i = 0; i < totalEmployee; i++){
            String name = "Name " + i;
            int age = rd.nextInt(50);
            String indentificationNumber = "VN " + rd.nextInt(600);
            boolean isFullTime = rd.nextBoolean();;

            if(isFullTime){
                int totalWorkingDays = 20 + i;
                long dailySalary = 3000000 + rd.nextInt(20);
                FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name, age, indentificationNumber, totalWorkingDays, dailySalary);
                employeeArrayList.add(fulltimeEmployee);
            }else {
                int totalWorkingShift = 20 + rd.nextInt(10);
                long baseSalary = 1000000 + i;
                ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name, age, indentificationNumber, totalWorkingShift, baseSalary);
                employeeArrayList.add(parttimeEmployee);
            }
        }
    }

    public Employee getMaxSalary(boolean getMax){
        Employee result = employeeArrayList.get(0);
        if(getMax){
            for(Employee employee: employeeArrayList){
                if(employee.calculateSalary() > result.calculateSalary()){
                    result = employee;
                }
            }
            return result;
        }else {
            for(Employee employee: employeeArrayList){
                if(employee.calculateSalary() < result.calculateSalary()){
                    result = employee;
                }
            }
        }
        return result;
    }

    public void displayEmployee(){
        for(Employee employee: employeeArrayList){
            System.out.println(employee.toString());
        }
    }
}
