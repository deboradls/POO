package ReusoDeClasse;

public class Retangulo extends ObjetoGeometrico {
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super("Retangulo");
		this.base = base;
		this.altura = altura;
		setPerimetro(2*base+2*altura);
		setArea(base*altura);
	}
	
	public void showDados() {
		System.out.println("A base do retangulo é de "+base);
		System.out.println("A altura do retangulo é de"+altura);
	}

}
