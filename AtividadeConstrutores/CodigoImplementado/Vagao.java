public class Vagao {
    int numeroDeSerie;
    String tipo;
    int capacidadeDeCarga;
    double comprimentoEntreTesteiras;
    double comprimentoDosEngates;
    
    public Vagao(){
    }

    public Vagao(int numeroDeSerie){
        this.numeroDeSerie = numeroDeSerie;
    }
    public Vagao(String tipo){
        this.tipo = tipo;
    }
    public Vagao(String tipo, int numeroDeSerie){
        this(numeroDeSerie);
        this.tipo = tipo;
    }
    public Vagao(int numeroDeSerie, String tipo){
        this(tipo, numeroDeSerie);
    }


    public String dadosFormatados(){
        String dados =  String.format("Numero de Serie: %d\n", numeroDeSerie );
        dados += String.format("Tipo: %s\n", tipo );
        dados += String.format("Capacidade de Carga: %d\n", capacidadeDeCarga);
        dados += String.format("Comprimento entre as Testeiras: %.2f\n", comprimentoEntreTesteiras );
        dados += String.format("Comprimento dos engates: %.2f\n", comprimentoDosEngates );
        return dados;
    }
}
