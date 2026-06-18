public class Sumofnumber{

    public static int sum(int n) {
        if (n == 1) {   // Base case
            return 1;
        }

        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum = " + sum(n));
    }
}