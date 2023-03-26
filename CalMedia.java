import java.util.Scanner;

public class CalMedia {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite sua nota G1: ");
        double notaG1 = lerTeclado.nextDouble();
        System.out.println("Digite a nota G2: ");
        double notaG2 = lerTeclado.nextDouble();
        double media = (notaG1 + notaG2) / 2;

        lerTeclado.close();

        if (media >= 7)
            System.out.println("Parabéns, você foi aprovado");
        else if (media >= 3 && media < 7)
            System.out.println("Você deve realizar o exame final");
        else
            System.out.println("Infelizmente você foi reprovado");

    }
}