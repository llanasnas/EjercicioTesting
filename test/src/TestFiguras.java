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
    public void testComparador(){

        Circulo circulo = new Circulo(2.33);
        Cuadrado cuadrado = new Cuadrado(5.55);
        Assert.assertEquals((int)2,Comparador.comparaPerimetro(circulo,cuadrado));

    }


}
