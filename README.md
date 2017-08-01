# Intervalos_TDD
Avaliação da disciplina de Testes de Softwares.  
Problema do Intervalo seguindo a orientação de programação TDD.

**Alunas**
* Ana Gonçalo
* Anne Gonçalo

# Plano de Testes
Caso de uso: quebraIntervalo

## Classes de Equivalência
| Entradas          | Condições                                     | Classes Válidas        | Classes Inválidas       |
| ----------------- | --------------------------------------------- | ---------------------- | ----------------------- |
| lista : List<int> | lista não vazia                               | (1) lista.size > 0     | (5) lista.size <= 0     |
|                   | lista ordenada                                | (2) lista = lista.sort | (6) lista != lista.sort |
| | cada item da lista pertece a um dos subgrupos                   | (3) lista[i] >= subgrupo[0] E lista[i] <= subgrupo[1] | (7) lista[i] < subgrupo[0] OU lista[i] > subgrupo[1] |
| | numero de subgrupos igual ao numero de iterrupções da sequencia | (4) subgrupos.size = lista.interrupções               | (8) subgrupos.size != lista.interrupções             |
  
## Casos de Testes
| N  | Classes     | lista                                                         | Saída Esperada                           |
|--- | ----------- | ------------------------------------------------------------- | ---------------------------------------- |
| 1  | 1, 2, 3 e 4 | [100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150 ] | "[100-105], [110-111], [113-115], [150]" |
| 2  | 5           | []                                                            | "Lista vazia"                            |
| 3  | 6           | [91, 90]                                                      | "Lista desordenada"                      |
| 4  | 7           | [100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150]  | "[100-150]"                              |
| 5  | 8           | [100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150]  | "[100-105], [110-111], [113-115], [150]" |
