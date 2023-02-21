package primerPOO;



public class Animales {

	String nombre;
	int iD;
	int edad;
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	public void mostrarCaracteristicas(String nomb,int edad,int iD) {
		System.out.println("Mi animal se llama "+ nomb + " tiene "+edad+" años y su ID es "+iD);
	}
	
}
