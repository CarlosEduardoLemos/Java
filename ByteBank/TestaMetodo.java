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

        Conta contaDaVitoria = new Conta();
        contaDaVitoria.deposita(1000);

        if(contaDaVitoria.transfere(300, contaDoCarlos)){
            System.out.println("Transferência com sucesso");
        }else{
            System.out.println("Faltou dinheiro");
        }

        System.out.println(contaDaVitoria.saldo);
        System.out.println(contaDoCarlos.saldo);
    }
}
