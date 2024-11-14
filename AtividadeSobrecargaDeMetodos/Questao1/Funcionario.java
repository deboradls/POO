public class Funcionario{
    private String nome;
    private Data dataAdmissao;
    private double salario;
    private static int total;
    public final int identificador;


    Funcionario(){
        total++;
        this.identificador = total;
    }

    public int getIdentificador() {
        return identificador;
    }
    public int getTotal(){
        return total;
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if(salario>=700){
            this.salario = salario;
            return true;
        }
        return false;
    }    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Data getDataAdmissao() {
        return dataAdmissao;
    }
    
    public boolean setDataAdmissao(Data dataAdmissao) {
        if(this.dataAdmissao == null){
            this.dataAdmissao = dataAdmissao;
            return true;
        }
        return false;
    }

    public void tirarFerias(){
        System.out.printf("O funcionario %s ira tirar 30 dias de ferias.\n", this.nome);
    }

    public void tirarFerias(int dias){
        System.out.printf("O funcionario %s ira tirar %d dias de ferias.\n", dias,  this.nome);        
    }



}