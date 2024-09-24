
public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Motorista motora = new Motorista();
		
		Motocicleta motocicleta = new Motocicleta();

		System.out.println("**Carro** \n");
		motora.ligar(carro);
		System.out.println(carro.motor);
		motora.desligar(carro);
		System.out.println(carro.motor);
		motora.acelerar(carro, 100.0);
		System.out.println(carro.velocidade);
		motora.frear(carro, 0.25);
		System.out.println(carro.velocidade);
		
		System.out.println("\n**Moto** \n");
		motora.ligar(motocicleta);
		System.out.println(motocicleta.motor);
		motora.desligar(motocicleta);
		System.out.println(motocicleta.motor);
		motora.acelerar(motocicleta, 150.0);
		System.out.println(motocicleta.velocidade);
		motora.frear(motocicleta, 0.50);
		System.out.println(motocicleta.velocidade);
		

	}
}
