package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 17;
        String status;
        status = idade < 18 ? "Não é adulto" : "É adulto"; //  Operador Ternário
        System.out.println(status);
    }
}
