package TPE;
//reduce los valores de todos los atributos en un 25%.
public class PocimaKriptonita extends PocimaEfectoMasivo {
	public PocimaKriptonita() {
		super();
	}
	@Override
	public void aplicarEfecto(Carta carta) {
		super.cambiarValorAtributos(carta,0.75);
	}

}
