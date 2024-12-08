public class Paciente extends Pessoa {

    String doenca;
    String medicacao;
    boolean sentindoDor; // Um paciente pode sentir dor
    boolean alta;        // Um paciente pode ter alta

    Paciente() {}

    Paciente(String nome, String endereco, int idade, String cpf, String sexo, boolean podeAndar, String doenca, String medicacao, boolean sentindoDor, boolean alta) {
        super(nome, endereco, idade, cpf, sexo, podeAndar);
        this.doenca = doenca;
        this.medicacao = medicacao;
        this.sentindoDor = sentindoDor;
        this.alta = alta;
    }

    public void imprimirValores() {
        super.imprimirValores();
        System.out.println("Doença: " + this.doenca);
        System.out.println("Medicação: " + this.medicacao);
        System.out.println("Sentindo dor: " + (this.sentindoDor ? "sim" : "não"));
    }
}
