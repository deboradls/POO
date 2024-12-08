public class Hospital {

    String nome;
    String endereco;

    Hospital(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void imprimirValores() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
    }
}
