package JavaCore.DBlocodeInicialização.Classes;

public class Cliente {
    private int[] parcelas;
    // 1 - Alocado espaco em eoria pro objeto
    // Cada atributo de classe é criado e inicializado com valores default
    // Bloco de inializacao é executado
    // Construtor é executado

    {
        parcelas = new int[100];
        for (int parcela : parcelas) {
            System.out.println(parcela);
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
