package TPE;

import java.util.ArrayList;

public class Mazo {
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		this.cartas = new ArrayList<Carta>();
	}
	
	public Mazo(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public Carta getCarta(int indice) {
		return this.cartas.get(indice);
	}
	
	public void añadirCarta(Carta carta){
		this.cartas.add(carta);
	}
}
