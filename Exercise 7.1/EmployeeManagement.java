import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagement {
    protected Employee[] employees;

    public Employee[] inputEmployeeManagement(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number employee want to add: ");
        int numberEmployee = scanner.nextInt();

        Employee[] employees = new Employee[numberEmployee];
        for(int i = 0; i < employees.length; i++){
            System.out.println("Input name of employee " + (i+1) + " : ");
            scanner.nextLine();
            String nameEmployee = scanner.nextLine();
            System.out.println("Input address of employee " + (i+1) + " : ");
            String addressEmployee = scanner.nextLine();
            System.out.println("Input age of employee " + (i+1) + " : ");
            int age = scanner.nextInt();
            System.out.println("Input number phone of employee " + (i+1) + " : ");
            long numberPhone = scanner.nextLong();
            System.out.println("Fulltime/Parttime true/false: ");
            boolean isFullTime = scanner.nextBoolean();
            if(isFullTime){
                System.out.println("Input baseSalary of employee " + (i+1) + " : ");
                float baseSalary = scanner.nextFloat();
                System.out.println("Input level of employee " + (i+1) + " boss(true) : ");
                boolean level = scanner.nextBoolean();
                System.out.println("Input overTimeDay of employee " + (i+1) + " : ");
                int overTimeDay = scanner.nextInt();
                Employee fulltimeEmployee = new FulltimeEmployee(nameEmployee, addressEmployee, age, numberPhone, isFullTime, baseSalary, level, overTimeDay);
                employees[i] = fulltimeEmployee;
            }else{

                System.out.println("Input Work hour of employee " + (i+1) + " : ");
                int workHourNumber = scanner.nextInt();
                Employee partTimeEmployee = new ParttimeEmployee(nameEmployee, addressEmployee, age, numberPhone, isFullTime, workHourNumber);
                employees[i] = partTimeEmployee;
            }
        }
        return employees;
    }

    public void printAllEmployee() {
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}


