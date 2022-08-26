package exercicios;

public class IMC {

	public static void main(String[] args) {
		
		double result, alturaM = 1.50, alturaF = 1.50;
		System.out.println("-------------------------------");
		System.out.println("IMC Homens");
		System.out.println("-------------------------------");
		do {
			alturaM = alturaM +0.01;
			result = ((72*alturaM)-58);
			System.out.println(result);
		} while (alturaM<=2.00);
		
		System.out.println("-------------------------------");
		System.out.println("IMC Mulheres");
		System.out.println("-------------------------------");
		do {
			alturaF = alturaF +0.01;
			result = ((62.1*alturaF)-43.7);
			System.out.println(result);
		} while (alturaF<=2.00);
	}

}
