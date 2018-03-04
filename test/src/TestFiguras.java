import org.junit.Assert;
import org.junit.Test;

public class TestFiguras {


    @Test
    public void testCirculoArea(){
        Circulo circulo = new Circulo(2.0);
        double result = circulo.getArea();
        Assert.assertEquals((double) 12.566370614359172953850573533118, result,0.0);
    }
    @Test
    public void testCuadradoArea(){
        Cuadrado cuadrado = new Cuadrado(5.3);
        double result = cuadrado.getArea();
        Assert.assertEquals((double) 28.09, result,0.1);
    }
    @Test
    public void testRectanguloArea(){
        Rectangulo rectangulo = new Rectangulo(8.5,3.2);
        double result = rectangulo.getArea();
        Assert.assertEquals((double) 27.2, result,0.1);
    }
    @Test
    public void testRectanguloPermietro(){
        Rectangulo rectangulo = new Rectangulo(8.5,3.2);
        double result = rectangulo.getPerimetro();
        Assert.assertEquals((double) 23.4, result,0.1);
    }
    @Test
    public void testCirculoPerimetro(){
        Circulo circulo = new Circulo(2.5);
        double result = circulo.getPerimetro();
        Assert.assertEquals((double) 15.707963267948966192313216916398, result,0.0);
    }
    @Test
    public void testCuadradoPerimetro(){
        Cuadrado cuadrado = new Cuadrado(5.3);
        double result = cuadrado.getPerimetro();
        Assert.assertEquals((double) 21.2, result,0.1);
    }
    @Test
    public void testComparadorPerimetres(){

        Circulo circulo = new Circulo(2.33);
        Cuadrado cuadrado = new Cuadrado(5.55);
        Assert.assertEquals((int)2,Comparador.comparaPerimetros(circulo,cuadrado));

    }
    @Test
    public void testComparadorAreas(){

        Circulo circulo = new Circulo(2.33);
        Cuadrado cuadrado = new Cuadrado(5.55);
        Assert.assertEquals((int)1,Comparador.comparaArea(circulo,cuadrado));

    }


}
