package TPE;

import java.util.ArrayList;

public class Carta {
	private String nombre;
	private ArrayList<Atributo> atributos;
	private ArrayList<Pocima> pocimas;

	public Carta(String nombre,ArrayList<Atributo> atributos){
		this.atributos=atributos;
		this.nombre=nombre;
	}
	
	public Carta(String nombre){
		this.nombre=nombre;
	}

	public Atributo buscarAtributo(String nombre) {
		for (int i = 0; i < this.atributos.size(); i++) {
			if(atributos.get(i).getNombre().equals(nombre)) {
				return atributos.get(i);
			}
		}
		this.atributos.add(new Atributo(nombre,0));
		return this.atributos.get(atributos.size()-1);
	}
	
	public void añadirPocima(Pocima pocima) {
		this.pocimas.add(pocima);
	}
	
	public void borrarPocima() {
		this.pocimas.remove(0);
	}
	
	public ArrayList<Pocima> getPocimas(){
		return this.pocimas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atributo> getAtributos() {
		return atributos;
	}

	public void setAtributos(ArrayList<Atributo> atributos) {
		this.atributos = atributos;
	}

}
