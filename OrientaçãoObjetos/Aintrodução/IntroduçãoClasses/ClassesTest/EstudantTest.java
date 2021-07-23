package JavaCore.Aintrodução.IntroduçãoClasses.ClassesTest;

import JavaCore.Aintrodução.IntroduçãoClasses.Classes.Estudantes;

public class EstudantTest {
    public static void main(String[] args) {
        Estudantes joao = new Estudantes();
        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 15;

        joao.imprime();
    }
}
