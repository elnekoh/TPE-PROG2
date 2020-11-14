import java.util.ArrayList;

import TPE.Atributo;
import TPE.Carta;
import TPE.JuegoDeCartas;
import TPE.JugadorEstrategico;
import TPE.JugadorObstinado;
import TPE.JugadorTimbero;

public class Main {

	public static void main(String[] args) {
		JugadorObstinado carlo = new JugadorObstinado("Carlo");
		JugadorEstrategico carla = new JugadorEstrategico("Carla");
		//atributos ataque, ataqueEspecial,agilidad, velocidad
		Atributo a1 = new Atributo("ataque",200);
		Atributo a2 = new Atributo("ataque",100);
		Atributo a3 = new Atributo("ataque",600);
		Atributo a4 = new Atributo("ataqueEspecial",300);
		Atributo a5 = new Atributo("ataqueEspecial",150);
		Atributo a6 = new Atributo("ataqueEspecial",200);
		Atributo a7 = new Atributo("agilidad",600);
		Atributo a8 = new Atributo("agilidad",100);
		Atributo a9 = new Atributo("agilidad",340);
		Atributo a10 = new Atributo("velocidad",50);
		Atributo a11 = new Atributo("velocidad",400);
		Atributo a12 = new Atributo("velocidad",40);
		
		ArrayList<Atributo> atributos1 = new ArrayList<Atributo>();
		atributos1.add(a1);
		atributos1.add(a4);
		atributos1.add(a7);
		atributos1.add(a10);
		
		ArrayList<Atributo> atributos2 = new ArrayList<Atributo>();
		atributos2.add(a2);
		atributos2.add(a5);
		atributos2.add(a8);
		atributos2.add(a11);
		
		ArrayList<Atributo> atributos3 = new ArrayList<Atributo>();
		atributos3.add(a3);
		atributos3.add(a6);
		atributos3.add(a8);
		atributos3.add(a12);
		
		ArrayList<Atributo> atributos4 = new ArrayList<Atributo>();
		atributos4.add(a1);
		atributos4.add(a5);
		atributos4.add(a9);
		atributos4.add(a11);
		
		ArrayList<Atributo> atributos5 = new ArrayList<Atributo>();
		atributos5.add(a3);
		atributos5.add(a4);
		atributos5.add(a8);
		atributos5.add(a12);
		
		ArrayList<Atributo> atributos6 = new ArrayList<Atributo>();
		atributos6.add(a3);
		atributos6.add(a5);
		atributos6.add(a7);
		atributos6.add(a11);
		
		ArrayList<Atributo> atributos7 = new ArrayList<Atributo>();
		atributos7.add(a1);
		atributos7.add(a5);
		atributos7.add(a7);
		atributos7.add(a12);
		
		ArrayList<Atributo> atributos8 = new ArrayList<Atributo>();
		atributos8.add(a3);
		atributos8.add(a4);
		atributos8.add(a9);
		atributos8.add(a10);
		
		ArrayList<Atributo> atributos9 = new ArrayList<Atributo>();
		atributos9.add(a3);
		atributos9.add(a4);
		atributos9.add(a7);
		atributos9.add(a11);
		
		ArrayList<Atributo> atributos10 = new ArrayList<Atributo>();
		atributos10.add(a1);
		atributos10.add(a4);
		atributos10.add(a8);
		atributos10.add(a11);
		
		ArrayList<Atributo> atributos11 = new ArrayList<Atributo>();
		atributos11.add(a2);
		atributos11.add(a4);
		atributos11.add(a8);
		atributos11.add(a12);
		
		ArrayList<Atributo> atributos12 = new ArrayList<Atributo>();
		atributos12.add(a1);
		atributos12.add(a4);
		atributos12.add(a9);
		atributos12.add(a10);
		//cartas
		ArrayList<Carta> mazo = new ArrayList<Carta>();
		mazo.add(new Carta("Mudkip",atributos1));
		mazo.add(new Carta("Charmeleon",atributos2));
		mazo.add(new Carta("Squirtle",atributos3));
		mazo.add(new Carta("Pikachu",atributos4));
		mazo.add(new Carta("Chikorita",atributos5));
		mazo.add(new Carta("Mew",atributos6));
		mazo.add(new Carta("Magirkarp",atributos7));
		mazo.add(new Carta("Jigglypuff",atributos8));
		mazo.add(new Carta("Greninja",atributos9));
		mazo.add(new Carta("Venusaur",atributos10));
		mazo.add(new Carta("Zapdos",atributos11));
		mazo.add(new Carta("Abra",atributos12));
		
		
		//juego
		JuegoDeCartas juego = new JuegoDeCartas(carlo,carla,mazo);
		juego.correrJuego();
	}

}
