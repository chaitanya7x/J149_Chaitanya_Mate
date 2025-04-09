public class q02_CGPACalculation {
    public static void main(String[] args) {
        double[] grades = {8.5, 7.8, 9.0, 8.2, 7.9};
        double sum = 0;
        for (double g : grades) sum += g;

        double cgpa = sum / grades.length;
        double percentage = cgpa * 9.5;

        System.out.println("CGPA: " + cgpa);
        System.out.println("Percentage: " + percentage + "%");
    }
}
