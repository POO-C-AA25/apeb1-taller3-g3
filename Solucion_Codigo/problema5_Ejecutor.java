import java.util.Random;

public class problema5_Ejecutor {
    public static void main(String[] args) {
        Random random = new Random();

        String[] nombres = {"Ana", "Luis", "Carlos", "María", "Sofía", "Jorge"};
        String nombre = nombres[random.nextInt(nombres.length)];

        double cal1 = 4 + Math.random() * 6; // entre 4 y 10
        double cal2 = 4 + Math.random() * 6;
        double cal3 = 4 + Math.random() * 6;

        problema5_Estudiante estudianteX = new problema5_Estudiante(nombre, cal1, cal2, cal3);

        System.out.println("--- Información del Estudiante ---");
        System.out.println(estudianteX.toString());
    }
}