package com.protalento.PracticaSemanal4;

public class Ovni extends Volador {

	private int cantMotores;
	private String color;
	
	
	public Ovni() {
		
	}
		
	
	public Ovni(String nombre, boolean tieneRuedas, int cantMotores, String color) {
		super(nombre, tieneRuedas);
		this.cantMotores = cantMotores;
		this.color = color;
	}




	@Override
	public String toString() {
		return "Ovni [toString()=" + super.toString() + ", cantMotores=" + cantMotores + ", color=" + color + "]";
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
		return "El Ovni " + this.getNombre() + " tiene permiso para aterrizar";
		
	}

	
	
	
	
	
	
}
