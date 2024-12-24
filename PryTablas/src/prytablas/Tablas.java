
package prytablas;

class Tablas extends TablaMult implements TablaInv{

    public Tablas(int numero) {
        super(numero);
    }
     @Override
    public void generarTabla() {
        System.out.println("Tabla de multiplicar del " + numero + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    } 
    @Override
    public void generarTablaInv(){
    System.out.println("Tabla de multiplicar del " + numero + " en orden descendente:");
        for (int i = 10; i > 0; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    @Override
    public int sumarResultados() {
      int suma = 0;
        for (int i = 1; i <= 10; i++) {
        suma += numero * i;}
        return suma;   
    }
}
