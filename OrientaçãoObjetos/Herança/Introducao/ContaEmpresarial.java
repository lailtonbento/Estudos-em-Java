package JavaCore.Heranca.Introducao;

public class ContaEmpresarial extends Conta {
    private double loanLimit;

    public ContaEmpresarial() {

    }

    public ContaEmpresarial(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
