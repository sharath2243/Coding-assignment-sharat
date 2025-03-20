import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    //constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //display_method
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " $");
        System.out.println("--------------*-------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // 1. Create at least 3 Employee objects.
        Employee emp1 = new Employee(101, "Joe Biden", 50000.0);
        Employee emp2 = new Employee(102, "Bill CLinton", 60000.0);
        Employee emp3 = new Employee(103, "Donald Trump", 55000.0);

        // 2. Store them in a list.
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // 3. Display their details.
        for (Employee e : employeeList) {
            e.displayDetails();
        }
    }
}
