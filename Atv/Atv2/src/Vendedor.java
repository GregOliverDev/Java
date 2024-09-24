
public class Vendedor extends Pessoa {
	public String departamento = "";
	public int matricula = 0;
	public Double salario = 0.00;

	@Override
	public void Salvar() {
		super.Salvar();
		System.out.println("Save this vendedor");
	}
	
}
