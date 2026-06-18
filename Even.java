 public class Even {

    public static int evenPositionSum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i +=2) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int result = evenPositionSum(arr);

        System.out.println("Sum of even positions = " + result);
    }
}