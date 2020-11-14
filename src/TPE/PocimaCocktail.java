package TPE;

public class PocimaCocktail extends Pocima {
	private Pocima pocima1;
	private Pocima pocima2;
	public PocimaCocktail(Pocima pocima1, Pocima pocima2) {
		super();
		this.pocima1 = pocima1;
		this.pocima2 = pocima2;
	}

	@Override
	public void aplicarEfecto(Carta carta) {
		pocima1.aplicarEfecto(carta);
		pocima2.aplicarEfecto(carta);
	}

}
