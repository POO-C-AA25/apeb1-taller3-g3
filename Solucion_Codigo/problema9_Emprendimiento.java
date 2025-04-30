public class problema9_Emprendimiento {
    private String nombreComercial;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private int fechaInicio;
    private double capitalInicial;
    private String tipoNegocio; 

    public problema9_Emprendimiento() {}

    public problema9_Emprendimiento(String nombreComercial, String ruc, String sectorEconomico, String propietario, String ubicacion, int fechaInicio, double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
        this.capitalInicial = capitalInicial;
        this.tipoNegocio = determinarTipoNegocio(); 
    }

    // Métodos set
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
        this.tipoNegocio = determinarTipoNegocio(); // Recalcular tipo de negocio si cambia el capital
    }

    // Métodos get
    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public int calcularAntiguedad() {
        int anioActual = 2025;
        return anioActual - fechaInicio;
    }

    public String determinarTipoNegocio() {
        if (capitalInicial <= 20000) {
            return "Micro negocio";
        } else if (capitalInicial <= 100000) {
            return "Pequeño negocio";
        } else {
            return "Mediano negocio";
        }
    }

    public String toString() {
        return "Emprendimiento{" +
                "Nombre Comercial='" + nombreComercial + '\'' +
                ", RUC='" + ruc + '\'' +
                ", Sector Económico='" + sectorEconomico + '\'' +
                ", Propietario='" + propietario + '\'' +
                ", Ubicación='" + ubicacion + '\'' +
                ", Fecha de Inicio=" + fechaInicio +
                ", Capital Inicial=" + capitalInicial +
                ", Antigüedad=" + calcularAntiguedad() + " años" +
                ", Tipo de Negocio='" + tipoNegocio + '\'' +
                '}';
    }
}