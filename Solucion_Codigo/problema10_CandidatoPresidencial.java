public class problema10_CandidatoPresidencial {

    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numeroPropuestasClave;

    public problema10_CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.edad = 0;
        this.planGobierno = ""; 
        this.numeroPropuestasClave = 0; 
    }

    public problema10_CandidatoPresidencial(String nombre, int edad, String partidoPolitico, String planGobierno, int numeroPropuestasClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numeroPropuestasClave = numeroPropuestasClave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public void setNumeroPropuestasClave(int numeroPropuestasClave) {
        this.numeroPropuestasClave = numeroPropuestasClave;
    }

    public int getNumeroPropuestasClave() {
        return numeroPropuestasClave;
    }

    public boolean validarEdadMinima() {
        return edad >= 35; 
    }

    public String toString() {
        return "CandidatoPresidencial{" + "nombre=" + nombre + ", edad=" + edad + ", partidoPolitico=" + partidoPolitico + ", planGobierno=" + planGobierno + ", numeroPropuestasClave=" + numeroPropuestasClave + '}';
    }
}