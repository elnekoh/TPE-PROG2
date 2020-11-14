package TPE;

import java.util.ArrayList;

import criterioOrden.ComparadorNumerico;

public class JuegoDeCartas {
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugadorActual;
	private Integer contadorDeRondas;
	private String atributoElegido;
	private ArrayList<Carta> mazo;
	private ComparadorNumerico comparador;
	
	public JuegoDeCartas(Jugador jugador1, Jugador jugador2,ArrayList<Carta> mazo) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.jugadorActual= this.jugador1;
		this.contadorDeRondas=1;
		this.comparador = new ComparadorNumerico();
		this.mazo= mazo;
	}
	
	private void prepararJuego() {
		System.out.print("Repartiendo cartas: \n");
		for (int i = 0; i < mazo.size(); i++) {
			jugadorActual.añadirCarta(mazo.get(i));
			this.cambiarJugadorActual();
		}
		this.jugadorActual=jugador1;
	}
	
	public void correrJuego() {
		Integer contador = 50;
		this.prepararJuego();
		while(((this.jugador1.cartasEnPosesion.size()>0)&&(this.jugador2.cartasEnPosesion.size()>0)) && contador>0) {
			this.turno();
			contador--;
		}
		if(this.jugador1.cartasEnPosesion.size()==this.jugador2.cartasEnPosesion.size()) {
			System.out.print("Los jugadores empataron.\n");
		}else {
			if(this.jugador1.cartasEnPosesion.size()>this.jugador2.cartasEnPosesion.size()) {
				System.out.print("Ganó "+this.jugador1.getNombre()+" Felicidades!\n");
			}else {
				System.out.print("Ganó "+this.jugador2.getNombre()+" Felicidades!\n");
			}
		}
	}
	
	private void cambiarJugadorActual() {
		if(this.jugadorActual.equals(jugador1)) {
			this.jugadorActual = jugador2;
		}else {
			this.jugadorActual = jugador1;
		}
	}
	
	private void turno() {
		System.out.print("---- Ronda "+ this.contadorDeRondas + " ----\n");
		//jugador que juega esta ronda
		System.out.print("Es el turno de " + this.jugadorActual.getNombre()+"\n");
		this.atributoElegido = this.jugadorActual.elegirAtributo();
		Carta cartaJ1 =this.jugador1.cartasEnPosesion.get(0);
		Carta cartaJ2 =this.jugador2.cartasEnPosesion.get(0);
		//atributo que eligio el jugador
		System.out.print(this.jugadorActual.getNombre()+" eligio el atributo: "+this.atributoElegido+"\n");
		Atributo atributoCartaJ1 = cartaJ1.buscarAtributo(atributoElegido);
		Atributo atributoCartaJ2 = cartaJ2.buscarAtributo(atributoElegido);
		//cartas de ambos jugadores
		System.out.print(this.jugador1.getNombre()+" juega con: "+cartaJ1.getNombre()+". quien posee "+ atributoCartaJ1.getValor()+" puntos de "+atributoCartaJ1.getNombre()+"\n");
		System.out.print(this.jugador2.getNombre()+" juega con: "+cartaJ2.getNombre()+". quien posee "+ atributoCartaJ2.getValor()+" puntos de "+atributoCartaJ2.getNombre()+"\n");
		Integer comparacion = this.comparador.compare(atributoCartaJ1,atributoCartaJ2);
		if(comparacion.equals(0)) {
			System.out.print("Empate.\n");
			this.jugador1.mandarCartaAlPrincipio();
			this.jugador2.mandarCartaAlPrincipio();
		}else {
			if(comparacion>1) {
				System.out.print(this.jugador1.getNombre()+" Gana la ronda con: "+ atributoCartaJ1.getValor()+ " puntos de "+atributoElegido+"\n");
				this.jugador1.añadirCarta(cartaJ2);
				this.jugador2.descartar();
				this.jugador1.mandarCartaAlPrincipio();
				if(this.jugadorActual.equals(jugador2)) {
					this.cambiarJugadorActual();					
				}
			}else {
				System.out.print(this.jugador2.getNombre()+" Gana la ronda con: "+ atributoCartaJ2.getValor()+ " puntos de "+atributoElegido+"\n");
				this.jugador2.añadirCarta(cartaJ1);
				this.jugador1.descartar();
				this.jugador2.mandarCartaAlPrincipio();
				if(this.jugadorActual.equals(jugador1)) {
					this.cambiarJugadorActual();					
				}
			}
		}
		//cartas restantes
		System.out.print("A "+this.jugador1.getNombre()+" le quedan "+this.jugador1.cartasEnPosesion.size()+ " cartas\n");
		System.out.print("Y a "+this.jugador2.getNombre()+" le quedan "+this.jugador2.cartasEnPosesion.size()+ " cartas\n");
		this.contadorDeRondas++;
	}
}
