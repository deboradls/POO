public class Main {
    public static void main(String[] args){
        Relogio r = new Relogio();
        int c=0;

        System.out.printf("\nTeste %d\n",  ++c);
        r.inicializar(6);
        System.out.println("Hora: " + r.horaFormatada() );

        System.out.printf("\nTeste %d\n",  ++c);
        r.inicializar(6, 7);
        System.out.println("Hora: " + r.horaFormatada() );

        System.out.printf("\nTeste %d\n",  ++c);
        r.inicializar(6, 7, 8);
        System.out.println("Hora: " + r.horaFormatada() );

    }
}
