
package holamundo;
import java.util.Scanner;
public class CLase {
    
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    Alumno alu1 = new Alumno ();
    Alumno alu2 = new Alumno (1727684308,"Mateo","Fernandez");
    System.out.println("La Cedula del estudiante 2 es: " + alu2.getCedula());
    System.out.println("Su nombre es: "+alu2.getNombre()+" y de apellido: "+alu2.getApellido());
    System.out.print("Cedula: ");
    int cedula = scanner.nextInt();
    alu1.setCedula(cedula);
    System.out.print("Nombre: ");
    String dato=scanner.next();
    alu1.setNombre(dato);
    System.out.print("apellido: ");
    String dato1 =scanner.next();
    alu1.setApellido(dato1);
    System.out.println("La Cedula del estudiante 1 es: " + alu1.getCedula());
    System.out.println("Su nombre es: "+alu1.getNombre()+" y de apellido: "+alu1.getApellido());
   }
}