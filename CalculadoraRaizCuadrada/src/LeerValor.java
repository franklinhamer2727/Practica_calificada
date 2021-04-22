
import java.util.*;
public class LeerValor {
    // private double numero;
    
    // public LeerValor(){
    //     this.numero =0;
    // }
    // public LeerValor(double numero){
    //     this.numero = numero;
    // }
    // public double getNumero(){
    //     return numero;
    // }


    public static double leerValor() throws ValorNoValido {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número > 0 ");
        double n = sc.nextDouble();
        if (n < 0) {
            throw new ValorNoValido("El número debe ser positivo");                                             
        }
        return n;
    }


    public static double RaizCuadrada(double x){
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        try {
            double x = leerValor();
            System.out.println("Raiz cuadrada de " + x + " = " + RaizCuadrada(x));                                   
        }catch (ValorNoValido e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());

        }
   }
   

    
}
