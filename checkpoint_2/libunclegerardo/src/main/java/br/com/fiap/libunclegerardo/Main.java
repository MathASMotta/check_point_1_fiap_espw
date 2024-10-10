package br.com.fiap.libunclegerardo;

public class Main {
    public static void main(String[] args) {
        NucleotideoRandomGenerator generator = new RandomGenerator();

        System.out.println("Cadeia gerada: " + generator.generate(10));
        System.out.println("Cadeia gerada: " + generator.generate(4));
        System.out.println("Cadeia gerada: " + generator.generate(8));
    }
}
