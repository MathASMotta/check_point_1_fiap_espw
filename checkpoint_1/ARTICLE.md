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
## Seção 5 - Resultados
## Seção 6 - Conclusões
## Seção 7 - Referências
