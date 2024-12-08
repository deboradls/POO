public class Medico extends Pessoa {

    String crm;
    double salario;
    String especializacao;
    boolean podeDarPlantao; // Um médico pode dar plantão

    Medico() {}

    Medico(String nome, String endereco, int idade, String cpf, String sexo, boolean podeAndar, String crm, double salario, String especializacao, boolean podeDarPlantao) {
        super(nome, endereco, idade, cpf, sexo, podeAndar);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
        this.podeDarPlantao = podeDarPlantao;
    }

    public void imprimirValores() {
        super.imprimirValores();
        System.out.println("CRM: " + this.crm);
        System.out.println("Salário: " + this.salario);
        System.out.println("Especialização: " + this.especializacao);
        System.out.println("Pode dar plantão: " + (this.podeDarPlantao ? "sim" : "não"));
    }
}