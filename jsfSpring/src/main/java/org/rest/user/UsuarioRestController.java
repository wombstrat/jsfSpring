package org.rest.user;

import java.util.List;

import org.home.bs.UserBs;
import org.home.entity.UsuarioModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {

	private UserBs userBs;

	@RequestMapping(value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UsuarioModel> regresarInformacionUsuario() {
		return userBs.getAplicaciones();
	}

	@RequestMapping(value = "/XD")
	public String xD() {
		return "XD";
	}

	public UserBs getUserBs() {
		return userBs;
	}

	public void setUserBs(UserBs userBs) {
		this.userBs = userBs;
	}

}
