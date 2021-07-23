package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        double valorTotal = 70000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcelado = valorTotal / parcela;
            if (valorParcelado >= 1000) {
                System.out.println("O carro no valor de "+valorTotal + " parcelado em "+ parcela + " de " + valorParcelado);
            }
        }
    }
}
