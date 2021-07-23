package ExerciciosPOO.CalculoTriangulo;
/* Classe é uma estrutura onde pode conter métodos e atributos.
Também pode conter:
Construtores
Sobrecarga
Encapsulamento
Herança
Polimorfismo
*/
import java.util.Scanner;

public class CalculoTrianguloTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoTrianguloClass triangulo = new CalculoTrianguloClass();

        System.out.println("Digite o valor da base: ");
        triangulo.baseTriangulo = sc.nextInt();
        System.out.println("Digite o valor da altura: ");
        triangulo.altura = sc.nextInt();

        triangulo.imprime();
        System.out.println("O valor total da área do triangulo é: "+ triangulo.getArea());


    }
}
