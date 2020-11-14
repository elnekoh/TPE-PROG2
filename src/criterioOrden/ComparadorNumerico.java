package criterioOrden;

import TPE.Atributo;

public class ComparadorNumerico {

	public ComparadorNumerico(){
	}
	public int compare(Atributo atributo1, Atributo atributo2) {
		return atributo1.getValor() - atributo2.getValor();
	}

}
