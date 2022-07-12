package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SistemaSolar {
	private String nombre;
	List<Planeta> lista= new ArrayList<>();
	
	public SistemaSolar() {
		this.nombre="empty";
	}

	public SistemaSolar(String nombre) {
		this.nombre = nombre;
	}
	
	public void addPlaneta(Planeta p) {
		lista.add(p);
	}
	
	public void removePlaneta(Planeta p) {
		lista.remove(p);
	}
	
	public void clearPlaneta() {
		lista.clear();
	}

	@Override
	public String toString() {
		String res= "SistemaSolar " + nombre + "\n ";
		for (Planeta planeta : lista) {
			res = res + planeta+"\n";
		}
		return res;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
