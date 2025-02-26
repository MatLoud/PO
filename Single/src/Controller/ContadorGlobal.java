
package Controller;

public class ContadorGlobal {
  //variable statica de tipo privado para almacenar unica instancia
  private static ContadorGlobal instance;
  //variable para almacenar el incremento
  private int contador=0;
  //constructor privado para las nuevas instancias
    private ContadorGlobal() {
    }
    //metodo que verifica si la instancia existe
    public static ContadorGlobal getInstance(){
    if(instance==null){instance=new ContadorGlobal();}
    return instance;} 
    //incrementa el contador en 1
    public void incremento(int cuenta){contador=+cuenta;}
    //se obtiene el contador
    public int getIncremento(){ return contador;}
    public void imprimirIncremento(){System.out.println("Contador: "+contador);}
}
