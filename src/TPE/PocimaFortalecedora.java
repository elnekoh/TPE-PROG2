package TPE;
//es una pocima por la cual se incrementa
//el valor de todos los atributos en un 20% de su valor.
public class PocimaFortalecedora extends PocimaEfectoMasivo {

	public PocimaFortalecedora() {
		super();
	}
	@Override
	public void aplicarEfecto(Carta carta) {
		super.cambiarValorAtributos(carta,1.20);
	}

}
