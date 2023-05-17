public class Condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLançamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retô que vale a pena assistir!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals(tipoPlano)){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
