public class problema7_Automotor {
    private String cedulaDueno;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public problema7_Automotor(String cedulaDueno, String marca, int anioFabricacion, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.valorMatricula = calcularValorMatricula();
    }

    private double calcularValorMatricula() {
        int antiguedad = 2023 - anioFabricacion;
        return (valorVehiculo * 0.002 / 100) * antiguedad;
    }

    public String toString() {
        return "Automotor{" +
               "cedulaDueno='" + cedulaDueno + '\'' +
               ", marca='" + marca + '\'' +
               ", anioFabricacion=" + anioFabricacion +
               ", valorVehiculo=" + valorVehiculo +
               ", valorMatricula=" + valorMatricula +
               '}';
    }
}