package modelo;

public class Planeta {
	private String nombre;
	private int numSat;
	private double masa;
	private double volumen;
	private int distSol;
	private String tipo;//gaseoso, terrestre y enano
	private boolean observable;
	public static final float ua=149587870;

	public Planeta() {
		this.nombre=null;
		this.numSat=0;
		this.masa=0;
		this.volumen=0;
		this.distSol=0;
		this.observable=false;
		this.tipo="Terrestre";
	}
	
	public Planeta(String nombre, int numSat, double masa, double volumen, int distSol, String tipo,
			boolean observable) {
		this.nombre = nombre;
		this.numSat = numSat;
		this.masa = masa;
		this.volumen = volumen;
		this.distSol = distSol;
		
		if (tipo.equals("Gaseoso") || tipo.equals("Terrestre") || tipo.equals("Enano")){
			this.tipo = tipo;
		} else {
			this.tipo="Terrestre";
		}
		
		this.observable = observable;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumSat() {
		return numSat;
	}

	public void setNumSat(int numSat) {
		this.numSat = numSat;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDistSol() {
		return distSol;
	}

	public void setDistSol(int distSol) {
		this.distSol = distSol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isObservable() {
		return observable;
	}

	public void setObservable(boolean observable) {
		this.observable = observable;
	}

	public String toString() {
		return "\nNombre:" + this.nombre + "\nNumero Satelites;" 
				+ this.numSat + "\nMasa:" + this.masa + "\nVolumen:"
				+ this.volumen + "\nDistancia media al Sol:" + this.distSol + 
				"\nTipo:" + this.tipo + "\nObservable:" + this.observable;
	}
	
	public double densidad() {	
		return this.masa/this.volumen;	
	}
	
	public boolean exterior() {
		double distanciaUA=this.distSol/(ua/1000000.0);
		//if (this.distSol>3.4*ua)
		if (distanciaUA>3.4) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
}
