package JavaCore.Herança.Introdução;
public class Application {
    public static void main(String[] args) {
        Conta acc = new Conta(1000, "João", 0.0);
        ContaEmpresarial cemp = new ContaEmpresarial(1001, "Maria", 0.0, 500);


        // UPCASTING

        Conta acc1 = cemp;
        Conta acc2 = new ContaEmpresarial(1002, "Jose", 0.0, 200);
        Conta acc3 = new ContaPoupança(1003, "Francisco", 0.0, 0.01);

        // DOWNCASTING
        ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
        acc4.loan(100.0);

        // ERROR > ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
        if (acc3 instanceof ContaEmpresarial){
            ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
            acc5.loan(200);
            System.out.println("Emprestimo");
        }
        if (acc3 instanceof ContaPoupança){
            ContaPoupança acc5 = (ContaPoupança)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
