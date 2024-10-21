/* 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Grupo: Milho
 * Autores: 
 *          Fabrício Saavedra   -   rm97631@fiap.com.br
            Guilherme Akio      -   rm98582@fiap.com.br
            Matheus Motta       -   rm550352@fiap.com.br
            Matheus Gusmão      -   rm550826@fiap.com.br
 */

package br.com.fiap.twoespwx.libunclepresser;

import java.io.IOException;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Compressor compressor = new Compressor();
        
        try {
            // Leitura do arquivo de entrada
            String input = fileManager.readFile("inputs/input1.txt");

            // Compressão
            String compressedData = compressor.compress(input);

            // Frequências dos caracteres válidos
            Map<Character, Integer> frequencies = compressor.calculateFrequencies(input);

            // Escrita do arquivo de saída
            fileManager.writeFile("checkpoint_1/libunclepresser/src/outputs/OUTPUT1.TXT", compressedData);

            // Estatísticas
            int originalSize = input.length();
            int compressedSize = compressedData.length();
            double compressionRate = 100 - compressor.calculateCompressionRate(originalSize, compressedSize);

            // Tamanho do arquivo de entrada e saída em KB (supondo 1 char = 1 byte)
            double inputFileSizeKB = originalSize / 1024.0;
            double outputFileSizeKB = compressedSize / 1024.0;

            // Saída formatada no terminal
            System.out.println(" -----------------------------------------------------------");
            System.out.println("|           LIB UNCLE PRESSER - GRUPO BATATA-DOCE           |");
            System.out.println("|-----------------------------------------------------------|");
            System.out.println("|                                                           |");
            System.out.println("| INPUT  FILENAME: INPUT1.TXT                               |");
            System.out.println("| OUTPUT FILENAME: OUTPUT1.TXT                              |");
            System.out.println("|                                                           |");
            System.out.println(" -----------------------------------------------------------");
            System.out.println("|                                                           |");
            System.out.printf("| INPUT FILE SIZE: %.2fKB                                   |\n", inputFileSizeKB);
            System.out.println("|                                                           |");
            System.out.printf("| TOTAL INPUT CHARACTERS: %,d                             |\n", originalSize);
            System.out.println("|                                                           |");
            System.out.println("| FREQUENCIES:                                              |");
            frequencies.forEach((character, count) -> {
                double percentage = (count / (double) originalSize) * 100;
                System.out.printf("| %c: %,d (%.2f%%)                                           |\n", character, count, percentage);
            });
            System.out.println("|                                                           |");
            System.out.println("| OPTIONS:                                                  |");
            System.out.println("|                                                           |");
            System.out.println("| ALGORITHM: Run-Length Encoding (RLE)                      |");
            System.out.println("| TEXT-CODIFICATION: UTF-8                                  |");
            System.out.printf("| COMPRESSION RATE: =~ %.2f%%                               |\n", compressionRate);
            System.out.println("|                                                           |");
            System.out.printf("| OUTPUT FILE SIZE: %.2f KB                                 |\n", outputFileSizeKB);
            System.out.println("|                                                           |");
            System.out.println(" -----------------------------------------------------------");
            System.out.println("|                                                           |");
            System.out.println("| SCORE: WELL-DONE                                          |");
            System.out.println("|                                                           |");
            System.out.println(" -----------------------------------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
