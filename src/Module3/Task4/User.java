package Module3.Task4;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public static void main(String[] args) {
        User user = new User("Bob", 100000, 6, "GoIT", 9999, "грн.");
        user.withdraw(99999);
        user.paySalary(10000);
        System.out.println("метод companyNameLenght = " + user.companyNameLenght());
        System.out.println("метод monthIncreaser = " + user.monthIncreaser(4));
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    // добавляет заработную плату к балансу пользователя
    void paySalary(int salary) {
        this.balance += salary;
        System.out.println("метод paySalary =" +this.balance + " " + this.currency);
    }

    // снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
    void withdraw(int summ) {
        double percent = 0.1;
        if (summ < 1000) {
            percent = 0.05;
        }
        int transaction = (int)(summ + (summ * percent));
        if (this.balance < transaction) {
            System.out.println("метод withdraw = Невозможно снять больше чем есть в наличии");
            return;
        } else {
            this.balance -= transaction;
            System.out.println("метод withdraw = " + this.balance + " " + this.currency);
        }
    }

    //вычисляет длину имя компании
    public int companyNameLenght() {
        return this.companyName.length();
    }

    // увеличивает monthsOfEmployment на addMonth
    public int monthIncreaser(int addMonth) {
        return this.monthsOfEmployment += addMonth;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }
}


/*
ЗАДАНИЕ 4
Создайте класс User со следующими полями:
 String name,
 int balance,
 int monthsOfEmployment,
 String companyName,
 int salary,
 String currency.
Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
Напишите методы:
 void paySalary() - добавляет заработную плату к балансу пользователя
 withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 companyNameLenght - вычисляет длину имя компании
 monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
 ЗАДАНИЕ 4
Create User class with the following fields: String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency.
Create getters and setters and constructor with all fileds.
Write methods:
void paySalary() -  that add salary to the balance of the user
withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
companyNameLenght - calculates name of the company name
monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 */