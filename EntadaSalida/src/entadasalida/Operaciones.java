
package entadasalida;

public class Operaciones {
    public double a;
    public double b;

    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double suma(){return a+b;}
    public double resta(){return a-b;}
    public double Mult(){return a*b;}
    public double Div(){
    try {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}

