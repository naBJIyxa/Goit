package Module4.Task1;

import Module4.Task2.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        int limit = 0;

        if (getCurrency() == Currency.USD) {
            limit = 2000;
        }
        else if (getCurrency() == Currency.EUR) {
            limit = 2200;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {

        int limit = 0;

        if (getCurrency() == Currency.EUR) {
            limit = 20000;
        }
        else if (getCurrency() == Currency.USD) {
            limit = 10000;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {

        int limit = 0;

        if (getCurrency() == Currency.USD) {
            limit = 0/100;
        }
        else if (getCurrency() == Currency.EUR) {
            limit = 1/100;
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
                commision = 2/100;
            }
            else if (summ > 1000) {
                commision = 4/100;
            }
        }
        return commision;
    }

}

/*
EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
лимит пополнения - 20000, если EUR и 10000, если USD
месячная ставка - 0% на USD и 1% на EUR
комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 */
