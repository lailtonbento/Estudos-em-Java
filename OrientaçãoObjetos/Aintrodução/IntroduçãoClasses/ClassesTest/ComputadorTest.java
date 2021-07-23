package JavaCore.Aintrodução.IntroduçãoClasses.ClassesTest;

import JavaCore.Aintrodução.IntroduçãoClasses.Classes.Computador;

public class ComputadorTest {
    public static void main(String[] args) {
        Computador pc1 = new Computador();
        pc1.placaMae = "A320m-K/br";
        pc1.processador = "Ryzen 5 2400G";
        pc1.memoria = "DDR4 16GB";
        pc1.gabinete = "Redragon Sideswipe";

        pc1.imprimeC();
    }
}
