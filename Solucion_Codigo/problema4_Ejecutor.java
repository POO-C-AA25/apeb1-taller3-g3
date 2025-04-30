import java.util.Scanner;

public class problema4_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sistema operativo: ");
        String os = sc.nextLine();

        System.out.print("Tamaño de pantalla (pulgadas): ");
        double tamPantalla = sc.nextDouble();

        System.out.print("Costo inicial: ");
        double costoIni = sc.nextDouble();

        System.out.print("Dirección MAC: ");
        String mac = sc.nextLine();

        System.out.print("IMEI: ");
        String imei = sc.nextLine();

        problema4_EquipoCelular celularX = new problema4_EquipoCelular(os, tamPantalla, costoIni, mac, imei);

        System.out.println("\n--- Datos del Equipo Celular ---");
        System.out.println(celularX.toString());
    }
}