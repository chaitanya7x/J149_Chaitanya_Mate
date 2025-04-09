public class q06_HexagonalPrismArea {
    public static void main(String[] args) {
        double side = 4, height = 10;
        double baseArea = (3 * Math.sqrt(3) * side * side) / 2;
        double lateralArea = 6 * side * height;
        double totalArea = 2 * baseArea + lateralArea;

        System.out.println("Surface Area of Hexagonal Prism: " + totalArea);
    }
}
