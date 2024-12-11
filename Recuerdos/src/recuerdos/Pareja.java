
package recuerdos;

public class Pareja {
    private String[] nombrePareja;
    private Recuerdo[] recuerdosHombre;
    private Recuerdo[] recuerdosMujer;

    public Pareja(String nombrePareja) {
        this.nombrePareja = nombrePareja.split(" y ");
        this.recuerdosHombre = new Recuerdo[10];
        this.recuerdosMujer = new Recuerdo[10];
    }
     public String getNombre1() {
        return nombrePareja[0];
    }

    public String getNombre2() {
        return nombrePareja[1];
    }
    public void agregarRecuerdoHombre(Recuerdo recuerdo) {
        for (int i = 0; i < recuerdosHombre.length; i++) {
            if (recuerdosHombre[i] == null) {
                recuerdosHombre[i] = recuerdo;
                break;
            }
        }
    }

    public void agregarRecuerdoMujer(Recuerdo recuerdo) {
        for (int i = 0; i < recuerdosMujer.length; i++) {
            if (recuerdosMujer[i] == null) {
                recuerdosMujer[i] = recuerdo;
                break;
            }
        }
    }

    public void visualizarRecuerdosHombre() {
        System.out.println("Recuerdos del Hombre:");
        for (int i = 0; i < recuerdosHombre.length; i++) {
            if (recuerdosHombre[i] != null) {
                System.out.println(recuerdosHombre[i].getDescripcion());
            }
        }
    }

    public void visualizarRecuerdosMujer() {
        System.out.println("Recuerdos de la Mujer:");
        for (int i = 0; i < recuerdosMujer.length; i++) {
            if (recuerdosMujer[i] != null) {
                System.out.println(recuerdosMujer[i].getDescripcion());
            }
        }
    }

    public void cambiarRecuerdoHombre(int posicion, Recuerdo nuevoRecuerdo) {
        if (posicion >= 0 && posicion < recuerdosHombre.length) {
            recuerdosHombre[posicion] = nuevoRecuerdo;
        }
    }

    public void cambiarRecuerdoMujer(int posicion, Recuerdo nuevoRecuerdo) {
        if (posicion >= 0 && posicion < recuerdosMujer.length) {
            recuerdosMujer[posicion] = nuevoRecuerdo;
        }
    }
}
