import javax.swing.JOptionPane;
/**
 * 
 * @author Brian David Sandoval Soto
 *
 */
public class AppDatos {
	
	public static void main(String[] args) {
		Alumno al=new Alumno("Brian", "21", "9158195", "Sandoval","Soto","brians_19@hotmail.com","Hombre","México", "Zumpango", "55630");
		JOptionPane.showMessageDialog(null, String.format("Hola %s \n tus apellidos son: %s %s \n tu edad es %s \n tu telefono: %s \n tu correo es: %s \n eres %s \n y vives en %s \n colonia %s \n codigo postal %s \n", al.getNombre(), al.getApePat(), al.getApeMat(), al.getEdad(), al.getTelefono(), al.getCorreo(), al.getSexo(), al.getEstado(), al.getColonia(), al.getCodigoPostal()));
	}
}
