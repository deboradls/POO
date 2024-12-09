package ReusoDeClasse;

public class ObjetoGeometrico {
	private String forma;
	private double area;
	private double perimetro;
	
	public ObjetoGeometrico(String forma) {
		this.forma = forma;
	}

	public void show() {
		showDados();
		showAreaPerimetro();
		
	}
	public void showDados() {		
	}
	public void showAreaPerimetro() {
		System.out.println("A Area do "+forma+" é de "+area);
		System.out.println("A Area do "+forma+" é de "+perimetro+"\n");
	}
	 public double getArea() {
	        return area;
	    }

	    protected void setArea(double area) {
	        this.area = area;
	    }

	    public double getPerimetro() {
	        return perimetro;
	    }

	    protected void setPerimetro(double perimetro) {
	        this.perimetro = perimetro;
	    }
}
