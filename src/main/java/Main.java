import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "A");
        Employee e2 = new Employee(2, "B");
        Employee e3 = new Employee(3, "C");
        Employee e4 = new Employee(4, "D");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        employees.forEach(System.out::println);
    }
}
