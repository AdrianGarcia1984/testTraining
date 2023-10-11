import services.calculadoraServicio;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        calculadoraServicio cs = new calculadoraServicio();
        System.out.println("Hello calculadora!");
        System.out.println(cs.add(23d,30d));

    }


}