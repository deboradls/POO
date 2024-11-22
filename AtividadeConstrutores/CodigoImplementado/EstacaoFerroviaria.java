public class EstacaoFerroviaria{

    String sigla;
    String descricao;
    Linha linhas[];


    EstacaoFerroviaria(Linha... linhas){
        this.linhas = linhas;        
    }

    public void setLinhas(Linha... linhas) {
        this.linhas = linhas;
    }
    public Linha[] getLinhas() {
        return linhas;
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}