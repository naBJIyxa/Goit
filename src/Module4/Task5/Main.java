package Module4.Task5;

import Module4.Task3.User;
import Module4.Task1.USBank;
import Module4.Task2.Currency;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(111111, "Cuba", Currency.USD, 12, 20, 50, 20000000);

        User Poll = new User(12,"Poll",500000,6,"Poll's company",4000, usBank);


        System.out.println(usBank);

        System.out.println(Poll);
    }
}
