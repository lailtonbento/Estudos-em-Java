package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class  ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 14;

        if (idade < 15) {
            System.out.println("Você está na categoria Infantil!");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Você está na categoria Juvenil!");
        } else {
            System.out.println("Você está na categoria Adulto!");
        }
    }
}
