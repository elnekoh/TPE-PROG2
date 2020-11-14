package TPE;

public abstract class PocimaValoresIguales extends Pocima {
	public PocimaValoresIguales() {
		super();
	}
	@Override
	public abstract void aplicarEfecto(Carta carta);
	
	public void cambiarValoresAtributo(Carta carta,Integer valor) {
		Integer cantidadAtributos = carta.getAtributos().size();
		for (int i = 0; i < cantidadAtributos; i++) {
			carta.getAtributos().get(i).setValor(valor);
		}
	}
}
