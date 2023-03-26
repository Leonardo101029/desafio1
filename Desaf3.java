import java.util.Scanner;

public class Desaf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Help Java ");
        System.out.println(".");
        System.out.println("1 - instrução IF Simples");
        System.out.println("2 - Instrução IF com blocos de comando");
        System.out.println("3 - Instrução IF aninhado");
        System.out.println("4 - Instrução SWITCH");
        System.out.println(".");
        System.out.println("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        System.out.print("\033[H\033[2J");

        scanner.close();

        switch (opcao) {

            case 1:
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("ESTRUTURA IF SIMPLES");
                System.out.println("if (condicao)  instrucao;");
                System.out.println("else  instrucao;");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                break;

            case 2:
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("ESTRUTURA IF BLOCO");
                System.out.println("if (condicao) {");
                System.out.println(" instrucao1;");
                System.out.println(" instrucao2;");
                System.out.println("} else {");
                System.out.println(" instrucao3;");
                System.out.println(" instrucao4;");
                System.out.println("}");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                break;

            case 3:
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("ESTRUTURA IF ANINHADO");
                System.out.println("if (condicao) {");
                System.out.println(" instrucao1;");
                System.out.println(" instrucao2;");
                System.out.println("} else if (condicao2) {");
                System.out.println(" instrucao4;");
                System.out.println(" instrucao5;");
                System.out.println("} else {");
                System.out.println(" instrucao5;");
                System.out.println("}");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                break;

            case 4:
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("SWITCH");
                System.out.println("switch (expressão) {");
                System.out.println(" case constante1:");
                System.out.println("  instrucao1;");
                System.out.println("  instrucao2;");
                System.out.println("  break;");
                System.out.println(" case constante2:");
                System.out.println("  instrucao3;");
                System.out.println("  instrucao4;");
                System.out.println("  break;");
                System.out.println(" default:");
                System.out.println("  instrucao5;");
                System.out.println("}");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                break;

            default:
                System.out.println("Opção Inválida!!");
                break;
        }
    }
}