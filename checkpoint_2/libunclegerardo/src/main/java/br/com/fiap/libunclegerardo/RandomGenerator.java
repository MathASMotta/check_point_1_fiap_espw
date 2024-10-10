package br.com.fiap.libunclegerardo;

import java.util.Random;

public class RandomGenerator implements NucleotideoRandomGenerator {
    private static final char[] NUCLEOTIDEOS = {'A', 'C', 'T', 'G'};
    private Random random = new Random();

    @Override
    public String generate(int sequenceSize) {
        StringBuilder sequence = new StringBuilder(sequenceSize);
        for (int i = 0; i < sequenceSize; i++) {
            sequence.append(NUCLEOTIDEOS[random.nextInt(NUCLEOTIDEOS.length)]);
        }
        return sequence.toString();
    }

}
