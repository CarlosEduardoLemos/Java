public class TesteCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 16;
        int quantidadePessoa = 1;
        // boolean acompanhado = true;

        if (idade >= 18 && quantidadePessoa >= 2) { // Operadores: || &&
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
