package JavaCore.Aintrodução.IntroduçãoMetodos.Classes;

public class ExercicioAluno {
    public String nome;
    public String idade;
    private double nota1;
    private double nota2;
    private double nota3;
    private static final int media = 3;
    private double totalNotas;


    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);
        totalNotas = (nota1 + nota2 + nota3) / 3;
        if (totalNotas > 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
