
package datosempresa;

public class DatosEmpresa {

    public static void main(String[] args) {
    
        Empresa empresa = new Empresa("Mi Empresa", "123456789", "Av. Principal", "info@miempresa.com");
        Empleado empleado1 = new Empleado("Juan Perez", "123456789", 5000);
        Empleado empleado2 = new Empleado("Maria Rodriguez", "987654321", 6000);

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        System.out.println("Nombre de la empresa: " + empresa.getNombre());
        System.out.println("Empleados de la empresa:");
        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado.toString());
        }
    }

}
