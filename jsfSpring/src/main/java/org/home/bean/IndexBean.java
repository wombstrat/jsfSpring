package org.home.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.home.bs.UserBs;

@ViewScoped
@ManagedBean
public class IndexBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{userBs}")
	private UserBs userBs;

	public void init() {
		System.out.println("XD");
		System.out.println(userBs.getAplicaciones());
	}

	public UserBs getUserBs() {
		return userBs;
	}

	public void setUserBs(UserBs userBs) {
		this.userBs = userBs;
	}

}
