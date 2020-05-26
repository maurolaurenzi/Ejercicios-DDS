package quemepongo;

public class BorradorAtuendo extends Exception{
	private Prenda parteSuperior;
	private Prenda parteInferior;
	private Prenda calzado;
	private Prenda accesorio;
	
	public void setParteSuperior(Prenda _parteSuperior) {
		//this.verificarCondicionesClimaticas(_parteSuperior);
		this.parteSuperior = parteSuperior;
	}
	public void setParteInferior(Prenda _parteInferior) {
		//this.verificarCondicionesClimaticas(_parteInferior);
		this.parteInferior = parteInferior;
	}
	public void setCalzado(Prenda _calzado) {
		//this.verificarCondicionesClimaticas(_calzado);
		this.calzado = calzado;
	}
	public void setAccesorio(Prenda _accesorio) {
		//this.verificarCondicionesClimaticas(_accesorio);
		this.accesorio = accesorio;
	}
	
	public Atuendo crearAtuendo() {
		return new Atuendo(parteSuperior,parteInferior,calzado,accesorio);
	}
	
	/*public void verificarCondicionesClimaticas(Prenda _prenda) {
		if(_prenda.getTemperaturaMaxima() > 
		(new ServicioClimatico().getWeather("Buenos Aires")){
			throw PrendaNoAptaParaClimaException("La prenda no es apta para el clima actual");
		}
	}
	*/
}
