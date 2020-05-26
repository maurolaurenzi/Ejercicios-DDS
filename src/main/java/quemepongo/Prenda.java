package quemepongo;

public class Prenda {
	private Tipo tipo;
	private Material material;
	private Trama trama;
	private Color colorPrimario;
	private Color colorSecundario;
	private double temperaturaMaxima;
	
	

	public Prenda(Tipo _tipo, Material _material, Trama _trama, Color _colorPri, Color _colorSec, double _temperaturaMaxima) {
		super();
		this.tipo = _tipo;
		this.material = _material;
		this.trama = _trama;
		this.colorPrimario = _colorPri;
		this.colorSecundario = _colorSec;
		this.temperaturaMaxima = _temperaturaMaxima;
		
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Material getMaterial() {
		return material;
	}

	public Trama getTrama() {
		return trama;
	}

	public Color getColorPrimario() {
		return colorPrimario;
	}

	public Color getColorSecundario() {
		return colorSecundario;
	}
	
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public CategoriaPrenda categoria() {
		return tipo.getCategoria();
	};

	public boolean esValida() {
		return true;
	};
}
