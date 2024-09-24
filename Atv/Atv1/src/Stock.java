import java.util.ArrayList;
import java.util.List;

public class Stock {
	public List<StockProduct> stockProducts = new ArrayList<StockProduct>();

	public void adicionarProduto(StockProduct stockProduct) {
		stockProducts.add(stockProduct);
	}
}
