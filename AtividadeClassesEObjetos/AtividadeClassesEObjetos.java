import java.util.Date;
import java.util.List;

class Pessoa {
    private String nome;
    private String endereco;
    private Date dataNascimento;
    private char sexo;
    private float tarifa;

    public Pessoa(String nome, String endereco, Date dataNascimento, char sexo, float tarifa) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.tarifa = tarifa;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public Date getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(Date dataNascimento) { this.dataNascimento = dataNascimento; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public float getTarifa() { return tarifa; }
    public void setTarifa(float tarifa) { this.tarifa = tarifa; }
}

class Contrato {
    private Pessoa titular;
    private List<Pessoa> dependentes;
    private Date ano;
    private int quantidadeDePessoa;

    public Contrato(Pessoa titular, List<Pessoa> dependentes, Date ano, int quantidadeDePessoa) {
        this.titular = titular;
        this.dependentes = dependentes;
        this.ano = ano;
        this.quantidadeDePessoa = quantidadeDePessoa;
    }

    // Getters e Setters
    public Pessoa getTitular() { return titular; }
    public void setTitular(Pessoa titular) { this.titular = titular; }

    public List<Pessoa> getDependentes() { return dependentes; }
    public void setDependentes(List<Pessoa> dependentes) { this.dependentes = dependentes; }

    public Date getAno() { return ano; }
    public void setAno(Date ano) { this.ano = ano; }

    public int getQuantidadeDePessoa() { return quantidadeDePessoa; }
    public void setQuantidadeDePessoa(int quantidadeDePessoa) { this.quantidadeDePessoa = quantidadeDePessoa; }
}

class Fatura {
    private Contrato contrato;
    private Date vencimento;
    private float percentualDeMultas;
    private float jurosPorDia;

    public Fatura(Contrato contrato, Date vencimento, float percentualDeMultas, float jurosPorDia) {
        this.contrato = contrato;
        this.vencimento = vencimento;
        this.percentualDeMultas = percentualDeMultas;
        this.jurosPorDia = jurosPorDia;
    }

    // Getters e Setters
    public Contrato getContrato() { return contrato; }
    public void setContrato(Contrato contrato) { this.contrato = contrato; }

    public Date getVencimento() { return vencimento; }
    public void setVencimento(Date vencimento) { this.vencimento = vencimento; }

    public float getPercentualDeMultas() { return percentualDeMultas; }
    public void setPercentualDeMultas(float percentualDeMultas) { this.percentualDeMultas = percentualDeMultas; }

    public float getJurosPorDia() { return jurosPorDia; }
    public void setJurosPorDia(float jurosPorDia) { this.jurosPorDia = jurosPorDia; }
}

class ConsultaOuExame {
    private Pessoa paciente;
    private String profissional;
    private String procedimento;
    private Date data;

    public ConsultaOuExame(Pessoa paciente, String profissional, String procedimento, Date data) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.procedimento = procedimento;
        this.data = data;
    }

    // Getters e Setters
    public Pessoa getPaciente() { return paciente; }
    public void setPaciente(Pessoa paciente) { this.paciente = paciente; }

    public String getProfissional() { return profissional; }
    public void setProfissional(String profissional) { this.profissional = profissional; }

    public String getProcedimento() { return procedimento; }
    public void setProcedimento(String procedimento) { this.procedimento = procedimento; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
}
