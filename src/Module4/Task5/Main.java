package Module4.Task5;


import Module4.Task3.User;
import Module4.Task1.USBank;
import Module4.Task1.EUBank;
import Module4.Task1.ChinaBank;
import Module4.Task2.Currency;
import Module4.Task4.BankSystemImpl;

public class Main {
    public static void main(String[] args) {

        //2 US banks
        USBank UBankUSD = new USBank(123456, "USA", Currency.USD, 120, 15000,
                11111111,100000000);

        USBank UBankEUR = new USBank(123457, "USA", Currency.EUR, 100, 12000,
                111111,90000000);

        //2 EU banks
        EUBank EBankEUR = new EUBank(1234567, "Germany", Currency.EUR, 200, 15000,
                222222221,15000000);

        EUBank EBankUSD = new EUBank(1234567, "France", Currency.USD, 90, 12500,
                222222222,10000000);

        //2 China banks
        ChinaBank CBankEUR = new ChinaBank(12345, "China", Currency.EUR, 100, 10000,
                1234567,1000000);

        ChinaBank CBankUSD = new ChinaBank(12346, "China", Currency.USD, 1000, 11000,
                12345678,1100000);

        // create 6 users
        User Bob = new User(100,"Bob",20000,30,"Bob's Company",2000, EBankEUR);
        User Ann = new User(101,"Ann",30000,12,"Ann's Company",3000, EBankUSD);

        User John = new User(200,"John",100000,100," John's Company",4000, UBankUSD);
        User Kate = new User(201,"Kate",60000,30,"Kate's Company",3000, UBankEUR);

        User Don = new User(301,"Don",100,20,"Don's Company",100, CBankUSD);
        User Donna = new User(302,"Donna",200,15,"Donna's Company",50, CBankEUR);

        System.out.println("The banks are: ");
        System.out.println(EBankEUR);
        System.out.println(EBankUSD);
        System.out.println(UBankEUR);
        System.out.println(UBankUSD);
        System.out.println(CBankEUR);
        System.out.println(CBankUSD);

        System.out.println("The users are: ");
        System.out.println(Bob);
        System.out.println(Ann);
        System.out.println(John);
        System.out.println(Kate);
        System.out.println(Don);
        System.out.println(Donna);

        BankSystemImpl myWorld = new BankSystemImpl();

        myWorld.withdrawOfUser(Bob,1000);
        myWorld.fundUser(Bob,500);
        myWorld.transferMoney(Bob, Ann, 100);
        myWorld.paySalary(Bob);

        myWorld.withdrawOfUser(Ann,100);
        myWorld.fundUser(Ann,1000);
        myWorld.transferMoney(Ann, Donna, 100000);
        myWorld.paySalary(Ann);

        myWorld.withdrawOfUser(John,2000);
        myWorld.fundUser(John,10000);
        myWorld.transferMoney(John, Kate, 1000);
        myWorld.paySalary(John);

        myWorld.withdrawOfUser(Kate,100000000);
        myWorld.fundUser(Kate,1000);
        myWorld.transferMoney(Kate, Ann, 1000);
        myWorld.paySalary(Kate);

        myWorld.withdrawOfUser(Don,1000);
        myWorld.fundUser(Don,500);
        myWorld.transferMoney(Don, Ann, 10);
        myWorld.paySalary(Don);

        myWorld.withdrawOfUser(Donna,100);
        myWorld.fundUser(Donna,5);
        myWorld.transferMoney(Donna, Don, 90);
        myWorld.paySalary(Donna);

    }
}
