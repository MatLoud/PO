
package herencia;
// Subclase de Animal
public class Mamifero extends Animal {
    // Atributo adicional
    private String tipoPelaje;

    // Constructor
    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad);  // Llamada al constructor de la superclase (Animal)
        this.tipoPelaje = tipoPelaje;
    }

    // Método adicional
    public void amamantarCrias() {
        System.out.println(nombre + " esta amamantando a sus crias.");
    }

    // Método para obtener el tipo de pelaje
    public void mostrarPelaje() {
        System.out.println(nombre + " tiene un pelaje de tipo: " + tipoPelaje);
    }
}

