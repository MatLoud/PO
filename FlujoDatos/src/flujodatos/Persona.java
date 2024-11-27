
package flujodatos;
public class Persona {
    private String nombre;
    private double altura;
    private double peso;
    private String dni;
    private Hijo hijo;

    // Constructor
    public Persona(String nombre, double altura, double peso, String dni) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    // Método para mostrar información de la persona y su hijo
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("DNI: " + dni);

        if (hijo != null) {
            System.out.println("Hijo: " + hijo.getNombre());
            System.out.println("Edad del Hijo: " + hijo.getEdad());
        } else {
            System.out.println("No tiene hijo registrado.");
        }
    }
}

