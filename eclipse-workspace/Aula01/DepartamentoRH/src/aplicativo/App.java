package aplicativo;

import java.util.Date;

import colaboradores.Pessoa;

public class App {

	public static void main(String[] args) {
		Date dataNasce01 = new Date(122,06,29);
		Date dataNasce02 = new Date(070,10,12);
		Pessoa pessoa01 = new Pessoa("Alexandre", "M", "1098478", dataNasce01);
		Pessoa pessoa02 = new Pessoa("JoJo", "M", dataNasce02);
		System.out.println("Dados da pessoa: "+pessoa01);
		System.out.println("Dados da pessoa: "+pessoa02);
				
	}

}
