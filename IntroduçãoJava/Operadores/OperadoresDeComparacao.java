package IntroduçãoJava.DevDojo.Operadores;

/* Operadores de Comparação:

> = maior que
< = menor que
== = igual
>= = mair ou igual a
<= = menor ou igual a
!= = diferente de

 */
public class OperadoresDeComparacao {
    public static void main(String [] args) {
        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezMaiorIgualVinte = 10 >= 20;
        boolean dezMenorIgualVinte = 10 <= 20;
        boolean cincoIgualCinco = 5 == 5;
        boolean cincoDiferenteCinco = 5 != 5;
        System.out.println(cincoDiferenteCinco);
    }
}
