# POO - Atividade - Operadores E Sintaxe: Parte 2

# Respostas:

## 1. O que é o curto circuito em operadores lógicos? Explique.
<span style="color: red; font-weight: bold;">Resposta:</span>
O "curto-circuito" nos operadores lógicos acontece quando Java avalia apenas o necessário em uma expressão. Por exemplo, em uma expressão com && (E), se a primeira condição for false, ele nem olha a segunda, pois já sabe que o resultado será false. Da mesma forma, com || (OU), se a primeira condição for true, ele ignora a segunda. Isso economiza tempo e evita verificações desnecessárias.

## 2. Qual o impacto do uso dos operadores de incremento (++) e decremento (--) antes ou depois de uma variável? Explique. Exemplo: System.out.println(++a) ou System.out.println(a++).
<span style="color: red; font-weight: bold;">Resposta:</span>
O impacto dos operadores de incremento (++) e decremento (--) depende de onde eles estão colocados em relação à variável:
- `Pré-incremento (++a)`: Aumenta ou diminui o valor da variável antes de usá-lo. Por exemplo, System.out.println(++a); mostra o novo valor logo após a alteração.
- `Pós-incremento (a++)`: Usa o valor atual da variável primeiro e só depois faz a alteração. Por exemplo, System.out.println(a++); mostra o valor antigo antes de aumentar.

## 3. Usando o operador ternário, escreva um programa em Java que, dada uma variável x (com valor 80, por exemplo), temos y de acordo com a seguinte regra:
```
a. se x é par, y = x / 2
b. se x é impar, y = 3 * x + 1
c. imprime y
```
<span style="color: red; font-weight: bold;">Resposta:</span>
[Códigos implementado](https://github.com/deboradls/POO/tree/bd6044fe706dec04951df12fae278720ffcdfed2/AtividadeOperadoresESintaxe/parte2/Questao3)

## 4. “Uma String é imutável”. Explique o significado desta afirmação e as razões que levaram a este comportamento.
<span style="color: red; font-weight: bold;">Resposta:</span>
A afirmação "Uma String é imutável" significa que, uma vez criada, o conteúdo de uma String em Java não pode ser alterado. Se você tentar modificar uma String, na verdade, uma nova String é criada com o novo valor, enquanto a original permanece inalterada.
- Segurança: Strings frequentemente contêm informações sensíveis, como senhas. Torná-las imutáveis ajuda a evitar modificações acidentais e aumenta a segurança.
- Desempenho: A imutabilidade permite que o Java otimize o uso de Strings, especialmente em operações de comparação e armazenamento em cache. Isso pode melhorar a performance, pois o Java pode reutilizar referências a Strings sem se preocupar com mudanças.
- Concorrência: Em programas que usam múltiplas threads, a imutabilidade garante que uma String não será alterada por uma thread enquanto outra a está utilizando, evitando problemas de sincronização.