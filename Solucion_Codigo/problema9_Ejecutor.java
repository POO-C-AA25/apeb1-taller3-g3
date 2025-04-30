import java.util.Scanner;

public class problema9_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problema9_Emprendimiento emp1 = new problema9_Emprendimiento();

        System.out.print("Ingrese el nombre comercial: ");
        emp1.setNombreComercial(sc.nextLine());
        
        System.out.print("Ingrese el RUC: ");
        emp1.setRuc(sc.nextLine());
        
        System.out.print("Ingrese el sector económico: ");
        emp1.setSectorEconomico(sc.nextLine());
        
        System.out.print("Ingrese el nombre del propietario: ");
        emp1.setPropietario(sc.nextLine());
        
        System.out.print("Ingrese la ubicación: ");
        emp1.setUbicacion(sc.nextLine());
        
        System.out.print("Ingrese la fecha de inicio (año): ");
        emp1.setFechaInicio(sc.nextInt());
        
        System.out.print("Ingrese el capital inicial: ");
        emp1.setCapitalInicial(sc.nextDouble());

        System.out.println(emp1);

        problema9_Emprendimiento emp2 = new problema9_Emprendimiento("Café Aroma", "1234567890001", "Alimentos", "María Pérez", "Quito - La Mariscal", 2020, 30000);
        System.out.println(emp2);
    }
}