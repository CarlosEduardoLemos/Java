import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliaçao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para p filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliaçao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliação " + mediaAvaliaçao/totalDeNotas);
    }
}
