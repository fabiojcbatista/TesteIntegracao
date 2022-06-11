package br.com.alura.leilao.dao;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.model.Usuario;
import br.com.alura.leilao.util.JPAUtil;

class UsuarioDaoTest {

	private UsuarioDao dao;
	private EntityManager em;
	
	@Test
	void testeBuscaDEUsuarioPeloUsername() {
		EntityManager em = JPAUtil.getEntityManager();
		this.dao = new UsuarioDao(em);
		Usuario usuario = this.dao.buscarPorUsername("fulano");
		Assert.assertNotNull(usuario);
	}

}
