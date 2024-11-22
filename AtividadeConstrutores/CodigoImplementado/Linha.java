public class Linha {
    private static int totalLinhas;
    private int numero;
    private double extensaoEmMetros;
    private String descricao;
    private Trem trem;

    Linha( Trem trem ){
        this.trem = trem;
        this.numero = ++totalLinhas;
    }

    public int getNumero() {
        return numero;
    }
    // public void setNumero(int numero) {
    //     this.numero = numero;
    // }
    public double getExtensaoEmMetros() {
        return extensaoEmMetros;
    }
    public boolean setExtensaoEmMetros(double extensaoEmMetros) {
        if(this.extensaoEmMetros!=0){
            this.extensaoEmMetros = extensaoEmMetros;
            return true;
        }        
        return false;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Trem getTrem() {
        return trem;
    }
    public void setTrem(Trem trem) {
        this.trem = trem;
    }

}
