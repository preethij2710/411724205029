public class June11 {
    public static void main(String[] args) {
        int Unit = 210;
        ElectricBill(Unit);
    }

    public static void ElectricBill(int Unit) {
        if (Unit >= 0 && Unit <= 100) {
            System.out.println("Electric Bill: " + (Unit * 5));
        } else if (Unit > 101 && Unit <= 200) {
            System.out.println("Electric Bill: " + (Unit * 6));
        } else if (Unit > 201 && Unit <= 300) {
            System.out.println("Electric Bill: " + (Unit * 7));
        } else if (Unit > 301) {
            System.out.println("Electric Bill: " + (Unit * 8));
        } else {
            System.out.println("Invalid Unit");
        }
    }
}