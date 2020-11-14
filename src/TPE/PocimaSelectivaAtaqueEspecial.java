package TPE;

public class PocimaSelectivaAtaqueEspecial extends PocimaSelectiva {

	public PocimaSelectivaAtaqueEspecial(String atributoSeleccionado) {
		super(atributoSeleccionado);
	}

	@Override
	public void aplicarEfecto(Carta carta) {
		if(comprobarSiAplica("ataqueEspecial")) {
			Integer nuevoValor=(int) (carta.buscarAtributo("ataqueEspecial").getValor()*1.35);
			carta.buscarAtributo("ataqueEspecial").setValor(nuevoValor);
		}
	}

}
