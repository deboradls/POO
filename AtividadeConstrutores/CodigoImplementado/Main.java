public class Main {
    public static void main(String[] args) {

        EstacaoFerroviaria e1, e2;
        Linha linha;
        Trem trem;
        Locomotiva locomotiva;
        Vagao v1, v2, v3;
        
        locomotiva = new Locomotiva("182924");
        v1 = new Vagao("Gôndola", 127);
        v2 = new Vagao("Frigorifico", 928);
        v3 = new Vagao("Gaiola", 18);
        trem = new Trem(locomotiva, v1, v2, v3 );
        linha = new Linha( trem );

        e1 = new EstacaoFerroviaria(linha);
        e2 = new EstacaoFerroviaria(linha);
        e1.setSigla("ORI");
        e2.setSigla("DES");
        
        
        System.out.println("\n");
        System.out.printf("Estacao de Partida : %s\n", e1.getSigla());
        System.out.printf("Estacao de Chegada : %s\n", e2.getSigla());
        System.out.printf("Linha: %d\n", e1.linhas[0].getNumero() );
        System.out.printf("Locomotiva: %s\n", e1.linhas[0].getTrem().locomotiva.getNumeroDeSerie());
        System.out.print(">>>Vagoes: " );
        for(int c=0; c<e1.linhas[0].getTrem().vagoes.length; c++){
            System.out.printf("%s", e1.linhas[0].getTrem().vagoes[c].tipo);
            if(c!=e1.linhas[0].getTrem().vagoes.length - 1){
                System.out.print(", ");
            }else{
                System.out.println(". ");                
            }
        }

        
        
        
    }
}
