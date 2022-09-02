package seres;

public class Mamiferos 
{
	public boolean sangueQuente, vive;
	public Mamiferos()
	{
		sangueQuente = true;
		vive = true;
		System.out.println("Vivendo!");
	}
	
	public String toString() {
		String retorno = "";
		
		retorno = "sangue: "+ this.sangueQuente+" |vive: "+this.vive;
		
		return retorno;
	}
	public void movimento(int x, int y, int z)
	{
		System.out.println("Procurando comida em: " + "\nx: " + x + "\ny: " + y + "\nz: "+ z);
	}
}