public class Retangulo extends Forma{

    private double largura;
    private double lado;

    public Retangulo(double largura, double lado) {
        this.largura = largura;
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do retângulo: "+ largura * lado);
    }
}
