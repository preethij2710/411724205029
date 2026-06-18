public class Main {

    public static int sumOfDigits(int n) {
        if (n == 0) {   // Base case
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;

        System.out.println("Sum of digits = " + sumOfDigits(n));
    }
}