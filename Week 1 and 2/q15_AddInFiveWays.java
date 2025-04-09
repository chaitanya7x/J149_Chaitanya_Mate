public class q15_AddInFiveWays {
    public static int add1(int a, int b) { return a + b; }
    public static void add2(int a, int b) { System.out.println("Sum: " + (a + b)); }
    public static int add3() { return 5 + 10; }
    public static void add4() { System.out.println("Static Sum: " + (2 + 3)); }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Method 1: " + add1(a, b));
        add2(a, b);
        System.out.println("Method 3: " + add3());
        add4();
        if (true) System.out.println("Method 5: " + (a + b));
    }
}
