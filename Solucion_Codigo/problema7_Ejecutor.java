import java.util.Scanner;

public class problema7_Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cédula del dueño: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el año de fabricación: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el valor del vehículo: ");
        double valor = scanner.nextDouble();

        problema7_Automotor automotorX = new problema7_Automotor(cedula, marca, anio, valor);

        System.out.println(automotorX);
    }
}