package TPE;


public class Atributo implements Comparable<Atributo>{
	private String nombre;
	private int valor;
	
	public Atributo(String nombre, Integer valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Atributo atributo) {
		if(this.getNombre().equals(atributo.getNombre())) {
			return -1;
		}else {
			return this.getValor()-atributo.getValor();
		}
	}
}