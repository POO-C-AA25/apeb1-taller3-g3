public class problema5_Estudiante {
    public String nombre;
    public double cal1;
    public double cal2;
    public double cal3;
    public double promedio;
    public String estado;

    public problema5_Estudiante(String nombre, double cal1, double cal2, double cal3) {
        this.nombre = nombre;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        calcularPromedio();
        determinarEstado();
    }

    public void calcularPromedio() {
        promedio = (cal1 + cal2 + cal3) / 3;
    }

    public void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    public String toString() {
        return "Nombre: " + nombre +
               "\nCalificación 1: " + cal1 +
               "\nCalificación 2: " + cal2 +
               "\nCalificación 3: " + cal3 +
               "\nPromedio: " + promedio +
               "\nEstado: " + estado;
    }
}