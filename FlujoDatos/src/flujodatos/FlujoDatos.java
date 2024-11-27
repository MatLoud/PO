
package flujodatos;
public class FlujoDatos {

    public static void main(String[] args) {
        // TODO code application logic here

        // Crear un objeto Persona
        Persona persona1 = new Persona("Carlos", 1.75, 70.5, "1717673577");

        // Crear un objeto Hijo
        Hijo hijo = new Hijo("Juan", 10);

        // Asignar el hijo a la persona
        persona1.setHijo(hijo);

        // Mostrar la información de la persona y su hijo
        persona1.mostrarInfo();
    }
}
    
