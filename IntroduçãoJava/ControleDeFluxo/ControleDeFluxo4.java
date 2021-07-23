package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador < 10){
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("Dentro do DO WHILE: "+contador ++);
        }while (contador < 10);

        // (variavel ; condição ; ação)
        for (int i = 1; i < 10; i++) {
            System.out.println("O valor de i é: "+i);
        }
    }
}
