package JavaCore.Aintrodução.IntroduçãoClasses.ClassesTest;

import JavaCore.Aintrodução.IntroduçãoClasses.Classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "João";
        prof.matricula = "2021.1";
        prof.rg = "RG: 231935912-0";
        prof.cpf = "CPF: 320.129.511-23";

        prof.imprime();

    }
}
