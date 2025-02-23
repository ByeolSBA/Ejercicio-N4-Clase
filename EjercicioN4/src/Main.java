abstract class FormaGeometrica {
    private String color;

    public FormaGeometrica() {
        this.color = "sin color";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();
}

class Rectangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends FormaGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5);
        rectangulo.setColor("rojo");
        System.out.println("El área del rectángulo de color " + rectangulo.getColor() + " es: " + rectangulo.calcularArea());

        Circulo circulo = new Circulo(7);
        circulo.setColor("azul");
        System.out.println("El área del círculo de color " + circulo.getColor() + " es: " + circulo.calcularArea());
    }
}
