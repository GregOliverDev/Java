
public class Quadrado implements IFigura{
	public Double lado = 0.0;

	@Override
	public Double getPerimetro() {

		return (4 * this.lado);
	}
}
