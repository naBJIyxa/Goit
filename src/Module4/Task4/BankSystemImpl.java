package Module4.Task4;

import Module4.Task1.Bank;
import Module4.Task3.User;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {

        double balance, amountWithCommission;
        Bank bank;

        balance = user.getBalance();
        bank = user.getBank();

        amountWithCommission = amount + bank.getCommission(amount);

        if (balance > bank.getLimitOfWithdrawal()){
            System.out.println("You cannot withdraw this amount. Maximum authorized withdrawal is " + bank.getLimitOfWithdrawal());
        } else if (amountWithCommission > balance){
            System.out.println("Your balance is too low to withdraw " + amount +". Your balance is: " + balance);
        }else{
            user.setBalance(balance - amountWithCommission);
            System.out.println("Please take your cash.\nYou have withdrawn" +
                    amount+". Your commissions for this transaction were " + bank.getCommission(amount) +
                    ".\nYour new balance is: " + user.getBalance()+".\nThank you for your business.");
        }

    }

    @Override
    public void fundUser(User user, int amount) {

        double balance, amountWithCommission;
        Bank bank;

        balance = user.getBalance();
        bank = user.getBank();

        amountWithCommission = amount - bank.getCommission(amount);

        if (balance > bank.getLimitOfFunding()){
            System.out.println("You cannot fund this amount. Maximum authorized funding is " + bank.getLimitOfFunding());
        } else{
            user.setBalance(balance + amountWithCommission);
            System.out.println("You have deposited " +
                    amount+". Your commissions for this transaction were " + bank.getCommission(amount) +
                    ".\nYour new balance is: " + user.getBalance()+".\nThank you for your business.");
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        double balanceFrom, balanceTo, amountWithCommissionFrom, amountWithCommissionTo;
        Bank bankFrom, bankTo;

        balanceFrom = fromUser.getBalance();
        bankFrom = fromUser.getBank();

        balanceTo = toUser.getBalance();
        bankTo = toUser.getBank();

        amountWithCommissionFrom = amount + bankFrom.getCommission(amount);
        amountWithCommissionTo = amount - bankTo.getCommission(amount);

        if (amountWithCommissionFrom > bankFrom.getLimitOfWithdrawal()){
            System.out.println("You cannot withdraw this amount. Maximum authorized withdrawal is " + bankFrom.getLimitOfWithdrawal());
        } else if (amountWithCommissionFrom > balanceFrom){
            System.out.println("Your balance is too low to transfer " + amount +". Your balance is: " + balanceFrom);
        }else if (amountWithCommissionTo > bankTo.getLimitOfFunding()){
            System.out.println("You cannot credit this amount to beneficiary. Maximum authorized funding is " + bankTo.getLimitOfFunding());
        } else {
            fromUser.setBalance(balanceFrom - amountWithCommissionFrom);
            toUser.setBalance(balanceTo + amountWithCommissionTo);
            System.out.println("Transaction is complete: " + fromUser.getName() + " has transferred " + amount + " to " +
                    toUser.getName() + ".\n" + fromUser.getName() + ", you have paid " + bankFrom.getCommission(amount) +
                    " in commissions and your new balance is now: " + fromUser.getBalance() + ".\n"+
                    toUser.getName() + ", you have paid in commissions " + bankTo.getCommission(amount) +
                    " and your new balance is now: " + toUser.getBalance() + ".");
        }

    }

    @Override
    public void paySalary(User user) {

        fundUser(user, user.getSalary());

    }
}
