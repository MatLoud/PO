
package herencia;

public class Herencia {

    public static void main(String[] args) {
    Mamifero mamifero = new Mamifero("Leon", 5, "Corto");
        Ave ave = new Ave("Aguila", 3, 2.5);
        Reptil reptil = new Reptil("Cobra", 2, "Lisas");

        // Invocar métodos de cada objeto
        mamifero.comer();
        mamifero.dormir();
        mamifero.amamantarCrias();
        mamifero.mostrarPelaje();

        System.out.println();  // Salto de línea entre animales

        ave.comer();
        ave.dormir();
        ave.volar();

        System.out.println();  // Salto de línea entre animales

        reptil.comer();
        reptil.dormir();
        reptil.arrastrarse();
        reptil.mostrarEscamas();
    }
 }
    

