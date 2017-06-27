public class Main {
    public static void main(String[] args) {
        double sqrt = sqrt(14);
        //Rounding down
        int result = (int)Math.floor(sqrt);
        System.out.println( "Square root " + result);
    }

    //Square root Newton's method
    public static double sqrt(int number) {
        double t;
        //The number is divided by 2
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            //Calculation by formula
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }
}
