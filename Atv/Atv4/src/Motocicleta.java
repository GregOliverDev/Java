
public class Motocicleta implements iVeiculo {
	public String motor = "";
	public Double velocidade = 0.0;

	@Override
	public void acelerar(Double valorAceleracao) {
		this.velocidade += valorAceleracao;
	}

	@Override
	public void frear(Double valorPercentual) {
		this.velocidade -= (this.velocidade * valorPercentual);
	}

	@Override
	public void ligar() {
		this.motor = "Ligado";
	}

	@Override
	public void desligar() {
		this.motor = "Desligado";
	}
}
