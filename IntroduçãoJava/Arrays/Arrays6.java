package IntroduçãoJava.DevDojo.Arrays;


public class Arrays6 {
    public static void main(String[] args) {
        int[][] dias = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for (int[] ref : dias) {
            System.out.println("\n----");
            for (int dia : ref) {
                System.out.print(dia + " ");
            }
        }
    }
}
