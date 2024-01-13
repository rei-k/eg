class Calculator {
    public static int add(int a, int b) { return a + b;}

    public static int subtract(int a, int b) {return a - b;}

    public static int multiply(int a, int b) { return a * b;}

    public static double divide(int a, int b) {return a / (double) b;
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("足し算: " + Calculator.add(a, b));
        System.out.println("引き算: " + Calculator.subtract(a, b));
        System.out.println("掛け算: " + Calculator.multiply(a, b));
        System.out.println("割り算: " + Calculator.divide(a, b));
    }
}
