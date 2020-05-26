package quemepongo;

abstract public class Sastre {
	public Uniforme crearUniforme() {
		return new Uniforme(
				this.fabricarParteSuperior(), 
				this.fabricarParteInferior(), 
				this.fabricarCalzado());
	}

	protected abstract Prenda fabricarParteSuperior();

	protected abstract Prenda fabricarParteInferior();

	protected abstract Prenda fabricarCalzado();
}
