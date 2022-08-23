package Study04_work;

public class study_4_07 {
    public static void main(String[] args) {
        // 객체 생성
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);

        // 송금: 3천원씩 a 계좌에서 -> b계좌로!
        boolean result = true;
        while (result) {
            result = a.transfer(b, 3000);
        }

        // 결과 출력
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}

class Account {
    String num; // 계좌
    int balance; // 잔액

    public Account() {
    }

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account target, int amount){
        if (balance<3000) {
            return false;
        }
        balance -= 3000;
        target.balance += 3000;

        return true;
    }

    public String toString(){
        return String.format("Account { num: %s, balance: %d }", num,balance);
    }
}
