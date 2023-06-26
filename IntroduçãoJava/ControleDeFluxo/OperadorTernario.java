package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 5000;
        // (condition) ? true : false
        String result = salario == 5000 ? "Eu vou doar 500 pro devDojo" : "Ainda nao tenho condicoes, mas vou ter!";
        System.out.println(result);
    }
}
