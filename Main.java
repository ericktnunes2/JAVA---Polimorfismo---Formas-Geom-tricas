import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList<>();
        Circulo circulo1 = new Circulo(4);
        Retangulo retangulo1 = new Retangulo(2, 4);
        Triangulo triangulo1 = new Triangulo(3, 5);

        listaFormas.add(circulo1);
        listaFormas.add(retangulo1);
        listaFormas.add(triangulo1);

        for (Forma item : listaFormas){
            item.calcularArea();
        }
    }
}
