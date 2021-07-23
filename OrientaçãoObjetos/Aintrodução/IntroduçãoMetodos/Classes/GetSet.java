package JavaCore.Aintrodução.IntroduçãoMetodos.Classes;

public class GetSet {
    private double Notass1;
    private double Notass2;
    private double Notass3;
    private double Notass4;
    public double totalDeNotas;

    public void mostrar() {
        totalDeNotas = (Notass1 + Notass2 + Notass3 + Notass4) / 4;
        System.out.println(totalDeNotas);

    }

    public double getNotass1() {

        return Notass1;
    }

    public void setNotass1(double Notass1) {
        this.Notass1 = Notass1;

    }

    public double getNotass2() {
        return Notass2;
    }

    public void setNotass2(double Notass2) {
        this.Notass2 = Notass2;

    }

    public double getNotass3() {
        return Notass3;
    }

    public void setNotass3(double Notass3) {
        this.Notass3 = Notass3;

    }

    public double getNotass4() {
        return Notass4;
    }

    public void setNotass4(double Notass4) {
        this.Notass4 = Notass4;

    }
}
