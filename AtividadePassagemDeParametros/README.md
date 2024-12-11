# POO - Atividade - Passagem de parâmetros

# Respostas:
## 1. Explique conceitualmente a diferença entre passagem de parâmetros por valor e por referência.
**Valor:**
<br>
O método recebe uma cópia do valor do argumento original. Alterações feitas no parâmetro dentro do método não afetam o valor original fora do método.

**Referência:**
<br>
O método recebe uma referência ao objeto original. Alterações feitas na referência dentro do método afetam o objeto original, pois ambos apontam para o mesmo espaço na memória.

## 2. Qual tipo de passagem de parâmetros a linguagem Java suporta?
Toda passagem de parâmetros em Java é por valor.

## 3. Na linguagem Java, é possível que a alteração de um parâmetro de entrada em um método seja refletida fora deste método? Explique e demonstre, se esta alteração for possível, criando um código-fonte.
Sim, visto que ao declarar um objeto é instanciado uma referência ao objeto. Logo, passando essa referência como valor no método ele irá copiar a referência, mas irá apontar para o mesmo local de memória, então o objeto original é alterado.

### Exemplo:
```
class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return String.format("%2d/%2d/%4d", this.dia, this.mes, this.ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Data d = new Data(12, 2, 1999);

        System.out.println(d); // antes : 12/2/1999
        alterarData(d, 15, 3, 2003);
        System.out.println(d); // depois : 15/3/2003
    }

    public static void alterarData(Data d, int dia, int mes, int ano) {
        d.dia = dia;
        d.mes = mes;
        d.ano = ano;
    }
}
```

## 4. É possível criar métodos na linguagem Java que são capazes de receber listas variáveis de argumentos? Se sim, qual a sintaxe? Crie um código-fonte de exemplo.
Sim, desde que a lista variável seja o ultimo argumento passado.
### Exexmplo:
```
public class Main {
    public static void main(String[] args) {
        int a = 8, b = 7, c = 4, d = 13, e = 76, f = 24;

        exibirVetor(a);
        exibirVetor(a, b);
        exibirVetor(a, b, c);
        exibirVetor(a, b, c, d);
        exibirVetor(a, b, c, d, e);
        exibirVetor(a, b, c, d, e, f);
    }

    public static void exibirVetor(int... v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }
}
```