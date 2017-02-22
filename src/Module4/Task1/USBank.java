package Module4.Task1;

import Module4.Task2.Currency;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        int limit = 0;

        if (getCurrency() == Currency.USD) {
            limit = 1000;
        }
        else if (getCurrency() == Currency.EUR) {
            limit = 1200;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {

        int limit = 0;

        if (getCurrency() == Currency.EUR) {
            limit = 10000;
        }
        else if (getCurrency() == Currency.USD) {
            limit = Integer.MAX_VALUE;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {

        int limit = 0;

        if (getCurrency() == Currency.USD) {
            limit = 1/100;
        }
        else if (getCurrency() == Currency.EUR) {
            limit = 2/100;
        }
        return limit;
    }

    @Override
    public double getCommission(int summ) {
        double commision = 0;

        if (getCurrency() == Currency.USD) {
            if (summ < 1000) {
                commision = 5/100;
            }
            else if (summ > 1000) {
                commision = 7/100;
            }
        }
        else if (getCurrency() == Currency.EUR) {
            if (summ < 1000) {
                commision = 6/100;
            }
            else if (summ > 1000) {
                commision = 8/100;
            }
        }
        return commision;
    }

}

/*
USBank:
- лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
- лимит пополнения - 10000, если EUR, и нет лимита, если USD
- месячная ставка - 1% на USD и 2% на EUR
- комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
6%, если EUR и до 1000 и 8%, если EUR и больше 1000
*/

