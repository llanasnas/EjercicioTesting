public class Cuadrado implements Figuras{

    private double area;
    private double perimetro;
    private double lado;


    public Cuadrado(double lado) {
        this.lado = lado;
        setArea();
        setPerimetro();
    }

    public void setArea() {
        this.area = Math.pow(this.lado,2);
    }

    public void setPerimetro() {
        this.perimetro = lado * 4;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
