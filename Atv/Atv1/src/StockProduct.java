public class StockProduct {
	public Product product;
	public int quantStock;
	
	public float calcularValorTotal() {
		float value;
		value = product.price * quantStock;
		
		return value;
	}
}
