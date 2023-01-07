package ByteBank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoCarlos = new Conta();
        contaDoCarlos.saldo =100;
        contaDoCarlos.deposita(50);
        System.out.println(contaDoCarlos.saldo);

        boolean conseguiuRetirar = contaDoCarlos.saca(20);
        System.out.println(contaDoCarlos.saldo);
        System.out.println(conseguiuRetirar);
    }
}
