package IntroduçãoJava.DevDojo.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        // Outras formas de criar um array
        int[] numeros2 = {1,2,3,4,5};
        // int[] numeros3 = new int []{1, 2, 3, 4, 5};

//        for (int i = 0;i< numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }
        // For each
        for (int num : numeros2){
            System.out.println(num);
        }
    }
}
