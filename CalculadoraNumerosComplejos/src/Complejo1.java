import java.util.Scanner;
public class Complejo1 {

    private double parteReal;
    private double parteImaginaria;
    
    public Complejo1(){
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    public Complejo1(double parteReal, double parteImaginaria){
        this.parteReal =parteReal;
        this.parteImaginaria = parteImaginaria;
        
    }

    public double getParteReal(){
        return parteReal;
    }
    public double getParteImaginaria(){
        return parteImaginaria;
    }
    public void suma(Complejo1 a, Complejo1 b){
        this.parteReal = a.getParteReal()+ b.getParteReal();
        this.parteImaginaria = a.getParteImaginaria() + b.getParteImaginaria();

    }
    public void resta(Complejo1 a, Complejo1 b){
        this.parteReal = a.getParteReal()- b.getParteReal();
        this.parteImaginaria = a.getParteImaginaria() - b.getParteImaginaria();
    }
    public void producto(Complejo1 a, Complejo1 b){
        double parteReal = ((a.getParteReal()*b.getParteReal())-(a.getParteImaginaria()*b.getParteImaginaria()));
		double parteImaginaria = ((a.getParteReal()*b.getParteImaginaria())+(a.getParteImaginaria()*b.getParteReal()));

			this.parteReal = parteReal;
			this.parteImaginaria = parteImaginaria;
    }
    public void cociente(Complejo1 a, Complejo1 b){
        
        double parteReal = (((b.getParteReal()*b.getParteReal())+(a.getParteImaginaria()*b.getParteImaginaria()))
        /((Math.pow(b.getParteReal(), 2)+(Math.pow(b.getParteImaginaria(),2)))));

        double parteImaginaria = (((a.getParteImaginaria() * b.getParteReal())-(a.getParteReal() *  b.getParteImaginaria()))
        /((Math.pow(b.getParteReal(), 2)+(Math.pow(b.getParteImaginaria(),2)))));
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        
    }
    public String toString(){
        return "("+ parteReal + "," +parteImaginaria +")";
    }
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        Complejo1 cm = new Complejo1();
		int real1,real2,img1,img2;
		//Ingreso de la primer nuemro complejo
		System.out.println("Ingrese el primer numero complejo");
		System.out.println("Ingrese la parte real: ");
		real1 = entrada.nextInt();
		System.out.print("Ingrse la parte imaginaria :");
		img1 =entrada.nextInt();

        //Ingreso de el segundo numero complejo
		System.out.println("Ingrese el segundo numero complejo");
		System.out.println("Ingrese la parte real: ");
		real2 = entrada.nextInt();
		System.out.println("Ingrese la parte imaginaria : ");
		img2 = entrada.nextInt();

		Complejo1 n1 = new Complejo1(real1,img1);
		Complejo1 n2 = new Complejo1(real2,img2);

		System.out.print("Operación de SUMA de los números complejos: "+ n1 + " + "+n2 +" = ");
		cm.suma(n1, n2);
		System.out.println(cm.toString());

		System.out.print("Operación de RESTA de los números complejos: "+ n1 + " - "+ n2 + " = ");
		cm.resta(n1, n2);
        //cm.toString()
		System.out.println(cm.toString());
        System.out.println(((Object)cm).getClass().getSimpleName());

		System.out.println("Operación de PRODUCTO de los números complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) " + "* ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		cm.producto(n1, n2);
		System.out.println(cm.toString());

		System.out.println("Operación de COCIENTE de los números complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) " + "/ ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		cm.cociente(n1, n2);
		System.out.println(cm.toString());

    }
    
}
