package Module4.Task1;

import Module4.Task2.Currency;

public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    //Constructor
    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    //Methods
    public abstract int getLimitOfWithdrawal();
    public abstract int getLimitOfFunding();
    public abstract int getMonthlyRate();
    public abstract double getCommission(int summ);
    double moneyPaidMonthlyForSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "The bank ID is: " + id + ";\n" +
                "The bank country is: " + bankCountry + ";\n" +
                "The bank reporting currency is: " + currency + ";\n" +
                "The bank employs " + numberOfEmployees + " people;\n" +
                "The average salary of the employees is:" + avrSalaryOfEmployee + ";\n" +
                "The bank's rating is:" + rating + " ;\n" +
                "The bank's total capital is:" + totalCapital + " ;\n";
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }
}

/*
 * Ниже вы найдете условия всех ДЗ к Модулю 4. Мы публикуем их тут, чтобы вы знали, что вас ждет впереди и какой объем работы должен вами быть выполнен.
Однако обратите внимание, что ДЗ должны сдаваться в виде ссылки в каждом конкретном задании, что опубликовано ниже.


You need to following structure: abstarct class Bank and three classes that extends it: USBank, EUBank, ChinaBank. Enum Currency. Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.

Finally create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank. Run four different operations with erery User’s baalance and print its objects to console.
TASK 1
Abstract class Bank should contain fields
long id
String bankCountry
Currency currency
int numberOfEmployees
double avrSalaryOfEmployee
long rating
long totalCapital

Generate getters and setters. And create constructor with all fields.

Methods are:
abstract int getLimitOfWithdrawal()
abstract int getLimitOfFunding()
abstract int getMonthlyRate()
abstract int getCommission(int summ)
double moneyPaidMonthlyForSalary()
TASK 2

Currency is an Enum with two values: USD, EUR
TASK 3
USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 2% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000
EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
limit of funding - 20000 if EUR and 10000 if USD
monthly rate - 0% with USD and 1% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
2% if EUR and up to 1000 and 4% if EUR and more than 1000
ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR

limit of funding - 5000 if EUR and 10000 if USD
monthly rate - 1% with USD and 0% with EUR
commision - 3% if USD and up to 1000, 5% if USD and more than 1000
10% if EUR and up to 1000 and 11% if EUR and more than 1000
TASK 4

User should have following fields:

long id
String name
double balance
int monthsOfEmployment
String companyName
int salary
Bank bank

User does not have its own methods. But overrides toString method.

TASK 5

Create interface BankSystem with methods:

void withdrawOfUser(User user, int amount)
void fundUser(User user, int amount)
void transferMoney(User fromUser, User toUser, int amount)
void paySalary(User user)

And its implementation

TASK 6

Сreate Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank. Run four different operations with erery User’s baalance and print its objects to console.

Русский вариант



Создайте следующую структуру:
1. Абстрактный класс Bank и 3 класса, которые его расширяют: USBank, EUBank, ChinaBank.
2. Enum Currency.
3. Класс User, который отображает пользователя банковской системы.
4. Интерфейс BankSystem и его реализацию BankSystemImpl.
5. Класс Main с методом main, где вы должны создать 6 объектов класса User (2 - USBank, 2 - EUBank, 2 - ChinaBank).

Выполните 4 разных операций с балансом каждого пользователя и выведите эти объекты в консоль.

Задание 1

Абстрактный класс Bank должен содержать поля:
long id
String bankCountry
Currency currency
int numberOfEmployees
double avrSalaryOfEmployee
long rating
long totalCapital

Создайте get-,set-методы и конструктор с аргументами - всеми полями.
Методы:
abstract int getLimitOfWithdrawal()
abstract int getLimitOfFunding()
abstract int getMonthlyRate()
abstract int getCommission(int summ)
double moneyPaidMonthlyForSalary()

Задание 2

Currency - это Enum с двумя значениями: USD, EUR.

Задание 3

USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
лимит пополнения - 10000, если EUR, и нет лимита, если USD
месячная ставка - 1% на USD и 2% на EUR
комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
6%, если EUR и до 1000 и 8%, если EUR и больше 1000

EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
лимит пополнения - 20000, если EUR и 10000, если USD
месячная ставка - 0% на USD и 1% на EUR
комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
2%, если EUR и до 1000 и 4%, если EUR и больше 1000
ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
лимит пополнения - 5000, если EUR и 10000, если USD
месячная ставка - 1% на USD и 0% на EUR
комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
10%, если EUR и до 1000 и 11%, если EUR и больше 1000

Задание 4

В классе User должны быть следующие поля:
long id
String name
double balance
int monthsOfEmployment
String companyName
int salary
Bank bank

Создайте get-/set- методы для них.
Класс User не имеет собственных методов. Но переопределяет метод toString.

Задание 5

Создать интерфейс BankSystem с методами:
void withdrawOfUser(User user, int amount)
void fundUser(User user, int amount)
void transferMoney(User fromUser, User toUser, int amount)
void paySalary(User user)
и его релизацию. */