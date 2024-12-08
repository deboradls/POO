public class Pessoa {

    String nome;
    String endereco;
    int idade;
    String cpf;
    String sexo;
    boolean podeAndar; // Uma pessoa pode andar

    Pessoa() {}

    Pessoa(String nome, String endereco, int idade, String cpf, String sexo, boolean podeAndar) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.podeAndar = podeAndar;
    }

    public void imprimirValores() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Pode andar: " + (this.podeAndar ? "sim" : "não"));
    }
}
