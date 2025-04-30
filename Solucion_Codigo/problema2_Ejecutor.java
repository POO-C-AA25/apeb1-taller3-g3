import java.util.Scanner;

public class problema2_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas: ");
        double h = sc.nextDouble();

        problema2_EquivalenteHora horaX = new problema2_EquivalenteHora(h);
        System.out.println(horaX.toString());
    }
}