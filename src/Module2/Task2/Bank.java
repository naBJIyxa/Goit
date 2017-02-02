package Module2.Task2;

public class Bank {
    public static void main(String[] args) {

        int balance = 100;
        int withdrawal = 10;

        withdrawMoney(balance, withdrawal);
    }

     private static void withdrawMoney(int balance, int withdrawal) {
        double percent = 5;
        double commision = withdrawal * (percent/100);
        double transaction = balance - (withdrawal + commision);

        if (transaction < 0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + commision + " " + transaction);
        }
     }
     
}