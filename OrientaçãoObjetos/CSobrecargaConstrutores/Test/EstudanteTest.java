package JavaCore.CSobrecargaConstrutores.Test;

import JavaCore.CSobrecargaConstrutores.Classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("João", "12313", new double[] {5,7,9}, "14/06/2021");
        est.imprime();
    }
}
