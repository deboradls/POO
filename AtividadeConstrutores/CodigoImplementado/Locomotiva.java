public class Locomotiva {
    private String numeroDeSerie;   
    private double comprimento;
    private double capacidadeDeTracao;

    public Locomotiva(){

    }

    public Locomotiva(String numeroDeSerie){
        this.numeroDeSerie = numeroDeSerie;
    }
    public Locomotiva(double comprimento){
        this.comprimento = comprimento;
    }
    public Locomotiva( double comprimento, String numeroDeSerie ){
        this.comprimento = comprimento;
        this.numeroDeSerie = numeroDeSerie;
    }
    public Locomotiva( String numeroDeSerie, double comprimento ){
        this(comprimento, numeroDeSerie);
    }  
    public Locomotiva( String numeroDeSerie, double comprimento, double capacidadeDeTracao ){
        this(comprimento, numeroDeSerie);
        this.capacidadeDeTracao = capacidadeDeTracao;
    }

    // get/set
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }
    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getCapacidadeDeTracao() {
        return capacidadeDeTracao;
    }
    public void setCapacidadeDeTracao(double capacidadeDeTracao) {
        this.capacidadeDeTracao = capacidadeDeTracao;
    }


}
