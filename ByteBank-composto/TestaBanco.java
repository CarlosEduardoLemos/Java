public class TestaBanco {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        carlos.nome = "Carlos Eduardo";
        carlos.cpf = "222.222.222-22";
        carlos.profissao = "programador";

        Conta contaDoCarlos = new Conta();
        contaDoCarlos.deposita(100);

        // associa o cliente carlos a conta contaDoCarlos
        contaDoCarlos.titular = carlos;
        System.out.println(contaDoCarlos.titular.nome);
        System.out.println(contaDoCarlos.titular);
        System.out.println(carlos);
    }
}