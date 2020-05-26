package quemepongo;
import java.util.Objects;
public class BorradorPrenda {
	private Tipo tipo;
	private Material material;
	private Trama trama = Trama.LISA;
	private Color colorPrimario;
	private Color colorSecundario;
	private double temperaturaMaxima;
	
	public void setTipo(Tipo _tipo) {
		this.tipo = Objects.requireNonNull(_tipo, "tipo es obligatorio");
	}
	public void setMaterial(Material _material) {
		this.material = Objects.requireNonNull(_material, "material es obligatorio");
	}
	public void setTrama(Trama _trama) {
		this.trama = Objects.requireNonNull(_trama, "trama es obligatorio");
	}
	public void setColor_pri(Color color_pri) {
		this.colorPrimario = Objects.requireNonNull(color_pri, "color primario es obligatorio");
	}
	public void setColor_sec(Color color_sec) {
		this.colorSecundario = color_sec;
	}
	public void setTempMaxima(double tempMaxima) {
		this.temperaturaMaxima = Objects.requireNonNull(tempMaxima, "temperatura maxima es obligatorio");
	}
	
	public Prenda crearPrenda() throws Exception {
		if(tipo == null || material == null || colorPrimario == null) {
			throw new Exception("Falta completar valores");
		}
		return new Prenda(tipo,material,trama,colorPrimario,colorSecundario,temperaturaMaxima);
	}
}
