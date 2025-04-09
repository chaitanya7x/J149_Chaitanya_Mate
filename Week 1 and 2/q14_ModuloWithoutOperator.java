public class q14_ModuloWithoutOperator {
    public static void main(String[] args) {
        int a = 17, b = 5;
        int quotient = a / b;
        int product = quotient * b;
        int remainder = a - product;
        System.out.println("Remainder: " + remainder);
    }
}
