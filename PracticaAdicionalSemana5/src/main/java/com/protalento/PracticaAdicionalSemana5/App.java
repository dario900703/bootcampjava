package com.protalento.PracticaAdicionalSemana5;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		
		String[] coleccion1 = new String[6];
		CollectionCustom<String> coleccion = new CollectionCustom<String>(coleccion1);
		
		
		coleccion.add("Perro");
		coleccion.add("gato");
		coleccion.add("caballo");
		  //coleccion.add("loro");
		//coleccion.addLast("paloma");
		//coleccion.addLast("elefante");
		//coleccion.remove("Perro");
		//coleccion.addLast("tortuga");
		coleccion.removeAll(null);
		coleccion.size();
		System.out.println(coleccion.empty());
		
		for (int i = 0; i < coleccion1.length; i++) {
			System.out.println(coleccion.getVariable()[i]);
			
			
		}
		
		
	
		
		
		
		
		
		
		

	}
}
