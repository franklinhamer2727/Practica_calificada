import java.util.Scanner;

public class App {

    private double Realx;
    private double Realy;

    public App() {
        this.Realx = 0;
        this.Realy = 0;
    }

    public App(double Realx, double Realy) {
        this.Realx = Realx;
        this.Realy = Realy;

    }

    public double getRealx() {
        return Realx;
    }

    public double getRealy() {
        return Realy;
    }

    public double distancia(App cordenada1, App codernada2) {

        return Math.sqrt(Math.pow((cordenada1.Realx - codernada2.Realx), 2)
                + Math.pow((codernada2.Realy - cordenada1.Realy), 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App cord = new App();
        int x1;
        int x2;
        int y1;
        int y2;

        // Solicitud de datos al usuario
        System.out.println("Este programa calcula la distancia entre dos puntos dados.");
        System.out.print("Introduce el valor X del primer punto: ");
        x1 = scanner.nextInt();
        System.out.print("Introduce el valor Y del primer punto: ");
        y1 = scanner.nextInt();
        System.out.print("Introduce el valor X del segundo punto: ");
        x2 = scanner.nextInt();
        System.out.print("Introduce el valor Y del segundo punto: ");
        y2 = scanner.nextInt();
        // Creamos el par de cordenadas y pasamos los valores correspondientes
        App par1 = new App(x1, y1);
        App par2 = new App(x2, y2);

        // Mostramos los resultados de la cadena
        System.out.println(cord.distancia(par1, par2));

    }
}