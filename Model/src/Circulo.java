public class Circulo implements Figuras{

    private double perimetro;
    private double area;
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
        setPerimetro();
        setArea();
    }


    public void setArea() {
        this.area = Math.PI * Math.pow(this.radio,2);
    }

    public void setPerimetro() {
        this.perimetro = Math.PI * this.radio * 2;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
}
