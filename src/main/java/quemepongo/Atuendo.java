package quemepongo;

public class Atuendo {
	private Prenda parteSuperior;
	private Prenda parteInferior;
	private Prenda calzado;
	private Prenda accesorio;
	
	public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio) {
		super();
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.calzado = calzado;
		this.accesorio = accesorio;
	}

	public Prenda getParteSuperior() {
		return parteSuperior;
	}

	public Prenda getParteInferior() {
		return parteInferior;
	}

	public Prenda getCalzado() {
		return calzado;
	}

	public Prenda getAccesorio() {
		return accesorio;
	}
	
}
