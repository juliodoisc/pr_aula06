import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("======================\nMENU\n======================\n1-Criar\n2-Ler\n" +
                "3-Copiar arquivo\n======================\nOpcao: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                Create.main(args);
                break;
            case 2:
                Reader.main(args);
                break;
            case 3:
                Copy.main(args);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
