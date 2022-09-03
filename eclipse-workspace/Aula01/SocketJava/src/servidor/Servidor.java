package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException { 
		
		try {
			ServerSocket servidor = new ServerSocket(6790);
			System.out.println("Nova conexão com o cliente ");
			
			Socket cliente = servidor.accept();
			System.out.println("Nova conexao com o servidor "+ cliente.getInetAddress().getHostAddress());
			
			Scanner s = new Scanner (cliente.getInputStream());
			
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			s.close();
			servidor.close();
			cliente.close();
		} 
		catch(Exception e){
			System.out.println("Falha na criacao do socket");
		}
		
		
	}
}
