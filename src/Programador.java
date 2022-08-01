
public class Programador extends Empleado {
	
	int lineasDeCodigoPorHora = 0;
	String lenguajeDominante = " ";
	
	public Programador(String nombre, int cedula, int edad, String estadoCivil, int salario, String calificacion,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, cedula, edad, estadoCivil, salario, calificacion);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public Programador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	
	@Override
	public int getCedula() {
		// TODO Auto-generated method stub
		return super.getCedula();
	}
	
	@Override
	public void setCedula(int cedula) {
		// TODO Auto-generated method stub
		super.setCedula(cedula);
	}
	
	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}
	
	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}
	
	@Override
	public String getEstadoCivil() {
		// TODO Auto-generated method stub
		return super.getEstadoCivil();
	}
	
	@Override
	public void setEstadoCivil(String estadoCivil) {
		// TODO Auto-generated method stub
		super.setEstadoCivil(estadoCivil);
	}
	
	@Override
	public int getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
	
	@Override
	public void setSalario(int salario) {
		// TODO Auto-generated method stub
		super.setSalario(salario);
	}
	
	@Override
	public String getCalificacion() {
		// TODO Auto-generated method stub
		return super.getCalificacion();
	}
	
	@Override
	public void setCalificacion(String calificacion) {
		// TODO Auto-generated method stub
		super.setCalificacion(calificacion);
	}
	
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	@Override
	public void asignarCalificacion() {
		// TODO Auto-generated method stub
		super.asignarCalificacion();
	}

	@Override
	public String toString() {
		return "Programador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante="
				+ lenguajeDominante + ", toString()=" + super.toString() + "]";
	}

}
