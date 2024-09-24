public class Product {
	public int cod;
	public String name;
	public float price;

	public StockProduct buscarProdutoPorCodigo(int codAux, Stock stock) {
		StockProduct stockProduct = new StockProduct();
		for (StockProduct stockProducts : stock.stockProducts)
			if (stockProducts.product.cod == codAux) {
				stockProduct = stockProducts;
				return stockProduct;
			}
		return stockProduct;
	}
}