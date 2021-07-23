package JavaCore.Aintrodução.IntroduçãoMetodos.Classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplcaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma +=  num;
        }
        System.out.println(soma);
    }
    // Utilizando o metodos Var Args.
    public void somaVarargs (int... numeros1){
        int soma = 0;
        for (int num : numeros1){
            soma += num;
        }
        System.out.println(soma);
    }
}
