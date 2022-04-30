package com.protalento.PracticaSemanal4;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Helicoptero volador1 = new Helicoptero("Apache", true, "negro", "2018", "Boeing", 3);
		Superman volador2 = new Superman("Clark Kent", false, true);
		Superman volador3 = new Superman("Kal-El", false, false);
		Ovni volador4 = new Ovni("Pleyadiano", false, 3, "Plateado");
		Avion volador5 = new Avion("Avioneta Piper", true, 2, 3, 1, "rojo");
		Avion volador6 = new Avion("Avion Fokker", true, 56, 6, 2, "rojo");
		

		Volador[] voladores = { volador1, volador2, volador3, volador4, volador5, volador6 };
		
		
	for(int i = 0;i<voladores.length;i++){
		Volador volador = voladores[i];

		if (volador.isTieneRuedas() == true) {
			System.out.println(volador.aterrizar());
		} else {
			System.err.println(volador.getNombre() + " " + "NO tiene permiso para aterrizar en la pista");
		}

	}

}}
