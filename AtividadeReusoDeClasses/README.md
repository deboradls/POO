# POO - Atividade - Reuso de classes

# Respostas:
## 1. Existem duas formas básicas para realizar o reuso de classes: composição e herança. Explique o significado e cite um exemplo para cada uma.

**Composição:**
<br>
A composição envolve o uso de uma ou mais classes dentro de outra classe, estabelecendo uma relação "tem-um". Nessa abordagem, objetos de uma classe são usados como partes integrantes de outra. Isso permite maior flexibilidade, pois as classes mantêm a independência e podem ser reutilizadas em outros contextos.

### exemplo:
```
class Motor:
    def ligar(self):
        print("Motor ligado.")

class Carro:
    def __init__(self):
        self.motor = Motor()  # Composição: O carro tem um motor

    def ligar_carro(self):
        self.motor.ligar()
        print("Carro ligado.")

meu_carro = Carro()
meu_carro.ligar_carro()
```

**Herança:**
<br>
A herança cria uma relação "é-um", onde uma classe (subclasse) herda as propriedades e comportamentos de outra classe (superclasse). Isso permite reutilizar e especializar comportamentos existentes.

### exemplo:
```
class Animal:
    def comer(self):
        print("Animal comendo.")

class Cachorro(Animal):  # Herança: Cachorro "é um" Animal
    def latir(self):
        print("Cachorro latindo.")

meu_cachorro = Cachorro()
meu_cachorro.comer()  # Método herdado
meu_cachorro.latir()  # Método da subclasse
```

## 2. Explique a diferença entre sobrecarga e sobrescrita de métodos. Crie um código-fonte na linguagem Java demonstrando a diferença entre os dois conceitos.

**Sobrecarga de Métodos (Overloading):**
<br>
A sobrecarga ocorre quando vários métodos com o mesmo nome são definidos na mesma classe, mas com assinaturas diferentes (quantidade ou tipos de parâmetros). Ela é uma forma de polimorfismo em tempo de compilação.

#### Características:
1. Mesma classe.
2. Mesmo nome do método.
3. Diferem no número ou tipo dos parâmetros.
4. Não depende de herança.

**Sobrescrita de Métodos (Overriding):**
<br>
A sobrescrita ocorre quando uma subclasse redefine um método de sua superclasse com a mesma assinatura (nome, parâmetros e tipo de retorno). Ela é uma forma de polimorfismo em tempo de execução.

#### Características:
1. Relaciona-se com herança.
2. Mesma assinatura do método na superclasse.
3. Permite alterar o comportamento do método da superclasse.

### exemplo: 
```
// Sobrecarga
class Calculadora {
    // Método para somar dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Sobrecarga do método somar: soma três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga do método somar: soma dois números em ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }
}

// Sobrescrita
class Animal {
    public void fazerSom() {
        System.out.println("O animal faz algum som.");
    }
}

class Cachorro extends Animal {
    // Sobrescrita do método fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Classe principal para demonstração
public class Main {
    public static void main(String[] args) {
        // Exemplo de sobrecarga
        Calculadora calc = new Calculadora();
        System.out.println("Soma de dois inteiros: " + calc.somar(2, 3));
        System.out.println("Soma de três inteiros: " + calc.somar(2, 3, 4));
        System.out.println("Soma de dois doubles: " + calc.somar(2.5, 3.5));

        // Exemplo de sobrescrita
        Animal animal = new Animal();
        animal.fazerSom(); // Chama o método da superclasse

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(); // Chama o método sobrescrito na subclasse
    }
}
```

## 3. Analise o código-fonte do programa Java a seguir e informe quais mensagens serão impressas de acordo com a sequência de execução do programa.
### exemplo:
```
Saída:
Pessoa()
PessoaFisica() com CPF 0
Show PessoaFisica
ClientePF(999)
Show ClientePF
ClientePF()
```

## 4. Identifique e explique o(s) erro(s) da classe a seguir. 
O erro está presente na segunda linha de public DemoConstrutor(), onde DemoConstrutor(0,0); deveria ser trocado por this(0,0); e deveria ser colocado como a primeira linha do método.

## 5.
[Código implementado](https://github.com/deboradls/POO/tree/8e6e0c7e623d0dc7fd8dc1bc4c282d22a3968512/AtividadeSobrescrita/Respostas)