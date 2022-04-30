package com.protalento.PracticaSemanal4;

import com.protalento.interfaces.Aterrizable;

public abstract class  Volador implements Aterrizable {
	private String nombre;
	private boolean tieneRuedas;
	
	
	public Volador() {
		
	}

	public Volador(String nombre, boolean tieneRuedas) {
		super();
		this.nombre = nombre;
		this.tieneRuedas = tieneRuedas;
	}

	@Override
	public String toString() {
		return "Volador [nombre=" + nombre + ", tieneRuedas=" + tieneRuedas + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTieneRuedas() {
		return tieneRuedas;
	}

	public void setTieneRuedas(boolean tieneRuedas) {
		this.tieneRuedas = tieneRuedas;
	}

	
	
	
	
	
	

}
