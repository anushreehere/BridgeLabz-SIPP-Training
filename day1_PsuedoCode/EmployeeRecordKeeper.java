// EmployeeRecordKeeper.java
import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class EmployeeRecordKeeper {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anu", "IT"));
        employees.add(new Employee("Ally", "HR"));
        employees.add(new Employee("Raj", "IT"));

        // Filter IT employees
        employees.stream()
                .filter(e -> e.department.equals("IT"))
                .forEach(System.out::println);
    }
}
