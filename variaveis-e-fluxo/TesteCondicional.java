public class TesteCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 20;
        int quantidadePessoa = 3;
        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoa >= 2) {
                System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado");
            }
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
