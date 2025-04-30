public class problema10_Ejecutor {

    public static void main(String[] args) {
        
        problema10_CandidatoPresidencial candidato1 = new problema10_CandidatoPresidencial("Juan Pérez", "Partido A");
        System.out.println(candidato1);
        System.out.println("Cumple con la edad mínima: " + candidato1.validarEdadMinima());
    }
}