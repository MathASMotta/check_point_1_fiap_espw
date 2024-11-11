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

package br.com.fiap.libunclegerardo;

public class Main {
    public static void main(String[] args) {
        NucleotideoRandomGenerator generator = new RandomGenerator();

        System.out.println("Cadeia gerada: " + generator.generate(10));
        System.out.println("Cadeia gerada: " + generator.generate(4));
        System.out.println("Cadeia gerada: " + generator.generate(8));
    }
}
