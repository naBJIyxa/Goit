package Module2.Task3;

import java.util.Objects;

public class Bank {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        double withdrawal = 100;

        withdrawMoney(ownerName, withdrawal, balances, ownerNames);
    }

    private static void withdrawMoney(String ownerName, double withdrawal, int[] balances, String[] ownerNames) {

        double percent = 5;
        double withdrawalAmount = withdrawal + withdrawal * (percent / 100);

        for (int i = 0; i < ownerNames.length; i++) {
            if (Objects.equals(ownerName, ownerNames[i])) {
                double ownerBalance = balances[i];
                double transaction = ownerBalance - withdrawalAmount;
                if (withdrawalAmount > ownerBalance) {
                    System.out.println(ownerName + " NO");
                } else {
                    System.out.println(ownerName + " " + (int)withdrawal + " " + (int)transaction);
                }
            }
        }
    }
}

/*
ЗАДАНИЕ 3

You need to write method which withdraw money of particular account owner if he/she can.
Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
Commision is 5% for all cases.

Example

Input

int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Ann
double withdrawal = 100;

Output
Ann 100 145

Input

int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 490;

Output
Oww NO
*/



