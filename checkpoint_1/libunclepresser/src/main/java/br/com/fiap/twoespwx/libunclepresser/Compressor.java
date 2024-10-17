package br.com.fiap.twoespwx.libunclepresser;

import java.util.HashMap;
import java.util.Map;

public class Compressor {

    // Método para comprimir com RLE
    public String compress(String sequence) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(sequence.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(sequence.charAt(sequence.length() - 1)).append(count);

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
