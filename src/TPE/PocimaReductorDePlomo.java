package TPE;

public class PocimaReductorDePlomo extends PocimaEfectoMasivo {
	public PocimaReductorDePlomo() {
		super();
	}
	@Override
	public void aplicarEfecto(Carta carta) {
		super.cambiarValorAtributos(carta,0.45);
	}

}
