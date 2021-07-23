package IntroduçãoJava.DevDojo.ControleDeFluxo;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        String sexo = "F";
        switch (sexo) {
            case "F":
                System.out.println("Você escolheu a opção feminino!");
                break;
            case "M":
                System.out.println("Você escolheu a opção masculino!");
                break;
            default:
                System.out.println("Opção Invalida. Tente novamente!");
                break;

        }
    }
}
