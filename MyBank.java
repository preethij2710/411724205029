public class MyBank {

    public static void loanInterest(int money) {

        if (money < 10000) {
            System.out.println("Interest = 10%");
        }
        else if (money > 20000) {
            System.out.println("Interest = 8%");
        }
        else if (money > 30000) {
            System.out.println("Interest = 6%");
        }
        else if (money > 50000) {
            System.out.println("Interest = 3%");
        }
        else if ( money < 10000){
            System.out.println("No Loan");
        }
        else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
    
        loanInterest(25000);
    }
}