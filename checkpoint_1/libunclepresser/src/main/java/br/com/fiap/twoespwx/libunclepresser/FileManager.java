package br.com.fiap.twoespwx.libunclepresser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileManager {

    public String readFile(String filePath) throws IOException {
        // Leitura do arquivo de entrada do resources
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);
        if (inputStream == null) {
            throw new IOException("Arquivo não encontrado: " + filePath);
        }
        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }

    public void writeFile(String filePath, String content) throws IOException {
        // Escrita fora do resources
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
