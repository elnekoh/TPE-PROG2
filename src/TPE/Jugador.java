package TPE;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	protected ArrayList<Carta> cartasEnPosesion;
	private Estrategia estrategia;
	
	public Jugador(String nombre, Estrategia estrategia) {
		this.nombre=nombre;
		this.cartasEnPosesion = new ArrayList<Carta>();
		this.estrategia = estrategia;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void añadirCarta(Carta carta) {
		this.cartasEnPosesion.add(carta);
	}

	public String elegirAtributo() {
		return this.estrategia.elegirAtributo(this.cartasEnPosesion.get(0));
	}

	public void descartar() {
		this.cartasEnPosesion.remove(0);
	}
	
	public void mandarCartaAlPrincipio() {
		this.cartasEnPosesion.add(this.cartasEnPosesion.get(0));
		this.descartar();
	}

	
}
