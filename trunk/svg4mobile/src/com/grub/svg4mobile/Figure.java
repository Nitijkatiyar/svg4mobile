package com.grub.svg4mobile;

public abstract class Figure {
	
	private String id = "";
	private String transform = "";
	
	/**
	 * Inicializa el valor del identificador.
	 * @param id
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 * M�todo que obtiene la cadena con que se identifica
	 * a la figura dentro del svg.
	 * @return
	 */
	public String getId(){
		return id;
	}
	
	/**
	 * Actualizar la transformada que ha de aplicarse a la figura.
	 * @param transform Cadena con la transformada.
	 */
	public void setTransform(String transform){
		this.transform = transform;
	}
	
	/**
	 * M�todo que accede al valor de la transformada.
	 * @return Devuelve cadena vac�a si no hay que aplicar ninguna.
	 */
	public String getTransform(){
		return this.transform;
	}

}
