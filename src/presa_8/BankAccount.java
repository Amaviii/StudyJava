package presa_8;

public class BankAccount {

    //Приватные поля (скрыты от внешнего кода)
    private double balance = 20000.0;
    private String accountNumber = "DebitCard810294823";

    //Геттер для имени
    public void getBalance() {
        System.out.printf("Баланс на счету: %.2f\n", balance);
    }

    //Метод для поплнения баланса
    void deposit(double amount) {
        balance += amount;
    }

    //Метод для снятия с баланса
    void  withdraw(double amount) {
        if (amount > balance) {
            System.out.println("На счету не достаточно средств");
        } else if (amount <= 0) {
            System.out.println("Сумма должна быть больше нуля");
        }
        else {
            balance -= amount;
            System.out.printf("Со счета снято: %.2f\n", amount);
        }
    }
}

class ResultBank{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        ba.getBalance();
        ba.withdraw(5000);
        ba.getBalance();
        ba.withdraw(40000);
        ba.deposit(32.41);
        ba.getBalance();
        //System.out.println(ba.accountNumber);
    }
}
