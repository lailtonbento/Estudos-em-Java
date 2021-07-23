package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        int contador = 100000;
        for (int i = 0; i <= contador; i++)
            if (i%2 ==0) {
                System.out.println(i);
            }
    }
}
