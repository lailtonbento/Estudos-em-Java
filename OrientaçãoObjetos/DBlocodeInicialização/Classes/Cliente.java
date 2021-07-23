package JavaCore.DBlocodeInicialização.Classes;

public class Cliente {
    private int[] parcelas;

    {
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
            System.out.println(i);
        }
    }

    public Cliente() {

    }

    public Cliente(int[] parcelas) {
        this.parcelas = parcelas;
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
