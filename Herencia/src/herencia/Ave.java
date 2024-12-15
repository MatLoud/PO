
package herencia;
// Subclase de Animal
public class Ave extends Animal {
    // Atributo adicional
    private double envergaduraAlas;

    // Constructor
    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);  // Llamada al constructor de la superclase (Animal)
        this.envergaduraAlas = envergaduraAlas;
    }

    // Método adicional
    public void volar() {
        System.out.println(nombre + " esta volando con una envergadura de alas de " + envergaduraAlas + " metros.");
    }
}
