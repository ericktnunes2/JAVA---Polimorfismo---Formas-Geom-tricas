public class Triangulo extends Forma{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do triângulo: " + base * altura / 2);
    }
}
