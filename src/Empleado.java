public class Empleado {
	
	
	private String nombre = " ";
	private int cedula = 0;
	private int edad = 0 ;
	private String estadoCivil = " ";
	private int salario = 0;
	private String calificacion = "";
	
	public Empleado(String nombre, int cedula, int edad, String estadoCivil, int salario, String calificacion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.salario = salario;
		this.calificacion = calificacion;
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", estadoCivil=" + estadoCivil
				+ ", salario=" + salario + ", calificacion=" + calificacion + "]";
	}

	public void asignarCalificacion() {
		
		if(this.edad >= 18 || this.edad <= 21 ) {
			this.calificacion = "Principiante";
			this.setCalificacion(this.calificacion);
		}
		else
			if(this.edad >= 22 || this.edad <= 35 ) {
				this.calificacion = "Intermedio";
				this.setCalificacion(this.calificacion);
			}
			else
				if(this.edad > 35 || this.edad <= 70 ) {
					this.calificacion = "Senior";
					this.setCalificacion(this.calificacion);
				}
	}
}
