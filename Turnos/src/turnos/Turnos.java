
package turnos;

import controller.GestionPaciente;

public class Turnos {


    public static void main(String[] args) {
        GestionPaciente g=new GestionPaciente();
        g.AggPaaciente("mateo", "123", 20, true);
        g.AggPaaciente("marco", "113", 10, true);
        g.listado();
    }
    
}
