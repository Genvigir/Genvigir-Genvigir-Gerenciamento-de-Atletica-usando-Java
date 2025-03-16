//Lucas Carvalho Batista Canhadas Genvigir

import java.util.List;
import java.util.ArrayList;

public class Principal{
	
	//Método Singleton
	private static Menu menu = Menu.getInstance();

	public static void main(String arg[]) {
		
		menu.geraMenu();		

	} //fecha main

} //fim da classe