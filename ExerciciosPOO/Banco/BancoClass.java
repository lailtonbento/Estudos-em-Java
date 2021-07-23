package ExerciciosPOO.Banco;

public class BancoClass {
    private int numeroConta;
    private String titular;
    private double saldo;

    public BancoClass(int numeroConta, String titular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public BancoClass(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void setNumeroconta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){
        saldo += quantia;

    }
    public void saque(double quantia){
        saldo -= quantia + 5.0;

    }

    public String conta(){
        return "Conta: "+numeroConta+ ", Titular: "+titular+ ", Saldo: " +saldo;
    }
}

