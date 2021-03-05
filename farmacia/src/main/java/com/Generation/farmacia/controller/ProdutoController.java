package com.Generation.farmacia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Generation.farmacia.model.Produto;
import com.Generation.farmacia.repository.ProdutoRepository;

@RestController // declara pro mysql que é um controler
@RequestMapping("/produto") // procurar um caminho , vai puxar no postmain
@CrossOrigin("*") // procurar tudo dentro do codigo , caso eu nao tenha definido

public class ProdutoController {

	
	@Autowired // injetar dependecias para que funcione
	private ProdutoRepository repositoryproduto;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(repositoryproduto.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Produto> getById (@PathVariable long id){
		return repositoryproduto.findById(id).map(resp -> ResponseEntity.ok(resp))
		 .orElse(ResponseEntity.notFound().build());
    }
	
    @GetMapping("/produto/{nomeProduto}")
	public ResponseEntity<List<Produto>> getByNomeProduto (@PathVariable String nomeProduto) {
		return ResponseEntity.ok(repositoryproduto.findAllByNomeProdutoContainingIgnoreCase(nomeProduto));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@Valid @RequestBody Produto produto ){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryproduto.save(produto));
	}
	
	@PutMapping //permite alterações no banco de dados 
	@ResponseStatus(HttpStatus.OK) //permitir um ok para o ususario 
	// ReponseEntity; oq o metodo retorno para o usuario
	public ResponseEntity<Produto> Put (@Valid @RequestBody Produto produto){ //paretenseses, oq vai ser convocado
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryproduto.save(produto));
	}
	@DeleteMapping("/{idProduto}")
	public void delete(@PathVariable Long idProduto) {
		repositoryproduto.deleteById(idProduto);
	}
	
}
