class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class q19_EmployeeArray {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 101),
            new Employee("Bob", 102),
            new Employee("Charlie", 103)
        };

        for (Employee e : employees) {
            e.display();
        }
    }
}
