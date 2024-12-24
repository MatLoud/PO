
package prysonidos;

public class Perro implements Mamifero {
    @Override
    public void hacerSonido() {
        System.out.println("Ladrar");
    }

    @Override
    public void amamantar() {
        System.out.println("El perro amamanta a sus cachorros");
    }
}