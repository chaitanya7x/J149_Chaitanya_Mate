public class q07_WindSpeedCalculation {
    public static void main(String[] args) {
        double temperature = 30.0;
        double windSpeed = 10.0;
        double windChill = 35.74 + 0.6215 * temperature 
                           - 35.75 * Math.pow(windSpeed, 0.16)
                           + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.println("Calculated Wind Chill: " + windChill);
    }
}
