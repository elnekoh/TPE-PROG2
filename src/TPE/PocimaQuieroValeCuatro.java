package TPE;

public class PocimaQuieroValeCuatro extends PocimaValoresIguales {

	public PocimaQuieroValeCuatro() {
		super();
	}
	@Override
	public void aplicarEfecto(Carta carta) {
		cambiarValoresAtributo(carta,4);	
	}

}
