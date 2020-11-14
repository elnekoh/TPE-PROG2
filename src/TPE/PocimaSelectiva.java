package TPE;

public abstract class PocimaSelectiva extends Pocima {
	private String atributoSeleccionado;
	
	public PocimaSelectiva(String atributoSeleccionado) {
		super();
		this.atributoSeleccionado=atributoSeleccionado;
	}

	@Override
	public abstract void aplicarEfecto(Carta carta);
	
	public Boolean comprobarSiAplica(String atributoSelectivo) {
		if(atributoSeleccionado.equals(atributoSelectivo)) {
			return true;
		}else {
			return false;
		}
	}

}
