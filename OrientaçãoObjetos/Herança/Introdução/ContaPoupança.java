package JavaCore.Herança.Introdução;

public class ContaPoupança extends Conta {
    private double interestRate;

    public ContaPoupança () {
        super();
    }

    public ContaPoupança(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
