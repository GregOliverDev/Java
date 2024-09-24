import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int controle, prodCod = 0, vendCod = 0;
		List<Product> products = new ArrayList<Product>();
		MenagerVend menagerVend = new MenagerVend();
		Stock stocks = new Stock();

		do {
			System.out.println("\nMenu ");
			System.out.println("1 - Cadastro Produto");
			System.out.println("2 - Registrar Venda");
			System.out.println("3 - Imprimir Venda");
			System.out.println("4 - Sair");

			controle = Console.readInt("Sua Escolha: ");

			System.out.println("\n");
			switch (controle) {
			case 1:
				prodCod++;
				Product product = new Product();
				product.cod = prodCod;
				product.name = Console.readString("Digite o nome do produto: ");
				product.price = Console.readFloat("Digite o valor do produto: ");

				products.add(product);

				StockProduct stockProducts = new StockProduct();
				
				stockProducts.product = product;
				stockProducts.quantStock = Console.readInt("Quantidade atual do estoque: ");				
				
				stocks.adicionarProduto(stockProducts);
				
				System.out.println("Produto " + product.cod + " cadastrado com Sucesso");
				break;
			case 2:
				vendCod++;
				Vend vend = new Vend();
				vend.cod = vendCod;
				int control = 0;

				QuantVend quantVend = new QuantVend();
				do {
						control = 0;
						Product productAux = new Product();
						StockProduct stockProduct = new StockProduct();
						stockProduct = productAux
								.buscarProdutoPorCodigo(Console.readInt("Digite o codigo do produto: "), stocks);

						if (stockProduct.product.cod != 0) {
							quantVend.product = stockProduct.product;
							int quantAux = Console.readInt("Digite a quantidade comprada: ");
							if (quantAux <= stockProduct.quantStock) {
								quantVend.quant = quantAux;
								vend.adicionarProdutoVendido(quantVend);
								System.out.println("Deseja adicionar mais produtos? (1 - Sim / 0 - Não)");
								control = Console.readInt("Sua Escolha: ");
								if (control == 0) {
									menagerVend.registrarVenda(vend);
									System.out.println("Venda "+vend.cod+" registrada com sucesso!");
								}
							} else {
								System.out.println("Quantidade maior que o estoque disponivel!");
								control = 1;
							}
						} else {
							System.out.println("Produto não encontrado");
							control = 1;
						}
				} while (control != 0 );

				break;
			case 3:
				Vend vendFind = new Vend();
				vendFind = menagerVend.buscarVendaPeloCod(Console.readInt("Digite o numero da venda: "));

				vendFind.imprimirDetalhesVenda();

				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}

		} while (controle != 4);
	}
}