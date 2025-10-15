package java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class JavaNio {
    public static void main(String[] args) {
        try {
            //Encontrando o arquivo
            String homeDir = System.getProperty("user.home");
            Path path = Paths.get(homeDir, "Downloads", "arquivo.txt");

            //Escrevendo no arquivo
            List<String> nomes = Files.readAllLines(path);
            nomes.add("Joaao");
            nomes.add("Marcela");

            StringBuilder cont = new StringBuilder();
            nomes.forEach(n -> cont.append(n).append("\n"));
            Files.write(path, cont.toString().getBytes(StandardCharsets.UTF_8));


            //Lendo um arquivo
            byte[] bytesArquivo = Files.readAllBytes(path);
            String conteudo = new String(bytesArquivo);
            System.out.println(conteudo);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
