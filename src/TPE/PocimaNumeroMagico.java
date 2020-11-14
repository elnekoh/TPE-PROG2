package TPE;

public class PocimaNumeroMagico extends PocimaValoresIguales {

	public PocimaNumeroMagico() {
		super();
	}

	@Override
	public void aplicarEfecto(Carta carta) {
		cambiarValoresAtributo(carta,23);
	}

}
