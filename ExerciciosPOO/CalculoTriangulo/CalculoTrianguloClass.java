package ExerciciosPOO.CalculoTriangulo;

public class CalculoTrianguloClass {
    public int baseTriangulo;
    public int altura;

    public CalculoTrianguloClass (){
    }
    public int getArea() {
        return (baseTriangulo * altura) / 2;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public void imprime () {
        System.out.println("Base do Triangulo: " + this.baseTriangulo);
        System.out.println("Altura do Triangulo: " + this.altura);
    }

    private int area;



    }
