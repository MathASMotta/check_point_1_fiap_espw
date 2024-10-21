package br.com.fiap.twoespwx.libunclepresser;

import java.util.HashMap;
import java.util.Map;

public class Compressor {

    // Método para comprimir com RLE
    public String compress(String input) {
        StringBuilder compressed = new StringBuilder();
        String[] lines = input.split("\n");
    
        for (String line : lines) {
            if (line.isEmpty()) {
                compressed.append("\n"); // Preserva as linhas em branco.
                continue;
            }
    
            int length = line.length();
            int i = 0;
    
            while (i < length) {
                int maxPatternLength = 1;
                int maxCount = 1;
                String bestPattern = line.substring(i, i + 1);
    
                // Tenta encontrar o maior padrão repetido a partir da posição atual
                for (int patternLength = 1; patternLength <= (length - i) / 2; patternLength++) {
                    String pattern = line.substring(i, i + patternLength);
                    int count = 1;
                    int j = i + patternLength;
    
                    // Conta quantas vezes o padrão se repete consecutivamente
                    while (j + patternLength <= length && line.substring(j, j + patternLength).equals(pattern)) {
                        count++;
                        j += patternLength;
                    }
    
                    // Atualiza o melhor padrão se encontrar um com maior número de repetições
                    if (count > maxCount) {
                        maxPatternLength = patternLength;
                        maxCount = count;
                        bestPattern = pattern;
                    }
                }
    
                // Adiciona o melhor padrão encontrado e sua contagem, se maior que 1
                if (maxCount > 1) {
                    compressed.append(bestPattern).append(maxCount);
                } else {
                    compressed.append(bestPattern);
                }
    
                // Avança o índice para além do padrão processado
                i += maxPatternLength * maxCount;
            }
    
            compressed.append("\n"); // Adiciona uma quebra de linha ao final da linha comprimida.
        }
    
        // Remove a última quebra de linha, se presente, para evitar uma linha em branco adicional.
        if (compressed.length() > 0 && compressed.charAt(compressed.length() - 1) == '\n') {
            compressed.deleteCharAt(compressed.length() - 1);
        }
    
        return compressed.toString();
    }

    // Método para calcular frequências, filtrando caracteres indesejados
    public Map<Character, Integer> calculateFrequencies(String sequence) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char c : sequence.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'T' || c == 'G') {  // Filtra apenas A, C, T, G
                frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
            }
        }
        return frequencies;
    }

    // Método para calcular taxa de compressão
    public double calculateCompressionRate(int originalSize, int compressedSize) {
        return ((double) compressedSize / originalSize) * 100;
    }
}
