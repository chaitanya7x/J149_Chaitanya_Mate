public class q03_DaysToYears {
    public static void main(String[] args) {
        int days = 800;
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println("Years: " + years + ", Days: " + remainingDays);
    }
}
