public class q09_EmployeeRatingSystem {
    public static void main(String[] args) {
        String name = "John";
        int certifications = 7;
        double salary = 50000;
        double increment = 0;

        if (certifications >= 10) increment = 0.10;
        else if (certifications >= 5) increment = 0.05;
        else if (certifications >= 1) increment = 0.025;

        double newSalary = salary + (salary * increment);
        System.out.println(name + "'s new salary: " + newSalary);
    }
}
