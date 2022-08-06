import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Informe o caminho do arquivo: ");
    String caminhoArquivo = scanner.nextLine();

        try{
        FileReader arquivo = new FileReader("out/archives/" + caminhoArquivo + ".txt");
        BufferedReader lerArquivo = new BufferedReader(arquivo);

        String linha = lerArquivo.readLine();
        System.out.printf("===========================\n");
        while (linha != null){
            System.out.printf(linha + "\n");
            linha = lerArquivo.readLine();
        }
        System.out.printf("===========================");

    } catch (
    IOException e){
        System.out.printf("\nErro ao ler o arquivo!");
    } finally {
        System.out.printf("\nArquivo lido com sucesso!");
    }
}
}
