package com.protalento.PracticaSemanal4;

public class Helicoptero extends Volador {
	private String color;
	private String modelo;
	private String marca;
	private int cantRuedas;
	
	public Helicoptero() {
		
	}
	
		
	public Helicoptero(String nombre, boolean tieneRuedas, String color, String modelo, String marca, int cantRuedas) {
		super(nombre, tieneRuedas);
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.cantRuedas = cantRuedas;
	}


	@Override
	public String toString() {
		return "Helicoptero [toString()=" + super.toString() + ", color=" + color + ", modelo=" + modelo + ", marca="
				+ marca + ", cantRuedas=" + cantRuedas + "]";
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}


	@Override
	public String aterrizar() {
		
		return "El helicóptero " + this.getNombre() + " tiene permiso para aterrizar";
	}


	
	


	
	
}
