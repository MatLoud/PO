
package clase.pkg1;
import java.util.Scanner;
public class Clase1 {
public static void main(String[] args) {
// logica
Scanner leer= new Scanner(System.in);
  int terminar=0;
  while(terminar==0) {
    Limpiar.limpiarPantalla(); 
    System.out.println("-----------------------------\nSeleccione la operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Coloque cualquier otro numero para salir del programa...\n-----------------------------");
    int opcion = leer.nextInt();
    if (opcion>=5 || opcion<=0){
    System.exit(0);}
    System.out.println("Coloque sus dos numeros a operar:");
    double a=leer.nextInt();
    double b=leer.nextInt();
    Calculadora cc = new Calculadora(a,b);
     switch (opcion){
        case 1: System.out.println("\nLa Suma de los numeros:"+cc.suma()); break; 
        case 2: System.out.println("\nLa Resta de los numeros:"+cc.resta()); break;
        case 3: System.out.println("\nLa Multiplicacion de los numeros:"+cc.mult()); break;
        case 4: System.out.println("\nLa Division de los numeros:"+cc.div()); break;
        default: terminar=1;
     }
   }
 }
}