package JavaCore.FModificadorEstatico.Classes;

public class Carro {
    private String nome;
    private int velocidadeMaxima;
    public static int velocidadeLimite = 240;

    public void imprime() {
        System.out.println("----------------------------");
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public Carro(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
