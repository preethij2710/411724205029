import java.util.Scanner;

public class Grade {

    public static void checkmarks(int mark) {

        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade A");
        }
        else if (mark >= 80) {
            System.out.println("Grade B");
        }
        else if (mark >= 70) {
            System.out.println("Grade C");
        }
        else if (mark >= 60) {
            System.out.println("Grade D");
        }
        else if (mark >= 50) {
            System.out.println("Grade E");
        }
        else if (mark >= 0) {
            System.out.println("Grade F");
        }
        else {
            System.out.println("Invalid Marks");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();

        checkmarks(mark);

        sc.close();
    }
}
