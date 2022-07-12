package main;
import modelo.Planeta;
import modelo.SistemaSolar;
import java.util.Scanner;

public class PrincipalPlaneta {

	public static void main(String[] args) {
		System.out.println("|PLANETAS|\n");
		
		/*System.out.println("*  +  *  * *    *   +");
		System.out.println("  *  *   *    * +    *");
		System.out.println(" *  +  *     *    *     *");
		System.out.println("  *   +   *   +    *   *");*/
		
		Planeta p1= new Planeta("Omicron",22,398765000,50000,150000000,"Gaseoso",true);
		Planeta p2= new Planeta("LV-426",0,200000,30000,940000000,"Alien",false);
	
		//System.out.println("Planeta 1: "+ p1);
		//System.out.println("\nPlaneta 2: "+ p2.imprimir());
		
		System.out.println("--------------------------------");

		/*System.out.println("\nDensidad de "+p1.getNombre()+": "+p1.densidad());
		System.out.println("Exterior: "+p1.exterior());
		System.out.println("\nDensidad de "+p2.getNombre()+": "+p2.densidad());
		System.out.println("Exterior: "+p2.exterior());*/
		
		Scanner teclado= new Scanner(System.in);
		SistemaSolar sol1= new SistemaSolar ("Sol1"); 
		
		int op;
		do {
			System.out.println("\nOpcion 1: Añadir planeta");
			System.out.println("Opcion 2: Borrar planeta");
			System.out.println("Opcion 3: Limpiar lista");
			System.out.println("Opcion 4: Salir");
			System.out.println("Selecciona opcion: ");
			op=teclado.nextInt();
		
			if (op==1) {		
				sol1.addPlaneta(p1);
			} else if (op==2) {
				sol1.removePlaneta(p1);
			} else if (op==3) {
				sol1.clearPlaneta();
			}

			System.out.println(sol1);
		} while (op!=4);
		
		System.out.println("\n1ADIOS");
		
	}

}
