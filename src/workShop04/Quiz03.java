package workShop04;

public class Quiz03 {
    public static void main(String[] args) {

        Account account = new Account("411-0290-1203",500000,7.3);
        System.out.printf("계좌정보: %s 현재잔액: %d\n",account.account,account.balance);
        account.withdraw(600000);
        account.deposit(20000);
        System.out.printf("계좌정보: %s 현재잔액: %d\n",account.account,account.balance);
        System.out.printf("이자: %.1f", account.calculateInterest());
    }
}

class Account {
    String account;
    int balance;
    double interestRate;

    public Account() {

    }

    public Account(String account, int balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public double calculateInterest() {
        double interest = balance*(interestRate/100);
        return interest;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if (money > balance) {
            System.out.println("출금 할 수 없습니다.");
        } else {
            balance -= money;
        }
    }
}