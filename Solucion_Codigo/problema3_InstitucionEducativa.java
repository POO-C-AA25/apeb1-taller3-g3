public class problema3_InstitucionEducativa {
    public String nombre;
    public String tipoIns;
    public int numAl;
    public int numDoc;
    public int numSedes;
    public double gastoPPE;
    public double presupuesto;

    public problema3_InstitucionEducativa() {
    }

    public problema3_InstitucionEducativa(String nombre, String tipoIns, 
            int numAl,int numDoc, int numSedes, double gastoPPE) {
        this.nombre = nombre;
        this.tipoIns = tipoIns;
        this.numAl = numAl;
        this.numDoc = numDoc;
        this.numSedes = numSedes;
        this.gastoPPE = gastoPPE;
        calcularPresupuesto();
    }

    public void calcularPresupuesto() {
        presupuesto = numAl * gastoPPE;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoIns() {
        return tipoIns;
    }

    public int getNumAl() {
        return numAl;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public int getNumSedes() {
        return numSedes;
    }

    public double getGastoPPE() {
        return gastoPPE;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoIns(String tipoIns) {
        this.tipoIns = tipoIns;
    }

    public void setNumAl(int numAl) {
        this.numAl = numAl;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public void setGastoPPE(double gastoPPE) {
        this.gastoPPE = gastoPPE;
    }

    public String toString() {
        return "Institución: " + nombre +
               "\nTipo: " + tipoIns +
               "\nAlumnos: " + numAl +
               "\nDocentes: " + numDoc +
               "\nSedes: " + numSedes +
               "\nGasto PPE: $" + gastoPPE +
               "\nPresupuesto: $" + presupuesto;
    }
}