class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mac Myller");
        p1.idade = 22;

        Pessoa p2 = new Pessoa("Joao");
        p1.idade = 65;

        System.out.printf( "Os campos contido os nomes das pessoas sao diferentes: %s - %s\n", p1.nome, p2.nome );
        System.out.printf("Mas para todas as pessoas a quantidade será a mesma: %d \n", Pessoa.quantidade );

    }
}