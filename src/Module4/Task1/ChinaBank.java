package Module4.Task1;

import Module4.Task2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {

        int limit = 0;

        if (getCurrency() == Currency.USD) {
            limit = 100;
        }
        else if (getCurrency() == Currency.EUR) {
            limit = 150;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {

        int limit = 0;

        if (getCurrency() == Currency.EUR) {
            limit = 5000;
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
            limit = 1/100;
        }
        else if (getCurrency() == Currency.EUR) {
            limit = 0/100;
        }
        return limit;
    }

    @Override
    public double getCommission(int summ) {

        double commision = 0;

        if (getCurrency() == Currency.USD) {
            if (summ < 1000) {
                commision = 3/100;
            }
            else if (summ > 1000) {
                commision = 5/100;
            }
        }
        else if (getCurrency() == Currency.EUR) {
            if (summ < 1000) {
                commision = 10/100;
            }
            else if (summ > 1000) {
                commision = 11/100;
            }
        }
        return commision;
    }

}

/*
ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
лимит пополнения - 5000, если EUR и 10000, если USD
месячная ставка - 1% на USD и 0% на EUR
комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 */