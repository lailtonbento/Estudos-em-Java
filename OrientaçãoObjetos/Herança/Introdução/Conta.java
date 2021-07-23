package JavaCore.Herança.Introdução;

public class Conta {
    private int number;
    private String holder;
    protected double balance;


    public Conta(){
    }

    public Conta(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;

    }
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


}
