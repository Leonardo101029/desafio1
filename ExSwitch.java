import java.util.Random;

public class ExSwitch {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroG = gerador.nextInt(10);
        switch (numeroG) {
            case 0:
                System.out.println("O número gerado é 0");
                break;
            case 1:
                System.out.println("O número gerado é 1");
                break;
            case 2:
                System.out.println("O número gerado é 2");
            default:
                System.out.println("O número gerado é maior que 3");
                break;
        }
    }
}
