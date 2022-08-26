package exercicios;

public class IMC {

	public static void main(String[] args) {
		
		double result, alturaM = 1.50f, alturaF = 1.50f;
		System.out.println("-------------------------------");
		System.out.println("IMC Homens");
		System.out.println("-------------------------------");
		do {
			alturaM = alturaM +0.01f;
			result = ((72*alturaM)-58);
			System.out.println(result);
		} while (alturaM<=2.00f);
		
		System.out.println("-------------------------------");
		System.out.println("IMC Mulheres");
		System.out.println("-------------------------------");
		do {
			alturaF = alturaF +0.01f;
			result = ((62.1f*alturaF)-43.7f);
			System.out.println(result);
		} while (alturaF<=2.00f);
	}

}
