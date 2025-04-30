public class problema8_Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public problema8_Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        this.comisionBanco = calcularComisionBanco();
    }

    private double calcularComisionBanco() {
        return valorCheque * 0.003 / 100;
    }

    public String toString() {
        return "Cheque{" +
               "nombreCliente='" + nombreCliente + '\'' +
               ", nombreBanco='" + nombreBanco + '\'' +
               ", valorCheque=" + valorCheque +
               ", comisionBanco=" + comisionBanco +
               '}';
    }
}