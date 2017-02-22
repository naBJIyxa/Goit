package Module4.Task5;

import Module4.Task3.User;
import Module4.Task1.USBank;
import Module4.Task2.Currency;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(12, "Cuba", Currency.USD, 12, 20, 50, 20000);

        User Poll = new User(101,"Poll",30000,12,"Anna Co",3000, usBank);


        System.out.println(usBank);

        System.out.println(Poll);
    }
}
