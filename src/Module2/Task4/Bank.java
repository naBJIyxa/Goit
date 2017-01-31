package Module2.Task4;

import java.util.Objects;

public class Bank {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 100;

        fundBalance(ownerName, withdrawal, balances, ownerNames);
    }

    private static void fundBalance(String ownerName, double withdrawal, int[] balances, String[] ownerNames) {

        for (int i = 0; i < ownerNames.length; i++) {
            if (Objects.equals(ownerName, ownerNames[i])) {
                double ownerBalance = balances[i];
                double transaction = ownerBalance + withdrawal;
                System.out.println(ownerName + " " +(int)transaction);
            }
        }
    }
}
/*
You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding

Input

int[] balances = {1200, 250, 2000, 500, 3200};

String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 100;

Output
Oww 600
 */