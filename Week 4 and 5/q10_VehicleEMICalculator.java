public class q10_VehicleEMICalculator {
    public static void main(String[] args) {
        double principal = 300000;
        double rate = 8.5;
        int time = 5;
        double emi;

        rate = rate / (12 * 100);
        int n = time * 12;

        emi = (principal * rate * Math.pow(1 + rate, n)) / 
              (Math.pow(1 + rate, n) - 1);

        System.out.println("Monthly EMI: " + Math.round(emi));
    }
}
