package JavaCore.Aintrodução.IntroduçãoMetodos.Test;

import JavaCore.Aintrodução.IntroduçãoMetodos.Classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplcaDoisNumeros(5, 5);
        System.out.println(" ----- Divisão de dois numeros ---- ");
        System.out.println(calc.divideDoisNumeros(20, 2));
        System.out.println("Continuando exec.");

        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        calc.somaArray(numeros);
        calc.somaVarargs(1,2,3,4,5);
    }
}
