package ReusoDeClasse;


public class Circulo extends ObjetoGeometrico {
	private double raio;
	private double centroX;
	private double centroY;

	
	public Circulo(double raio, double centroX, double centroY) {
		super("Círculo");
		this.raio = raio;
		this.centroX = centroX;
		this.centroY = centroY;		
		setArea(Math.PI * raio * raio);
        setPerimetro(2 * Math.PI * raio);
	}
	
	public void showDados() {
		System.out.println("O raio do circulo é de "+raio);
		System.out.println("As cordenadas do centro do circulo são ("+centroX+","+centroY+")");		
	}

}
