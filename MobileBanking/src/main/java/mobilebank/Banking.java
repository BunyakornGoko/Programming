package mobilebank;
import java.util.*;

public abstract class Banking {
    private String Account_name;
    private int Bank_id;
    private int balance;
    private int withdraw;
    private int coins;
    private int Deposit;
    private  int tranferto;


    public Banking(String account_name,int bank_id, int balance) {
        Account_name = account_name;
        Bank_id = bank_id;
        this.balance = balance;
    }

    public String getAccount_name() {
        return Account_name;
    }

    public void setAccount_name(String account_name) {
        Account_name = account_name;
    }

    public int getBank_id() {
        return Bank_id;
    }

    public void setBank_id(int bank_id) {
        Bank_id = bank_id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }


    public int getWithdraw() {
        return withdraw;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    @Override
    public String toString() {
        return "Banking{" +
                "Account_name='" + Account_name + '\'' +
                ", Bank_id=" + Bank_id +
                ", balance=" + balance +
                ", Coins=" + coins +"}";
    }
    public abstract String operating_sound();
    public  abstract String tranfer_sound();

    public boolean checkBanKing(int amount){
        if (amount <= 0 || amount > balance ){
            return false;
        }
        return true;
    }
    public void Withdraw(int amount1){
        if(amount1 <= 0 || amount1 > balance){
            throw new RuntimeException("You can't withdraw in transaction");
        }
        balance = balance - amount1;
        this.withdraw = amount1;
    }

    public void Tranfer(Banking o,int money){
        if(money <= 0 || money > balance){
            throw  new RuntimeException("You can't tranfer in transaction");
        }
        this.balance -= money;
        o.setBalance(money);
        tranferto = money;
    }
    public void DePoSit(int deposit){
        Deposit = balance + deposit;
        this.balance = Deposit;
    }
    public int getMyCoins(int deposit2){
        for (int i = 0;i < deposit2;i++){
            if(deposit2 / 100 == i){
                coins+=i;
                this.coins = coins;
            }
        }
        return coins;
    }
    public void checkStatement(){

    }
}
