public class Comparador {


public int comparaArea(Figuras figura1,Figuras figura2){

    if(figura1.getArea()>figura2.getArea()){
        return 1;
    }else if (figura1.getArea()==figura2.getArea()){
        return 0;
    }else{
        return 2;
    }

}
public int comparaPerimetros(Figuras figura1,Figuras figura2){

    if(figura1.getPerimetro()> figura2.getPerimetro()){
        return 1;
    }else if (figura1.getArea()==figura2.getArea()) {
        return 0;
    }else {
        return 2;
    }


}



}


