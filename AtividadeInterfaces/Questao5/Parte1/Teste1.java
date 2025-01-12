public class Teste1 {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        Aviao a1 = new Aviao();
        
        c1.abastecer(30);
        c1.ligarMotor();

        a1.abastecer(30);
        a1.ligarMotor();
    }    
}