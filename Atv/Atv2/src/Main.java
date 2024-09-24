
public class Main {

	public static void main(String[] args) {
		Vendedor vendedor  = new Vendedor();
		
		vendedor.cpf = "888";
		vendedor.Salvar();
		vendedor.salario = 12000.00;
		
		Comissao comissao = new Comissao();
		comissao.Calcular(vendedor);		
	}
}
