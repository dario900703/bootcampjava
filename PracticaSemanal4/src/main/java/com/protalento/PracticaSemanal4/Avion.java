package com.protalento.PracticaSemanal4;

public class Avion extends Volador {

	private int cantAsientos;
	private int cantRuedas;
	private int cantMotores;
	private String color;

	public Avion() {

	}
	

	public Avion(String nombre, boolean tieneRuedas, int cantAsientos, int cantRuedas, int cantMotores, String color) {
		super(nombre, tieneRuedas);
		this.cantAsientos = cantAsientos;
		this.cantRuedas = cantRuedas;
		this.cantMotores = cantMotores;
		this.color = color;
	}







	@Override
	public String toString() {
		return "Avion [toString()=" + super.toString() + ", cantAsientos=" + cantAsientos + ", cantRuedas=" + cantRuedas
				+ ", cantMotores=" + cantMotores + ", color=" + color + "]";
	}



	public int getCantAsientos() {
		return cantAsientos;
	}

	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}

	public int getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}

	public int getCantMotores() {
		return cantMotores;
	}

	public void setCantMotores(int cantMotores) {
		this.cantMotores = cantMotores;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String aterrizar() {
		
		return "El/La " + this.getNombre() + " tiene permiso para aterrizar";
		}


	
		
		
	
	
	

}
