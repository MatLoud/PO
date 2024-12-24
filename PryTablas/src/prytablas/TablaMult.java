
package prytablas;

abstract class TablaMult {
 protected int numero;

    public TablaMult(int numero) {
        this.numero = numero;
    }
    // Método abstracto para generar la tabla de multiplicar
    public abstract void generarTabla();
    //Suma los resultados
    public abstract int sumarResultados();
}
   
