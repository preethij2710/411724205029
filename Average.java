public class Average{

    public  static double average(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        double avg = average(arr);

        System.out.println("Average = " + avg);
    }
}            