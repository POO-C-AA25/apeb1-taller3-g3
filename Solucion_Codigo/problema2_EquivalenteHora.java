public class problema2_EquivalenteHora {
    public double hora;
    public double min;
    public double sec;
    public double dia;

    // Atributos
    public problema2_EquivalenteHora(){}
    
    public problema2_EquivalenteHora(double horas) {
        this.hora = horas;
        this.min = horaMin();
        this.sec = horaSec();
        this.dia = horaDia();
    }

    // Métodos
    public double horaMin() {
        return hora * 60;
    }

    public double horaSec() {
        return hora * 3600;
    }

    public double horaDia() {
        return hora / 24;
    }

    public String toString() {
        return "Equivalente de " + hora + " horas:\n" +
               "- Minutos: " + min + "\n" +
               "- Segundos: " + sec + "\n" +
               "- Días: " + dia;
    }
}