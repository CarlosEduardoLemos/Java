public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaVitoria = new Conta();
        System.out.println(contaDaVitoria.pegaSaldo());
        contaDaVitoria.titular = new Cliente();
        System.out.println(contaDaVitoria.titular);
        contaDaVitoria.titular.nome = "Vitória";
        System.out.println(contaDaVitoria.titular.nome);
    }
}
