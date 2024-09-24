import java.util.ArrayList;
import java.util.List;

public class Vend {
	public int cod;
	public List<QuantVend> quantVends = new ArrayList<QuantVend>();

	public float calcularValorTotalVenda() {
		float result = 0;

		for (QuantVend quantVend : quantVends) {
			result = result + (quantVend.product.price * quantVend.quant);
		}

		return result;
	}

	public void adicionarProdutoVendido(QuantVend quantVend) {
		quantVends.add(quantVend);
	}

	public void imprimirDetalhesVenda() {
		System.out.println("Número da venda: " + cod);
		for (QuantVend quantVend : quantVends) {
			System.out.println("Produto: "+quantVend.product.name + " Valor: " + (quantVend.product.price * quantVend.quant));
		}
		System.out.println("Valor total: " + calcularValorTotalVenda());
	}
}
