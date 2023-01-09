public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos Eduardo");

        conta.setTitular(carlos);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
    }
}
