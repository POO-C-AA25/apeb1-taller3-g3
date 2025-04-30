public class problema6_Profesor {
    public String nombre;
    public String apellido;
    public String cedula;
    public double sueldoBasico;
    public double sueldoTotal;

    public problema6_Profesor(String nombre, String apellido, String cedula, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
               "\nCédula: " + cedula +
               "\nSueldo Básico: $" + sueldoBasico +
               "\nSueldo Total:  $" + sueldoTotal;
    }
}