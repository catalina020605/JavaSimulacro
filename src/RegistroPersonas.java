import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class RegistroPersonas {
	
	HashMap<String, ArrayList<String>> mapPersonas;
	ArrayList<String> listaPersonas;
	
	int mayorEdad=0, menorEdad=0, opcion;
	String edad;
	
	public RegistroPersonas() {
		mapPersonas=new HashMap<String, ArrayList<String>>();
	}
	
	public void iniciar() {
		menu();
	}
	
	 public void menu () {
		 do {
			 opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea\n"+
					 	"1. Ingresar datos\n"+
						"2. Total de personas\n"+
						"3. Cantidad de personas ingresadas\n"+
						"4. Cantidad de personas mayores de edad\n"+
						"5. Cantidad de personas menores de edad"));
				switch (opcion) {
				case 1:
				IngresoDatos();menu();
				break;
				case 2: 
					System.out.println("Total de personas registradas: "+ mapPersonas);
				break;
				case 3: 
				int totalPersonasRegistradas = getSizeMap();
				System.out.println("Cantidad de personas ingresadas: "+totalPersonasRegistradas);
				break;
				case 4:
				System.out.println("Cantidad de personas mayores de edad: "+mayorEdad);
				break;
				case 5:
				System.out.println("Cantidad de personas menores de edad: "+menorEdad);
				break;
				default:
				break;
				}
		} while (opcion != 6);
	 }
	
	public void IngresoDatos() {
		
		listaPersonas=new ArrayList<String>();
		
		String documento=JOptionPane.showInputDialog("Ingrese el documento");
		String nombre=JOptionPane.showInputDialog("Ingrese su nombre"); 
		String profesion=JOptionPane.showInputDialog("Ingrese su profesion");
		edad = JOptionPane.showInputDialog("Ingrese su edad");
		
		listaPersonas.add(documento); 
		listaPersonas.add(nombre); 
		listaPersonas.add(profesion);
		listaPersonas.add(edad);
		
		guardarDatos(listaPersonas);
		validacionedad(edad);
	}
	
	public void guardarDatos(ArrayList<String> listaPersonas) {
		mapPersonas.put(listaPersonas.get(0), listaPersonas); 
		JOptionPane.showMessageDialog(null,"Registro existoso!");
	  }
	
	public HashMap<String, ArrayList<String>> getMapPersonas(){
	    return mapPersonas;
	}
	
	 public int getSizeMap() {
		  return mapPersonas.size(); 
		  }
	 
	 public void validacionedad(String edad) {
		 int edadCon = Integer.parseInt(edad);
		 if (edadCon >= 18) {
			mayorEdad++;
		} else {
			menorEdad++;
		}
	 }
	
}
