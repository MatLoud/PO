
package clase.pkg1;

public class Calculadora {
public double a,b;
public Calculadora(double a, double b){
 this.a = a;
 this.b = b;
}
public double suma(){ return a+b;}
public double resta(){ return a-b;}
public double mult(){ return a*b;}
public double div(){  
    if (b!=0) {
            return a/b;
        } else {
            System.out.println("Error: División entre cero no permitida.");
            return 0;
        }
}
}
