package TPE;
//Fortalecedora Plus: es una pócima la cual incrementa
//los valores de todos los atributos en un 50%.
public class PocimaFortalecedoraPlus extends PocimaEfectoMasivo {
	public PocimaFortalecedoraPlus() {
		super();
	}
	@Override
	public void aplicarEfecto(Carta carta) {
		super.cambiarValorAtributos(carta,1.50);
	}

}
