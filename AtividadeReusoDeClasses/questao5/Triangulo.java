package ReusoDeClasse;

public class Triangulo extends ObjetoGeometrico {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super("Triangulo");
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
        setPerimetro(lado1+lado2+lado3);
        setArea(Math.sqrt(getPerimetro()/2*(getPerimetro()/2-lado1)*(getPerimetro()/2-lado2)*(getPerimetro()/2-lado3)));
	}
	
	public void showDados() {
		System.out.println("O tamanho do primeiro lado do triangulo é de "+lado1);
		System.out.println("o tamanho do segundo lado do triangulo é de"+lado2);
		System.out.println("O tamanho do treceiro lado do triangulo é de "+lado3);
	}

}
