package ReusoDeClasse;

public class Principal {

	public static void main(String[] args) {
		Circulo c = new Circulo(5,0,0);
		Retangulo r = new Retangulo(10,5);
		Triangulo t = new Triangulo(5,5,5);
		
		c.show();
		r.show();
		t.show();
	}

}
