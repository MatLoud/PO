
package Dirty;
import java.util.Scanner;
public class lectura {

    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Coloca una frase que te guste para empezar \n");
    String frase=scanner.nextLine();
    System.out.print("Coloque su nombre: \n");
    String nombre=scanner.nextLine();
    System.out.print("Coloque su Cedula: \n");
    int id=scanner.nextInt();
    System.out.println("Su frase es: "+frase+"\n");
    System.out.println("Autor: "+nombre+"\n De Cedula de identidad:"+id+"\n");
    }
}