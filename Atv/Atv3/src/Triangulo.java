
public class Triangulo implements IFigura{
	public Double ladoA = 0.0;
	public Double ladoB = 0.0;
	public Double ladoC = 0.0;
	
	@Override
	public Double getPerimetro() {
	
		return (this.ladoA + this.ladoB + this.ladoC);
	}
}
