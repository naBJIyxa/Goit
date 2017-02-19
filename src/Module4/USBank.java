package Module4;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        double limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else {
            limit = 1200;
        }

        return (int)limit;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
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