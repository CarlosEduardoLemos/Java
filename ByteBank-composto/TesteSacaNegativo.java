public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));
        System.out.println(conta.pegaSaldo());

        // Proibido:
        // conta.saldo = conta.saldo - 101;
        // System.out.println(conta.saldo );
    }
}
