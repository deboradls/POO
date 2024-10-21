class Pessoa{
    public String nome;
    public String endereço;
    public int data_nascimento;
    public char sexo;
    public float tarifa;
}

class Contrato{
    public Pessoa titular;
    public String[] dependentes;
    public int ano;
    public int qtd_pessoas;
}

class Fatura{
    public Contrato contrato;
    public int vencimento;	
    public float percentual_de_multas;
    public float juros_por_dia;	
}

class ConsultaOuExame{
    public Pessoa paciente;
    public String profissional;
    public String procedimento;
    public int data;
}