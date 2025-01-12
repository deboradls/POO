# POO - Atividade - Interfaces

# Respostas:
## 1. Quais as diferenças entre classes abstratas e interfaces? Explique.
Uma classe abstrata pode conter lógica (código), enquanto que uma interface somente especifica quais os métodos ou propriedades uma classe que implementa a interface deve definir. Entetanto, nenhuma das duas podem ser usadas para construir um objeto, para isso é necessário definir uma classe que derive da abstrata mas que não seja abstrata, ou que implemente a interface.

## 2. Interfaces podem ter métodos concretos? Explique.
Não, pois uma interface contém apenas um contrato que especifica métodos e propriedades que uma classe que implementa essa interface deverá seguir.

## 3. Demonstre como o uso de default methods pode evitar a repetição de código.
```
public interface ExemploDefaultMetodo {
    default void imprimirSomaDoisNumeros(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class Exemplo1 implements ExemploDefaultMetodo {
}

class Exemplo2 implements ExemploDefaultMetodo {
    public void imprimirSomaDoisNumeros(int n1, int n2) {
        System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
    }
}

// Com os default methods o programador pode ou não modificar o comportamento
// padrão do método definido na interface e com isso evitar a repetição de código.
```

## 4. Em uma situação em que classes abstratas e interfaces são opções viáveis, qual deve ser utilizada prioritariamente?
Interfaces

## 5. Considere o diagrama UML a seguir e faça o que se pede: (OBS: Diagrama está no .PDF)
### O que se pede:
- Crie uma interface de nome Motorizado em que são declarados os métodos void ligarMotor() e void abastecer(int numLitros).
- Implemente a interface Motorizado nas classes Aviao e Carro.
- Escreva um programa de teste capaz de verificar a implementação anterior.
- Crie uma interface de nome Conduzivel onde é declarado o método void curvar(float angulo).
- Implemente a interface Conduzivel nas classes Aviao, Carro e Bicicleta.
- Complete o programa de teste criado anteriormente por forma a testar estas últimas implementações.

[Código implementado](https://github.com/deboradls/POO/tree/5f1eaadc0c82aac97dba9573491c6d2f62a6190a/AtividadeInterfaces/Questao5)