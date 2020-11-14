package TPE;
public class EstrategiaTimbero implements Estrategia {

	public EstrategiaTimbero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String elegirAtributo(Carta carta) {
		Integer cantidadAtributos= carta.getAtributos().size();
		Integer numeroRandom = (int) Math.floor(Math.random() * cantidadAtributos);
		return carta.getAtributos().get(numeroRandom).getNombre();
	}

}
