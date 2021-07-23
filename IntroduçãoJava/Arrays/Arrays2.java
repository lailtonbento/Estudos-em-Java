package IntroduçãoJava.DevDojo.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[8];
        nomes[0] = "Pedro";
        nomes[1] = "João";
        nomes[2] = "Lucas";
        nomes[3] = "Joaquina";
        nomes[4] = "Maria";
        nomes[5] = "Naruto";
        nomes[6] = "Sasuke";
        nomes[7] = "Gaara";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
