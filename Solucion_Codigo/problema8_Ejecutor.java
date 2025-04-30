import java.util.Random;

public class problema8_Ejecutor {
    public static void main(String[] args) {
        String[] nombresClientes = {"Juan Pérez", "María López", "Carlos García", "Ana Martínez", "Luis Fernández"};
        String[] nombresBancos = {"Banco A", "Banco B", "Banco C", "Banco D", "Banco E"};
        Random random = new Random();

        String nombreCliente = nombresClientes[random.nextInt(nombresClientes.length)];
        String nombreBanco = nombresBancos[random.nextInt(nombresBancos.length)];
        double valorCheque = 1000 + (random.nextDouble() * 9000); // entre 1000 y 10000

        problema8_Cheque cheque = new problema8_Cheque(nombreCliente, nombreBanco, valorCheque);
        System.out.println(cheque);
    }
}