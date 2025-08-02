import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Alice";
        

        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.name = "Bob";

       ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees);
        System.out.println("After sorting by ID:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        //comparator
        
        Collections.sort(employees,  new NameComparison());
        System.out.println("After sorting by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }




}

