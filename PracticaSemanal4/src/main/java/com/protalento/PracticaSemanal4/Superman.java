package com.protalento.PracticaSemanal4;

public class Superman extends Volador{
private boolean usaAnteojos = true;

public Superman() {

}


public Superman(String nombre, boolean tieneRuedas, boolean usaAnteojos) {
	super(nombre, tieneRuedas);
	this.usaAnteojos = usaAnteojos;
}



@Override
public String toString() {
	return "Superman [toString()=" + super.toString() + ", usaAnteojos=" + usaAnteojos + "]";
}

public boolean isUsaAnteojos() {
	return usaAnteojos;
}

public void setUsaAnteojos(boolean usaAnteojos) {
	this.usaAnteojos = usaAnteojos;
}


@Override
public String aterrizar() {
	return "Superman " + this.getNombre() + " tiene permiso para aterrizar";
	
}




}
