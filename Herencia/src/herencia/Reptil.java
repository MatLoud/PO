
package herencia;
// Subclase de Animal
public class Reptil extends Animal {
    // Atributo adicional
    private String tipoEscamas;

    // Constructor
    public Reptil(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad);  // Llamada al constructor de la superclase (Animal)
        this.tipoEscamas = tipoEscamas;
    }

    // Método adicional
    public void arrastrarse() {
        System.out.println(nombre + " se esta arrastrando.");
    }

    // Método para obtener el tipo de escamas
    public void mostrarEscamas() {
        System.out.println(nombre + " tiene escamas de tipo: " + tipoEscamas);
    }
}

