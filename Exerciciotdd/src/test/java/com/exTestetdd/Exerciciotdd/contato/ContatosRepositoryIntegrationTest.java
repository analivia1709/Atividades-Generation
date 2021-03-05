package com.exTestetdd.Exerciciotdd.contato;

import javax.validation.ConstraintViolationException;
import org.aspectj.lang.annotation.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.exTestetdd.Exerciciotdd.model.ContatoModel;
import com.exTestetdd.Exerciciotdd.repository.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest //melhor testador de JPA
	public class ContatosRepositoryIntegrationTest {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before(value = "")
	public void start() {
		ContatoModel contato = new ContatoModel("Gabriel", "011y", "9xxxxxxx9");
	}
	
	//regra, não aceita exceções, é a maneira de especificar
	//que a execução de um teste lançará uma exceção
	//Verifica se o @NotEmpty está funcionando
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	
	@Test
	public void salvarComTelNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O Telefone deve ser preenchido");
		
		ContatoModel contato = null;
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
	
	@Test
	public void salvarComDddNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O DDD deve ser preenchido");
		
		ContatoModel contato = null;
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
	
	@Test
	public void salvarComNomeNulo() throws Exception {
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("O Nome deve ser preenchido");
		
		ContatoModel contato = null;
		contato.setNome(null);
		contatoRepository.save(contato);
	}
}
		