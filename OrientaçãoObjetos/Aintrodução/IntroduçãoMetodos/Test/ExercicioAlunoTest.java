package JavaCore.Aintrodução.IntroduçãoMetodos.Test;

import JavaCore.Aintrodução.IntroduçãoMetodos.Classes.ExercicioAluno;

public class ExercicioAlunoTest {
    public static void main(String[] args) {
        ExercicioAluno aluno = new ExercicioAluno();
        aluno.nome = "José";
        aluno.idade = "15 anos";
        aluno.setNota1(8);
        aluno.setNota2(6);
        aluno.setNota3(5);

        aluno.imprime();


    }

}
