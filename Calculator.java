
public class Calculator {

    public static void main(String[] args) {

        int addition = Calculator.add(5, 7);

        int squaredTest = Calculator.square(5, 3);

        System.out.println(addition);

        System.out.println(squaredTest);

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int square(int num1, int num2) {
        int squaredNum = 1;

        for (int i = 0; i < num2; i++) {
            squaredNum *= num1;
        }

        return squaredNum;
    }
}