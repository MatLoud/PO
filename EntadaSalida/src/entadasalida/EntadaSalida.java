package entadasalida;
import java.util.Scanner;
public class EntadaSalida {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Coloca tu nombre:");
        String nombre=leer.nextLine();
        System.out.println("Hola "+nombre+"!\nColoca tus dos numeros a calcular");
        double num1=leer.nextDouble();
        double num2=leer.nextDouble();
        Operaciones cal=new Operaciones(num1,num2);
        System.out.println("la suma de "+num1+" y de "+num2+" es "+cal.suma());
        System.out.println("la resta de "+num1+" y de "+num2+" es "+cal.resta());
        System.out.println("la multiplicacion de "+num1+" y de "+num2+" es "+cal.Mult());
        System.out.println("la division de "+num1+" y de "+num2+" es "+cal.Div());}
//Ya esta XDDDD
        
}
   
