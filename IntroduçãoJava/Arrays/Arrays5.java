package IntroduçãoJava.DevDojo.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        // voce tem um array com 3 indice [0,1,2] , cada indice [0],[1],[2] faz referencia a um array com 3 indices
        int[][] dias = new int[3][3];

        //   i  j
        dias[0][0] = 31;
        dias[0][1] = 29;
        dias[0][2] = 29;

        //   i  j
        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 31;

        //   i  j
        dias[2][0] = 29;
        dias[2][1] = 30;
        dias[2][2] = 31;

        for (int i = 0; i< dias.length;i++){
            System.out.println(dias[i]);
            for (int j = 0; j< dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------");

        // Utilizando For each
        for (int[] ref : dias){
            for (int dia : ref){
                System.out.println(dia);
            }
        }
    }
}
