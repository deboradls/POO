# POO - Atividade - Atividade de Exceções: Parte 1

# Respostas:

## 1. O que é uma exceção? Explique.
As exceções ocorrem quando algo imprevisto acontece, elas podem ser provenientes de erros de lógica ou acesso a recursos que talvez não estejam disponiveis.

## 2. Explique detalhadamente a diferença entre as exceções verificadas e não verificadas.
**Exceções não verificadas:**
- Representam defeitos no programa.
- São subclasses de RunTimeException e são normalmente implementadas usando IllegalArgumentException, NullPointerException ou IllegallStateException.
- Um  método não é obrigado a estabelecer uma  política para as exceções não checadas lançadas por uma execução (e quase sempre nunca o fazem).

**Exceções verificadas:**
- Representam condições inválidas em áreas fora do controle imediato do programa: problema de entrada inválida do usuário, banco de daos, falha de rede, arquivos ausente.
- São subclasses de Exception.
- Um método é obrigado a estabelecer uma política para todas as exceções checadas lançadas por sua implementação ou passar a exceção checada mais acima na pilha, ou manipulá-la de alguma forma.

## 3. Qual a hierarquia de classes do mecanismo de tratamento de exceções da linguagem Java?
1°. classe Throwable <br>
2°. classes Error e Exception: filhas de Throwable <br>
3°. RunTimeException e outras exceções que são filhas de Exception. 

## 4. Explique conceitualmente as diretivas a seguir, bem como crie um código-fonte simplificado demonstrando o seu uso (pode ser um código-fonte único demonstrando todas as diretivas):
### a) try... catch
São usadas para lidar com exceções, que são eventos indesejados ou inesperados que podem ocorrer durante a execução de um programa, como erros ao acessar arquivos inexistentes, divisões por zero ou operações inválidas.

```
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso gera uma ArithmeticException.
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}

```

### b) Throws
É usada para declarar exceções que um método pode lançar durante sua execução. Isso significa que o método que utiliza throws está informando ao chamador que ele deve lidar com essas possíveis exceções, seja capturando-as (try...catch) ou propagando-as ainda mais.
```
import java.io.IOException;

public class MultiplasExcecoes {
    public static void main(String[] args) {
        try {
            realizarOperacao(0);
        } catch (ArithmeticException | IOException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void realizarOperacao(int divisor) throws ArithmeticException, IOException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        if (divisor < 0) {
            throw new IOException("Divisor negativo não é permitido.");
        }
        System.out.println("Operação bem-sucedida!");
    }
}

```

### c) Throw
É usada para lançar uma exceção explicitamente durante a execução de um programa. É o mecanismo que efetivamente cria uma instância de uma classe de exceção e "interrompe" o fluxo normal do programa para que essa exceção seja tratada.

```
public class ExemploThrow {
    public static void main(String[] args) {
        try {
            validarIdade(15); // Chamada do método
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade deve ser maior ou igual a 18 anos.");
        }
        System.out.println("Idade válida.");
    }
}

```

- **Exemplo combinado:**
```
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

public class BancoExemplo {
    public static void main(String[] args) {
        try {
            realizarSaque(1000, 1500); // Tentativa de sacar um valor maior que o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de argumento inválido: " + e.getMessage());
        }
    }

    // Método que verifica saldo e realiza saque
    public static void realizarSaque(double saldo, double valorSaque) throws SaldoInsuficienteException {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("O valor de saque deve ser maior que zero.");
        }
        if (valorSaque > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: " + saldo);
        }
        System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
    }
}

```

## 5. 
[Código implementado](https://github.com/deboradls/POO/blob/b71193226353ead4ab6dcb1ae362ddcede6ba85c/AtividadeExcecoes/parte1/excecoes1.java)