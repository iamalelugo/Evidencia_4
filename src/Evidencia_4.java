import java.util.ArrayList;
import java.util.Scanner;

public class Evidencia_4 {

	static ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
	static Scanner number = new Scanner(System.in);
	private static Scanner text;
	private static Scanner number2;
	
	public static void main(String[] args) {
		
		int opcion = 0, continuar = 0, total = 0;
		
		
		do {
			
			System.out.println("El empleado es programador?[1. SI / 2. NO]: ");
			opcion = number.nextInt();
			
			if(opcion == 1) {
				leeEmpleadosProgramdor();
			}
			else
				if(opcion == 2) {
					leeEmpleados();
				}
			
			System.out.println("Desea agregar otro empleado?[]1.SI / 2.NO:");
			continuar = number.nextInt();
			
			if(continuar == 1) {
				total = total + 1;
			}
			
		}while(continuar == 1);
		
		//Imprimir el arraylist
		for(int i = 0; i <= total; i++) {
			System.out.println(Empleados.get(i));
		}
		
}


 public static void leeEmpleadosProgramdor(){
	 
	 Scanner text = new Scanner(System.in);
	 Scanner number = new Scanner(System.in);
	 Scanner number1 = new Scanner(System.in);
	 
	 String nombre, estadoCivil, lenguajeDominante;
	 int cedula, edad, salario, lineasDeCodigoPorHora, tipo;
	 
	 Programador aux;
	 
	// El Empleado es un programador
		System.out.println("Ingrese el nombre: ");
		nombre = text.nextLine();
		
		System.out.println("Ingrese la edad: ");
		edad = number.nextInt();
		
		System.out.println("Ingrese la cedula: ");
		cedula = number1.nextInt();
		
		System.out.println("Ingrese el estado civil [C. Casado / S. Soltero]: ");
		estadoCivil = text.nextLine();
		
		System.out.println("Ingrese el salario: ");
		salario = number.nextInt();
		
		System.out.println("Ingrese las lineas de codigo por hora que realiza: ");
		lineasDeCodigoPorHora = number1.nextInt();
		
		System.out.println("Ingreseel lenguaje dominante: ");
		lenguajeDominante = text.nextLine();
		
		
		aux = new Programador();
		aux.setNombre(nombre);
		aux.setEdad(edad);
		aux.setCedula(cedula);
		aux.setEstadoCivil(estadoCivil);
		aux.setSalario(salario);
		aux.setLineasDeCodigoPorHora(lineasDeCodigoPorHora);
		aux.setLenguajeDominante(lenguajeDominante);
		
		Empleados.add(aux);
		
 }


public static void leeEmpleados(){
	 
	 text = new Scanner(System.in);
	 number2 = new Scanner(System.in);
	 
	 String nombre, estadoCivil;
	 int cedula, edad, salario;
	 
	 Empleado aux;
	 
		System.out.println("Ingrese el nombre: ");
		nombre = text.nextLine();
		
		System.out.println("Ingrese la edad: ");
		edad = number.nextInt();
		
		System.out.println("Ingrese la cedula: ");
		cedula = number2.nextInt();
		
		System.out.println("Ingrese el estado civil [C. Casado / S. Soltero]: ");
		estadoCivil = text.nextLine();
		
		System.out.println("Ingrese el salario: ");
		salario = number2.nextInt();
			
		aux = new Empleado();
		aux.setNombre(nombre);
		aux.setEdad(edad);
		aux.setCedula(cedula);
		aux.setEstadoCivil(estadoCivil);
		aux.setSalario(salario);
		
		Empleados.add(aux);
		
}
}
