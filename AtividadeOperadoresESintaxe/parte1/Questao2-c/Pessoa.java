public class Pessoa {
    // variáveis de instancia: 
    String nome;    
    int idade;
    // uma variável de instância pertence ao objeto criado e somente a esse objeto

    // variavel de class:
    static int quantidade;

    Pessoa(String nome){
        this.nome = nome;
        quantidade++;
    }
}
