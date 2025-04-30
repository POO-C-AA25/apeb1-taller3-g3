public class problema4_EquipoCelular {
    //atributos
    public String os;
    public double tamPantalla;
    public double costoIni;
    public double iva = 0.15;
    public double ivaCosto;
    public double costoFinal;
    public String mac;
    public String imei;

    //Metodos
    public problema4_EquipoCelular(String os, double tamPantalla, double costoIni, String mac, String imei) {
        this.os = os;
        this.tamPantalla = tamPantalla;
        this.costoIni = costoIni;
        this.mac = mac;
        this.imei = imei;
        this.calcularCostoFinal();
    }

    public void calcularCostoFinal() {
        ivaCosto = iva * costoIni;
        costoFinal = costoIni + ivaCosto;
    }

    public String toString() {
        return "Sistema Operativo: " + os +
               "\nTamaño de Pantalla: " + tamPantalla + " pulgadas" +
               "\nCosto Inicial: $" + costoIni +
               "\nIVA : " + iva +
               "\nIVA en $: $" + ivaCosto +
               "\nCosto Final: $" + costoFinal +
               "\nDirección MAC: " + mac +
               "\nIMEI: " + imei;
    }
}