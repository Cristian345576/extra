package clases;



/**
 * @author cristian.barquero
 * @version 1.0
 */
public class Rectangulo {
	private int nombre;
	private int id;
	private double ladoA;
	private double ladoB;
	public Rectangulo() {
		super();
	}
	
	
	/**
	 * @param nombre nombre de la figura printea nombre
	 * @param id identidad de la figura
	 * @param ladoA tamaño en centimetros del lado printea longitud
	 * @param ladoB tamaño en centimetros del lado b printea longitud 
	 */
	public Rectangulo(int nombre, int id, double ladoA, double ladoB) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
	}

}
