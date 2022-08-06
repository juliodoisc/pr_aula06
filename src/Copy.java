import java.io.*;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o nome do arquivo a ser copiado: ");
        String nomeArquivo = scanner.nextLine();

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("out/archives/" + nomeArquivo + ".txt");
            os = new FileOutputStream("out/archives/copy_of_" + nomeArquivo + ".txt");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            is.close();
            os.close();
            System.out.printf("\nArquivo copiado com sucesso!");
        }
    }
}