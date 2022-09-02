package aplicativo;

import seres.Mamiferos;

public class App {

	public static void main (String [] args)
	{
		Mamiferos exp;
		Mamiferos rato;
		Mamiferos gato;
		
		exp = new Mamiferos();
		rato = new Mamiferos();
		gato = new Mamiferos();
		
		exp.movimento(1,2,4);
		
		System.out.println("Sangue Quente: " + exp.sangueQuente);
				
		rato = gato;
		
		if(rato == gato) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		System.out.println("Endereço de rato: "+rato);
		System.out.println("Endereço de gato: "+gato);
		System.out.println("Endereço de exp: "+exp);
	}

}
