

public class MagicCalculator extends Calculator {
    
    public static void main(String[] args) {

        double sqRtTest = MagicCalculator.squareRoot(144);
        System.out.println(sqRtTest);

        double sinTest = MagicCalculator.sin(30);
        System.out.println(sinTest);

        double factTest = MagicCalculator.factorial(8);
        System.out.println(factTest);

    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cosin(double num) {
        return Math.cos(num);
    }

    public static double tangent(double num) {
        return Math.tan(num);
    }

    public static double factorial(double num) {

        double fact = 1;

        while (num > 1) {
            fact *= num;
            num--;
        }

        return fact;
    }

}
