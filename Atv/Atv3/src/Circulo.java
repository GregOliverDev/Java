
public class Circulo implements IFigura {
	public Double raio = 0.0;

	@Override
	public Double getPerimetro() {
		return (2 * this.raio * 3.14);
	}

}
