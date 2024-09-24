
public class Main {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		Desenhista desenhista = new Desenhista();
		
		circulo.raio = 10.0;
		quadrado.lado = 10.0;
		triangulo.ladoA = 3.0;
		triangulo.ladoB = 5.0;
		triangulo.ladoC = 3.0;
		
		System.out.println(desenhista.calcular_perimetro(circulo));
		System.out.println(desenhista.calcular_perimetro(quadrado));
		System.out.println(desenhista.calcular_perimetro(triangulo));
		
	}

}
