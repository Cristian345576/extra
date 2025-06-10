package clases;

/**
 * 
 */
public class circulo {
	


	



	private int id;
	private double radio;
	private String nombre;
	private String color;
	
	//Constructores
	public circulo() {
		super();
	}

	public circulo(int id, double radio, String nombre, String color) {
		super();
		this.id = id;
		this.radio = radio;
		this.nombre = nombre;
		this.color = color;
	}
		//Getters Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
			
		//toString 


		
	}

		@Override
		public String toString() {
			return "circulo [id=" + id + ", radio=" + radio + ", nombre=" + nombre + ", color=" + color + "]";
		}

}            
