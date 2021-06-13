import java.util.*;
public class BankAccount{
    private String account_number;
    private double checking_balance;
    private double savings_balance;

    public static int accounts_number=0;
    public static int total_amount=0;
    private String lRandom (){
        String g="";
        for(int i=0;i<=10;i++){
            Random r =new Random();
            g+=r.nextInt(10);
        }
        return g;
    }
public BankAccount(){
    this.accounts_number=lRandom;
    account_number ++;

}
public double getAccountBalance(){
    return checking_balance;
} 
public double getsavingsBalance(){
    return savings_balance;
}

public void depositCheck(double amount){
    this.checking_balance+=amount;

    

}
public void depositSave(double amount){

    this.savings_balance+=amount;

}
public withdraw(){
    if(this.withdraw>total_amount){
        system.out.println("not have mony");
    }

}
public total_money(){
    
}
}