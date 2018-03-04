public class Rectangulo implements Figuras{

    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        setArea();
        setPerimetro();
    }

    public void setPerimetro() {
        this.perimetro = (this.altura*2) + (this.base*2);
    }

    public void setArea() {
        this.area = this.base * this.altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
