
package prytablas;
import java.util.Scanner;
public class PryTablas {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    Menu men=new Menu();
    int i=0;
    //operacion de una sola vez
        System.out.println("Coloque su numero a operar: ");
       int numero=leer.nextInt();
       
    while (i==0){
      Tablas tab=new Tablas(numero);
      men.MenuIn();
      int opcion=leer.nextInt();
        switch(opcion){
            case 1:
            tab.generarTabla();
            break;
            case 2:
            tab.generarTablaInv();
            break;
            case 3:
            System.out.println("Su suma total es: "+tab.sumarResultados());
            break;
            case 4:
            System.out.println("Coloca tu nuevo numero");
            numero=leer.nextInt();
            break;
            default:
            System.exit(0);
            break;
        }
      System.out.println("Coloca enter para continuar");
      leer.nextLine();
      String hola=leer.nextLine();
      men.dameEspacio(10);
    } 
    }
    
}
