package TPE;

public class PocimaSelectivaAtaque extends PocimaSelectiva {

	public PocimaSelectivaAtaque(String atributoSeleccionado) {
		super(atributoSeleccionado);
	}

	@Override
	public void aplicarEfecto(Carta carta) {
		if(comprobarSiAplica("ataque")) {
			Integer nuevoValor=(int) (carta.buscarAtributo("ataque").getValor()*1.35);
			carta.buscarAtributo("ataque").setValor(nuevoValor);
		}

	}

}
