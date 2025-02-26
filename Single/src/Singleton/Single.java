
package Singleton;

import Controller.Config;
import Controller.ContadorGlobal;
import java.util.ArrayList;

public class Single {

    public static void main(String[] args) {
        ContadorGlobal contador=ContadorGlobal.getInstance();
        contador.incremento(1);
        ArrayList<String> idioma = new ArrayList<>();
        idioma.add("Espanol");
        idioma.add("Ingles");
        idioma.add("Frances");
        
        Config cel1=Config.Inicializar();
        Config cel2=Config.Inicializar();
        String tema[]={"Oscuro","Claro"};
        cel2.setTema(tema[1]);
        cel1.setIdioma(idioma.get(contador.getIncremento()));
        cel1=Config.Inicializar();
        cel1.mostrarConfig();
        cel2.mostrarConfig();
    }
    
}
