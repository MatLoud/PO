
package recuerdos;
import java.util.Scanner;
public class Recuerdos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pareja pareja = new Pareja("Juan y Maria");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar recuerdo de "+pareja.getNombre1());
            System.out.println("2. Agregar recuerdo de "+pareja.getNombre2());
            System.out.println("3. Visualizar recuerdos de "+pareja.getNombre1());
            System.out.println("4. Visualizar recuerdos de "+pareja.getNombre2());
            System.out.println("5. Cambiar recuerdo de "+pareja.getNombre1());
            System.out.println("6. Cambiar recuerdo de "+pareja.getNombre2());
            System.out.println("Digite otro numero para salir");

            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el recuerdo del hombre: ");
                    String recuerdoHombre = scanner.nextLine();
                    pareja.agregarRecuerdoHombre(new Recuerdo(recuerdoHombre));
                    break;
                case 2:
                    System.out.print("Ingrese el recuerdo de la mujer: ");
                    String recuerdoMujer = scanner.nextLine();
                    pareja.agregarRecuerdoMujer(new Recuerdo(recuerdoMujer));
                    break;
                case 3:
                    pareja.visualizarRecuerdosHombre();
                    break;
                case 4:
                    pareja.visualizarRecuerdosMujer();
                    break;
                case 5:
                    System.out.print("Ingrese la posicion del recuerdo que desea cambiar: ");
                    int posicionHombre = scanner.nextInt();
                    scanner.nextLine(); // Consume el salto de línea
                    System.out.print("Ingrese el nuevo recuerdo de "+pareja.getNombre1()+": ");
                    String nuevoRecuerdoHombre = scanner.nextLine();
                    pareja.cambiarRecuerdoHombre(posicionHombre - 1, new Recuerdo(nuevoRecuerdoHombre));
                    break;
                case 6:
                  System.out.print("Ingrese la posicion del recuerdo de la mujer que desea cambiar: ");
                    int posicionMujer = scanner.nextInt();
                    scanner.nextLine(); // Consume el salto de línea
                    System.out.print("Ingrese el nuevo recuerdo de "+pareja.getNombre2()+": ");
                    String nuevoRecuerdoMujer = scanner.nextLine();
                    pareja.cambiarRecuerdoMujer(posicionMujer - 1, new Recuerdo(nuevoRecuerdoMujer));
                    System.out.println("Recuerdo cambiado con exito.");
                    break;
                default: 
                  System.exit(0);
    }
    
   }
}
}