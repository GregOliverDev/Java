
public class Comissao {
	public Double Calcular(Vendedor vendedor) {
		Double total = 5000.00;
		Double comissao = 0.02;
		
		return vendedor.salario + (total * comissao);
	}
}
