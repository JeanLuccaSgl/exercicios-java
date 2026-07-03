# Exercícios Java

Coleção de 20 exercícios introdutórios de programação em Java, organizados em duas listas com conceitos progressivos.

## Objetivo

Praticar fundamentos da linguagem Java: entrada/saída, condicionais, loops, switch, vetores, algoritmos clássicos e jogos simples.

## Funcionalidades

### Lista 01 — Conceitos básicos
1. Classificação de número (positivo/negativo/zero)
2. Soma de positivos até entrada negativa
3. Calculadora simples (+, -, *, /)
4. Contagem de pares e ímpares
5. Ano bissexto
6. Calculadora de IMC com classificação
7. Conversão de nota numérica para conceito (A–F)
8. Calculadora de área (triângulo, círculo, retângulo)
9. Pares e ímpares em intervalo
10. Maior entre 3 números

### Lista 02 — Conceitos intermediários
1. Classificador de idade (criança/adulto/idoso)
2. Autenticação por senha (3 tentativas)
3. Números primos em intervalo
4. Calculadora com menu interativo
5. Sequência de Fibonacci
6. Tabuada interativa
7. Jogo de adivinhação (maior/menor)
8. Jogo Pedra-Papel-Tesoura
9. Jogo Par ou Ímpar
10. Conversor de moedas (BRL → USD/EUR/GBP)

## Tecnologias

- Java (JDK 21)
- IntelliJ IDEA

## Arquitetura

Projeto IntelliJ com dois pacotes. Cada exercício é uma classe independente com método `main`.

```
exercicios-java/
├── src/
│   ├── listaExercicios01/
│   │   ├── Exercicio01.java  a  Exercicio10.java
│   └── listaExercicios02/
│       ├── Exercicio01.java  a  Exercicio10.java
├── .gitignore
└── README.md
```

## Execução

Abra o projeto no IntelliJ IDEA (JDK 21) e execute cada arquivo individualmente.

```bash
# Compilar e executar um exercício
javac src/listaExercicios01/Exercicio01.java -d out
java -cp out listaExercicios01.Exercicio01
```

## Conhecimentos demonstrados

- Sintaxe básica Java (variáveis, tipos, operadores)
- Estruturas condicionais (`if/else`, `switch`)
- Laços de repetição (`for`, `while`, `do-while`)
- Entrada de dados com `Scanner`
- Geração de números aleatórios com `Random`
- Algoritmos clássicos (Fibonacci, números primos)
- Desenvolvimento de jogos simples via console

## Melhorias futuras

- Adicionar exercícios com vetores e matrizes
- Incluir programação orientada a objetos
- Adicionar tratamento de exceções
- Implementar interface gráfica (Swing/JavaFX)
- Criar testes unitários com JUnit

## Licença

MIT
