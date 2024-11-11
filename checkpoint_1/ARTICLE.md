# Título

## Seção 1 - Introdução

Este projeto desenvolve uma aplicação Java para compactar sequências de nucleotídeos utilizando o algoritmo Run-Length Encoding (RLE). A aplicação é capaz de ler arquivos de até 1024KB e transformá-los em uma versão comprimida, com o objetivo de otimizar o armazenamento e fornecer estatísticas detalhadas sobre o processo de compressão, como frequências de caracteres e a taxa de compressão.

## Seção 2 - Fundamentos

Neste projeto seguimos com a programação orientada a objetos (POO) em Java para otimizar o processo de compressão de arquivos, além do uso de hierarquia de classes para garantir uma estrutura organizada a lógica de leitura de arquivos, processamento da sequência de nucleotídeos e geração do arquivo comprimido. 

Ao executarmos o processo de compressão, contamos com polimorfismo a fim de garantir que o método responsável pela compressão trate diferentes formatos de entrada de forma uniforme, assegurando que o comportamento se mantenha consistente, independentemente do tamanho do arquivom, se tornando um tratamento modular e escalável.

## Seção 3 - Metodologia

O programa inicia recebendo dois argumentos através da linha de comando: o caminho do arquivo de entrada e o caminho do arquivo de saída. O arquivo de entrada possui uma sequência de nucleotídeos que pode ter até 1MB e é considerada uma única sequência de caracteres, ignorando quebras de linha.

O algoritmo RLE é empregado para diminuir o tamanho da sequência, contando os caracteres que se repetem de forma consecutiva. Por exemplo, ao processar uma sequência como "AAAACCCTTG", o algoritmo gera a saída compactada "A4C3T2G1". Essa compressão é realizada de maneira eficiente, percorrendo os caracteres e acumulando contagens enquanto os blocos repetidos são identificados. O resultado comprimido é então salvo no arquivo de saída.

Após a compressão, o programa apresenta uma interface textual detalhada, contendo o nome e o tamanho do arquivo de entrada, o total de caracteres processados, as frequências dos nucleotídeos e a taxa de compressão obtida, calculada a partir da diferença de tamanho entre os arquivos de entrada e saída. Ao final, o arquivo comprimido é salvo no caminho indicado pelo usuário, e os resultados são exibidos em um formato de fácil leitura no terminal. 

## Seção 4 - Experimentos

Para validar a eficácia do algoritmo de compressão implementado, realizamos uma série de experimentos usando arquivos com diferentes tamanhos e composições de sequências de nucleotídeos. Cada arquivo foi processado pela aplicação, e as informações de saída, incluindo a taxa de compressão e o tempo de execução, foram registradas.

As sequências contidas no arquivo de entrada (exemplo em OUTPUT1.TXT) incluíam padrões repetitivos, como "ACTG4A24" e "AAAAAAAAAAAAAAAAAAAAAAAA", que representam as características típicas de dados biológicos, favorecendo a compressão. Este arquivo foi comprimido utilizando o algoritmo Run-Length Encoding (RLE) e gerou uma saída de tamanho reduzido, comparada ao arquivo de entrada, com significativa taxa de compressão para sequências com repetições extensas.

## Seção 5 - Resultados

Os resultados mostram que a aplicação Java conseguiu comprimir com eficiência as sequências de nucleotídeos repetitivos. A taxa de compressão variou conforme a quantidade de repetições na sequência, sendo mais alta para trechos com nucleotídeos repetidos por longas sequências. No caso do arquivo OUTPUT1.TXT, obtivemos uma compactação significativa, reduzindo o tamanho dos dados originais.

Para cada teste, a aplicação forneceu:

Nome do arquivo original: Identificação do arquivo utilizado.
Tamanho do arquivo de entrada e saída: Em bytes, para cálculo da taxa de compressão.
Total de caracteres processados: Indicando a extensão da sequência.
Frequências dos nucleotídeos: A frequência de ocorrência de cada caractere (A, C, T, G), que auxilia na análise do padrão de compressão.
Taxa de compressão: Calculada como a razão entre os tamanhos dos arquivos antes e após a compressão, evidenciando a eficiência do RLE para os dados testados.
Os testes indicaram uma compressão mais eficiente para sequências longas de nucleotídeos repetidos.

## Seção 6 - Conclusões

A aplicação demonstrou-se eficiente ao utilizar o algoritmo RLE para compressão de sequências de nucleotídeos, especialmente em dados com padrões repetitivos. O uso de princípios de programação orientada a objetos facilitou a estruturação e a modularidade do código, permitindo um desenvolvimento escalável e de fácil manutenção.

O sistema desenvolvido oferece uma interface intuitiva, exibindo estatísticas importantes para o usuário. Embora o algoritmo RLE não seja o mais eficaz para todos os tipos de dados, mostrou-se bastante adequado para a compressão de sequências biológicas específicas, oferecendo uma solução prática e eficiente para a otimização de armazenamento desses dados.

## Seção 7 - Referências

https://stackoverflow.com/questions/11442162/java-run-length-encoding
https://www.youtube.com/watch?v=7a4r3tIVtCE
https://medium.com/@ishifoev/run-length-encoding-rle-algorithm-step-by-step-guide-b0b89f3a4a9f
