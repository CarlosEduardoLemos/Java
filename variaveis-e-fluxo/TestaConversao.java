public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario; // Casting. É possível se atribuir o valor de um tipo de variável a outro tipo
                                   // de variável, porém para tal é necessário que esta operação seja apontada ao
                                   // compilador
        System.out.println(valor);

        // long numeroGrande = 321654987L;
        // short valorPequeno = 2131;
        // byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
