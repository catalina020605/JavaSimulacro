import javax.swing.JOptionPane;

public class SalarioDescuento {
	
	int estrato = 0;
	String nombre ="";
	double sueldoActual=0;
	
	
	public void Datos() {
		do {
			nombre=JOptionPane.showInputDialog("Ingrese su nombre");
			sueldoActual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo actual")); 
			estrato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato"));
			
			opcionEstrato(estrato);
		} while (estrato != 7);
	}
	
	public void opcionEstrato (int estrato) {
		
	Double descuento = null;
		
		switch (estrato) {
		case 1:
		case 2: descuento = 0.2; break;
		case 3:
		case 4: descuento = 0.4; break;
		case 5: descuento = 0.8; break;
		case 6: descuento = 0.1; break;
		
		default:
			break;
		}
		
		Double descuentoAplicado = sueldoActual * descuento;
		Double pagoTotal = sueldoActual - descuentoAplicado;
		System.out.println("El descuento que se aplico al sueldo ingredado es de: "+descuentoAplicado);
		System.out.println("El total que se debe pagar con el descuento ya aplicado es de: "+pagoTotal);
	}
}
