package org.home.entity;

import java.io.Serializable;

public class UsuarioModelVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String XD;
	private String XDD;

	public String getXD() {
		return XD;
	}

	public void setXD(String xD) {
		XD = xD;
	}

	public String getXDD() {
		return XDD;
	}

	public void setXDD(String xDD) {
		XDD = xDD;
	}

	@Override
	public String toString() {
		return "UsuarioModelVO [XD=" + XD + ", XDD=" + XDD + "]";
	}

}
