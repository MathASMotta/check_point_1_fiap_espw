# Checkpoint 2

- Problema: Geração aleatória de cadeias de nucletídeos
- Grupo: 2 a 4 pessoas
- Data de publicação: 04/10/2024
- Data limite de entrega: 11/11/2024
- Email de contato: proffellipe.souto@fiap.com.br

Continuando nossa saga trabalhando com cadeias de nucleotídeos, agora precisamos de uma forma prática de gerar cadeias aleatórias de qualquer tamanho que quisermos.

Para fazermos isso, definiremos uma interface comum, que será a seguinte:

```java

public interface NucleotideoRandomGenerator {
    public String generate(int sequenceSize);
}
```

Você deverá criar um novo projeto Maven, conforme visto em aula, com o nome **libunclegerardo**. Nesse projeto crie a estrutura necessária para implementar a interface solicitada.

O método **generate** deverá receber um número inteiro positivo, que é o tamanho da sequência que devemos gerar. Como essa sequência será gerada ficará a cargo do grupo. Queremos exercitar a escrita de diferentes implementações dessa interface, assim estaremos explorando o verdadeiro poder do polimorfismo e contrato entre classes.

Alguns exemplos de geração de cadeias aleatórias:

```
entrada: 10
saída: AAAAAAAAAA

entrada: 10
saída: ACTGACTGACTG

entrada: 10
saída: TGCATGACTA

entrada: 4
saída: ACTG

entrada: 4
saída: GTCAACTG
```


## Execução do programa
A execução do nosso programa receberadois argumentos:

```bash
$ java -jar <path/to/jar/file> size:<numero-inteiro-maior-que-zero> output:<nome-do-arquivo-de-saida>.txt
```

O parâmetro `size:<numero-inteiro-maior-que-zero>` deverá ser uma entrada do seu programa e utilizada para definir o tamanho da sequência que será gerada.

O parâmetro `output:<nome-do-arquivo-de-saida>.txt` deverá ser outra entrada do seu programa e utilizada para definir o nome do arquivo de saída, com extensão **.txt**.


## Atualizações

- 18/10/2024: Mudamos o dia de entrega de 18/10/2024 para 11/11/2024
- 18/10/2024: O Checkpoint 2.1 virou o 2
- 18/10/2024: Adicionei a seção **Execução do programa**