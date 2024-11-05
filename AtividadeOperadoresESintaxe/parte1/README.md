# POO - Atividade - Operadores E Sintaxe: Parte 1

# Respostas:

## 1. Sobre tipos primitivos na linguagem Java, responda o que se pede:
### a) O que são tipos primitivos?
É um tipo de dado básico e usual.

### b) Qual a diferença entre tipos primitivos e objetos?
Eles se diferem na forma como são armazenados e manipulados. Os tipos primitivos armazenam diretamente na variável, transformando o acesso mais rápido e eficiente. Já os objetos são instancias de classes e armazenados como referências que apontam para o local onde os dados estão na memoria, mas possuem um menor desempenho. 

### c) Pesquise e explique a diferença entre o tipo primitivo int e a classe Integer
`int` é um tipo primitivo, usado para representar números inteiros de forma direta e eficiente, ocupando menos memória.<br>
`Integer` é uma classe, que "embrulha" o valor do tipo int em um objeto. Isso permite que ele seja usado em contextos onde apenas objetos são aceitos, como em coleções. Também possui métodos úteis para manipular valores inteiros, como conversões e comparações.

### d) Porque os tipos primitivos são mantidos na linguagem Java, uma vez que existem objetos que podem realizar este papel?
Os tipos primitivos ainda existem em Java porque são mais simples e rápidos. Eles ocupam menos memória e são mais eficientes para operações básicas, como cálculos. Além disso, Java é uma linguagem antiga, e muitos programas foram criados usando esses tipos. Manter os primitivos garante compatibilidade com códigos antigos e ajuda a evitar o uso desnecessário de memória.

## 2. Sobre tipos de variáveis na linguagem Java, faça o que se pede:
### a) Quais os tipos de variáveis da linguagem Java?
byte, short, char, int, long, floar, double e boolean

### b) Quais as diferenças entre estes tipos?
- `byte` e `short`: guardam números inteiros pequenos. byte ocupa menos espaço e é mais econômico; short pode armazenar números um pouco maiores.
- `int`: usado para números inteiros em geral, é o tipo mais comum para valores numéricos inteiros.
- `long`: guarda números inteiros bem grandes, usado quando o valor pode ser muito alto.
- `float` e `double`: guardam números com casas decimais, sendo float de precisão simples e double de precisão maior (mais detalhado).
- `char`: guarda um único caractere, como uma letra ou símbolo.
- `boolean`: representa valores de verdadeiro ou falso, usado para condições.

### c) Crie um código-fonte simplificado demonstrando a diferença entre as variáveis de classe ede objeto (instância).
[Código implementado](https://github.com/deboradls/POO/tree/41a8ea989b748e7e195d6e83befecfc70207548b/AtividadeOperadoresESintaxe/parte1/Questao2-c)

## 3. Sobre constantes na linguagem Java, faça o que se pede:
### a) Qual palavra-chave é usada para definir uma constante na linguagem Java?
Final

### b) Explique por que as constantes normalmente possuem o modificador static.
As constantes usam `static` para serem acessadas diretamente pela classe, sem precisar criar objetos. Isso economiza memória, já que são armazenadas uma única vez, e facilita o uso, pois podem ser chamadas de forma direta e prática.