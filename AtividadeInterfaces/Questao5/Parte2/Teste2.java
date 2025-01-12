public class Teste2 {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        Bicicleta b1 = new Bicicleta();
        Aviao a1 = new Aviao();

        a1.abastecer(30);
        a1.ligarMotor();
        a1.curvar(67.2f);
        
        b1.curvar(83.5f);
        
        c1.abastecer(30);
        c1.ligarMotor();
        c1.curvar(75.4f);
    }    
}