# Intervalos_TDD
Avaliação da disciplina de Testes de Softwares.
Problema do Intervalo seguindo a orientação de programação TDD.

# Plano de Testes
Caso de uso: quebraIntervalo

## Classes de Equivalência
| Entradas          | Condições        | Classes Válidas        | Classes Inválidas       |
| ----------------- | ---------------- | ---------------------- | ----------------------- |
| lista : List<int> | lista não vazia  | (1) lista.size > 0     | (3) lista.size <= 0     |
|                   | lista ordenada   | (2) lista = lista.sort | (4) lista != lista.sort |

## Casos de Testes
| N  | Classes  | lista                                                         | Saída Esperada                           |
|--- | -------- | ------------------------------------------------------------- | ---------------------------------------- |
| 1  | 1 e 2    | [100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150 ] | "[100-105], [110-111], [113-115], [150]" |
| 2  | 3        | []                                                            | "Lista vazia"                            |
| 3  | 4        | [91, 90]                                                      | "Lista desordenada"                      |
