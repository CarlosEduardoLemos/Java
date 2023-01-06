public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 20;
        int quantidadePessoa = 3;

        // boolean acompanhado = quantidadePessoa >=2;
        boolean acompanhado;

        if (quantidadePessoa >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 && quantidadePessoa >= 2) { // Operadores: || &&
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }

    }
}
