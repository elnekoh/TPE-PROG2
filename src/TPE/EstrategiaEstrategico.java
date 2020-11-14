package TPE;

import java.util.ArrayList;

public class EstrategiaEstrategico implements Estrategia {

	public EstrategiaEstrategico() {
		
	}
	@Override
	public String elegirAtributo(Carta carta) {
		ArrayList<Atributo> atributos = carta.getAtributos();
		String atributoSeleccionado = "";
		Integer valorMayor =0;
		for (int i = 0; i < atributos.size(); i++) {
			if(atributos.get(i).getValor() > valorMayor) {
				valorMayor = atributos.get(i).getValor();
				atributoSeleccionado=atributos.get(i).getNombre();
			}
		}
		return atributoSeleccionado;
	}

}
