import java.util.Scanner;

public class problema3_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la institucion: ");
        String nombre = sc.nextLine();

        System.out.print("Tipo de institucion: ");
        String tipo = sc.nextLine();

        System.out.print("Numero de alumnos: ");
        int numAl = sc.nextInt();

        System.out.print("Numero de docentes: ");
        int numDoc = sc.nextInt();

        System.out.print("Numero de sedes: ");
        int numSedes = sc.nextInt();

        System.out.print("Gasto proyectado por estudiante: ");
        double gastoPPE = sc.nextDouble();

        problema3_InstitucionEducativa institucionX = new problema3_InstitucionEducativa
        (nombre, tipo, numAl, numDoc, numSedes, gastoPPE);

        System.out.println("\n--- Datos de la Institución ---");
        System.out.println(institucionX.toString());
    }
}