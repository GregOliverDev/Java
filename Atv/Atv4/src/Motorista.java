
public class Motorista {
	public void ligar(iVeiculo veiculo) {
		veiculo.ligar();
	}
	public void desligar(iVeiculo veiculo) {
		veiculo.desligar();
	}
	public void acelerar(iVeiculo veiculo, Double valorAcelercao) {
		veiculo.acelerar(valorAcelercao);
	}
	public void frear(iVeiculo veiculo, Double valorPercentual) {
		veiculo.frear(valorPercentual);
	}
}