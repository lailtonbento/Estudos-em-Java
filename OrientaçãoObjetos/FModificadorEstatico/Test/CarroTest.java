package JavaCore.FModificadorEstatico.Test;

import JavaCore.FModificadorEstatico.Classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.velocidadeLimite = 220;
        Carro c1 = new Carro("Fusca", 280);
        Carro c2 = new Carro("Gol quadrado 1992", 280);
        Carro c3 = new Carro("Chevette 1975", 280);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
