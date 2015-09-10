package org.home.dao;

import java.io.Serializable;
import java.util.List;

import org.home.entity.UsuarioModel;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDao extends HibernateDaoSupport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<UsuarioModel> getAll() {
		return getHibernateTemplate().loadAll(UsuarioModel.class);
	}

	public void save(UsuarioModel usuarioModel) {
		getHibernateTemplate().save(usuarioModel);
	}

}
