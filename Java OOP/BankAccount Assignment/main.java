import java.util.Random;


public class main {

    public static void main(String[] args) {
        BankAccount w=new BankAccount();
        w.add(100);
        w.totalMoney();
        System.out.println(w.withdraw(50));
        w.totalMoney();
    }
    }

