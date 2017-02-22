package Module4.Task1;

import Module4.Task2.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        return 0;
    }

    @Override
    public int getMonthlyRate() {
        return 0;
    }

    @Override
    public double getCommission(int summ) {
        return 0;
    }

}
