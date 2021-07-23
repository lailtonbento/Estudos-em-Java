package IntroduçãoJava.DevDojo.Operadores;/* Operadores de Atribuição

= igual
-= Menos Igual
+= Mais Igual
/= Divisão Igual
%= Resto Igual
 */

public class OperadoresDeAtribuição {
    public static void main(String[] args) {
    int salario = 1800;
    // salario += 1000;
    salario = salario + (int) (salario * 0.1);
    int numero = 21;
    // numero = numero % 2;
    numero %= 2;
    System.out.println(numero);
    }
}
