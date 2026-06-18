public class Reverse {

    static  int rev = 0;

    public static void reverse(int n) {
        if (n == 0) {   // Base case
            return;
        }

        rev = rev * 10 + (n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;

        reverse(n);

        System.out.println("Reversed Number = " + rev);
    }
}