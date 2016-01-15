/**
 * 
 * @author Brian David Sandoval Soto
 *
 */
public class Alumno {
	
	private String nombre, edad, telefono, apePat, apeMat, correo, sexo, estado, colonia, codigoPostal;
	
	/**
	 * Constructor sin parametros, es seguro crear un objeto
	 */
	public Alumno(){} //constructor de ley para la seguridad
	
	/**
	 * 
	 * @param nombre de la persona en formato String
	 * @param edad de la persona en formato String
	 * @param telefono de la persona en formato String
	 * @param apePat Apellido Paterno en formato String
	 * @param apeMat Apellido Materno en formato String
	 * @param correo Correo electronico en formato String
	 * @param sexo Sexo de la persona en formato String 
	 * @param estado Estado donde vive la persona en formato String
	 * @param colonia Colonia donde vive la persona en formato String
	 * @param codigoPostal Código Postal del municipio de la persona en formato String
	 */
	public Alumno(String nombre, String edad, String telefono, String apePat, String apeMat, String correo, String sexo,
			String estado, String colonia, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.correo = correo;
		this.sexo = sexo;
		this.estado = estado;
		this.colonia = colonia;
		this.codigoPostal = codigoPostal;
	}
	/**
	 * 
	 * @return regresa el nombre de la persona
	 */

	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return regresa el apellido Paterno
	 */

	public String getApePat() {
		return apePat;
	}
	/**
	 * 
	 * @param apePat Introduce el apellido paterno en formato String
	 */

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
/**
 * 
 * @return regresa el apellido Materno
 */

	public String getApeMat() {
		return apeMat;
	}
/**
 * 
 * @param apeMat introduce el apellido materno de la persona en formato String
 */

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
/**
 * 
 * @return regresa el correo electronico
 */

	public String getCorreo() {
		return correo;
	}

/**
 * 
 * @param correo introduce o envia el correo de la persona en formato String
 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

/**
 * 
 * @return devuelve el sexo de la persona
 */
	public String getSexo() {
		return sexo;
	}
/**
 * 
 * @param sexo introduce el sexo de la persona en formato String
 */

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
/**
 * 
 * @return regresa el Estado donde vive la persona
 */

	public String getEstado() {
		return estado;
	}
/**
 * 
 * @param estado envia o asigna el Estado donde vive la persona en formato String
 */

	public void setEstado(String estado) {
		this.estado = estado;
	}

/**
 * 
 * @return devuelve el nombre de la colonia donde vive la persona
 */
	public String getColonia() {
		return colonia;
	}
/**
 * 
 * @param colonia envia el nombre de la colonia en formato String
 */

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
/**
 * 
 * @return regresa el codigo postal donde vive la persona
 */

	public String getCodigoPostal() {
		return codigoPostal;
	}
/**
 * 
 * @param codigoPostal envia el código postal de la persona en formato String
 */

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

/**
 * 
 * @param nombre envia el nombre de la persona en formato String
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return devuelve el la edad de la persona
 */
	public String getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad envia la edad en formato String
	 */

	public void setEdad(String edad) {
		this.edad = edad;
	}
/**
 * 
 * @return regresa el número de telefono
 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono envia el número de telefono en formato String
	 */

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 

}
