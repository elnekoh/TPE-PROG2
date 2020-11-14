package TPE;

public class EstrategiaObstinado implements Estrategia {
	private String AtributoFavorito;
	private Boolean primeraVez;
	
	public EstrategiaObstinado() {
		this.primeraVez=true;
	}
	@Override
	public String elegirAtributo(Carta carta) {
		if(this.primeraVez) {
			this.elegirAtributoPrimeraVez(carta);
			this.primeraVez=false;
		}
		return this.AtributoFavorito;
	}
	
	private void elegirAtributoPrimeraVez(Carta carta) {
		Integer cantidadAtributos= carta.getAtributos().size();
		Integer numeroRandom = (int) Math.floor(Math.random() * cantidadAtributos);
		this.AtributoFavorito =carta.getAtributos().get(numeroRandom).getNombre();
	}
}
