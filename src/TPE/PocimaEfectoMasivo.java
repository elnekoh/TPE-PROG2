package TPE;

public abstract class PocimaEfectoMasivo extends Pocima {
	public PocimaEfectoMasivo() {
		super();
	}
	@Override
	public abstract void aplicarEfecto(Carta carta);
	
	public void cambiarValorAtributos(Carta carta,Double constante) {
		Integer cantidadAtributos = carta.getAtributos().size();
		Integer valorAtributo = 0;
		for (int i = 0; i < cantidadAtributos; i++) {		
			valorAtributo = (int) (carta.getAtributos().get(i).getValor()*constante);
			carta.getAtributos().get(i).setValor(valorAtributo);
		}
	}

}
