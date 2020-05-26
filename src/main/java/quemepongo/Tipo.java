package quemepongo;

public class Tipo {
	private CategoriaPrenda categoria;

	public Tipo(CategoriaPrenda _categoria) {
		this.categoria = _categoria;
	};

	public CategoriaPrenda getCategoria() {
		return categoria;
	};
}
