package com.protalento.PracticaAdicionalSemana5;

public class CollectionCustom<T> {
	private T[] variable;

//constructores
	public CollectionCustom() {
		super();
	}

	public CollectionCustom(T[] variable) {
		super();
		this.variable = variable;
	}

//Getter and Setter
	public T[] getVariable() {
		return variable;
	}

	public void setVariable(T[] variable) {
		this.variable = variable;
	}

//metodos
//Add
	public void add(T variable1) {
		for (int i = 0; i < variable.length; i++) {
			if (variable[i] == null) {
				variable[i] = variable1;
				break;
			}
		}
		
	}

//AddFirst
	public void addFirst(T variable1) {
		int cont = 0;
		for (int i = 0; i < variable.length; i++) {
			if (variable[i] == null) {
				cont++;
			}
		}

		if (cont != 0) {
			int cont2 = 0;
			for (int i = variable.length - 1; i >= 0; i--) {
				if (variable[i] == null) {
					cont2 = 1;
				}
				if (cont2 == 1) {
					if (variable[i] != null) {
						variable[i + 1] = variable[i];
					} else {
					}
				}
			}
			variable[0] = variable1;
		} else {
			System.out.println("no se puede agregar" + variable1 + "porque no hay mas espacio en la coleccion");
		}
	}

//AddLast
	public void addLast(T variable1) {
		int cont = 0;
		for (int i = variable.length - 1; i >= 0; i--) {
			if (variable[i] == null) {
				cont++;
			}
		}
		if (cont != 0) {
			int cont2 = 0;
			for (int i = 0; i < variable.length - 1; i++) {
				if (variable[i] == null) {
					cont2 = 1;
				}
				if (cont2 == 1) {
					if (variable[i + 1] != null) {
						variable[i] = variable[i + 1];
					} else {
					}
				}
			}
			variable[variable.length - 1] = variable1;
		} else {
			System.out.println("no se puede agregar" + variable1 + "porque no hay mas espacio en la coleccion");
		}
	}

//Size
	public int size() {
		int cont=variable.length;
					
		return cont;
		
	}

//Remove
	public T remove(T variable1) {

		for (int i = 0; i < variable.length; i++) {
			if (variable[i] == variable1) {
				variable[i] = null;
				break;
			}
		}
		return variable1;
	}

//RemoveAll
	public void removeAll(T variable1) {

		for (int i = 0; i < variable.length; i++) {
			if (variable[i] != null) {
				variable[i] = null;
			}
		}

	}

//Empty
	public boolean empty() {
		boolean vacio = true;
		for (int i = 0; i < variable.length; i++) {
			if(variable[i] != null) {
				vacio = false;
				break;
			}
			else {
				vacio = true;
			}
		}
		return vacio;
	}
	
	
	
}

