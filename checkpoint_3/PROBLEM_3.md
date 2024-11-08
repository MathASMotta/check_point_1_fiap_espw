# Checkpoint 3

- Problema: API para cálculo de similaridade gênica
- Grupo: 2 a 4 pessoas
- Data de publicação: 15/10/2024
- Data limite de entrega: 11/11/2024
- Email de contato: proffellipe.souto@fiap.com.br

Com o fim da Sprint 1 nosso chefe nos convocou para uma nova reunião. Nessa reunião foi apresentado um novo produto de software solicitado pelos stakeholdes, uma API que avalia as similaridade e distâncias entre dois seres vivos, através de suas cadeias de nucleotídeos.

Para versão preliminar desse projeto consideraremos apenas 1 endpoint, que será descrito a seguir: 

```
PROTOCOLO: HTTP
PATH: /v1/alignment/distance
MÉTODO: POST
INPUT TYPE: JSON
OUTPUT TYPE: JSON

INPUT SCHEMA:
{
    "tracing_uuid": "8fbf1e92-032c-4172-93ce-a5e56a708dd7",
    "format": "plain_text",
    "method": "DEFAULT",
    sequences: [
        {
            "sequence_uuid": "5edd3a6b-7a50-4fe1-9abd-7766bdc5779f",
            "sequence": "ACTGACTGACTG"
        },
        {
            "sequence_uuid": "d60e0c41-0926-481d-a468-f68bc224ecde",
            "sequence": "ACTGACTGACTT"
        },
    ]
}

OUTPUT SCHEMA:
{
    "tracing_id": "8fbf1e92-032c-4172-93ce-a5e56a708dd7",
    "alignment_uuid: "f5f8718b-6add-4e73-b8d0-79f0d5aab70a",
    "method": {
        "name": "HAMMING_DISTANCE",
        "about: "The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ. It is commonly used in error detection, bioinformatics, cryptography, and machine learning to assess similarity or detect changes. For example, the Hamming Distance between "ACGT" and "ACGG" is 1, as only the last character differs.",
        "refences" : [
            "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
            "https://en.wikipedia.org/wiki/Hamming_distance"
        ]
    },
    result: [
        {
            "distance_score": 1.00,
            "similarity_score": 0.9375,
            "observations" : [],
            "length": 16,
            "format": "plain_text",
            "processing_time": "0.005s"
            "created_at": "2024-10-15T19:30:59.823381 (GMT-03:00)"
            "status": "PROCESSED"
        }
    ]
    "status": "PROCESSED"
    "created_at": "2024-10-15T19:20:00.823381 (GMT-03:00)"
    "updated_at": "2024-10-15T19:30:59.000000 (GMT-03:00)"
}
```

Esse trabalho será desenvolvido por mim em sala de aula e replicada por vocês. Cada pessoa deve tentar implementar sua própria versão e commitar em uma Branch separada do grupo. Todos devem discutir e chegar a um consenso sobre qual implementação será aceita, lidando com possíveis conflitos de design no código.

O principal ponto avaliado nesse trabalho será a colaboração que vocês tiveram no github.

# Atualizações

- 18/10: Transformei o checkpoint 2.2 em checkpoint 3