package org.home.bs;

import java.io.Serializable;
import java.util.List;

import org.home.dao.UsuarioDao;
import org.home.entity.UsuarioModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserBs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UsuarioDao usuarioDao;

	public List<UsuarioModel> getAplicaciones() {
		return getUsuarioDao().getAll();
	}

	public void save(UsuarioModel usuarioModel) {
		getUsuarioDao().save(usuarioModel);
	}

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

}
