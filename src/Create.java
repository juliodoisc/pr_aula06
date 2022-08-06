import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();
        System.out.printf("Informe o numero de linhas do arquivo:  ");
        int numeroLinhas = scanner.nextInt();

        FileWriter arq = null;
        try {
            arq = new FileWriter("out/archives/"+ nomeArquivo + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter gravarArq = new PrintWriter(arq);

        for (int i=1; i <= numeroLinhas; i++){
            gravarArq.printf("Linha " + i +"\n");
        }

        try {
            arq.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Arquivo criado com sucesso!");
    }

}
