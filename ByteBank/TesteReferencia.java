package ByteBank;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;
        System.out.println("Saldo da primeta: " + primeirConta.saldo);

        Conta segundaConta = primeirConta;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
        
        System.out.println(primeirConta.saldo);
    }
}
