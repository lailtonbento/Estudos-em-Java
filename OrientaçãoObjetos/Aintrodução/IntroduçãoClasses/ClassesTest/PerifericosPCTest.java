package JavaCore.Aintrodução.IntroduçãoClasses.ClassesTest;

import JavaCore.Aintrodução.IntroduçãoClasses.Classes.PerifericosPC;

public class PerifericosPCTest {
    public static void main(String[] args) {
        PerifericosPC perifericos = new PerifericosPC();
        perifericos.teclado = "Dazz Alpha Red";
        perifericos.mouse = "Sharkoon Light 2 200";
        perifericos.headset = "Havit Hd2002";
        perifericos.monitor = "LG 24pol Full HD IPS";

        perifericos.imprime();
    }
}
