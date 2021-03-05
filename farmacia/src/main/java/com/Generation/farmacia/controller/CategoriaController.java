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

import com.Generation.farmacia.model.Categoria;
import com.Generation.farmacia.repository.CategoriaRepository;

@RestController // declara pro mysql que é um controler
@RequestMapping("/categoria") // procurar um caminho , vai puxar no postmain
@CrossOrigin("*") // procurar tudo dentro do codigo , caso eu nao tenha definido

public class CategoriaController {

	@Autowired // injetar dependecias para que funcione
	private CategoriaRepository repositoryCategoria;// "repositorio" eu estou dando um nome ,poderia ser
													// catrgoriaRepository

	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(repositoryCategoria.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Categoria> getById (@PathVariable long id){
		return repositoryCategoria.findById(id).map(resp -> ResponseEntity.ok(resp))
		 .orElse(ResponseEntity.notFound().build());
    }
	@GetMapping("/categoria/{departamento}")
	public ResponseEntity<List<Categoria>> getByDepartamento(@PathVariable String Departamento) {
		return ResponseEntity.ok(repositoryCategoria.findAllByDepartamentoContainingIgnoreCase(Departamento));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@Valid @RequestBody Categoria categoria ){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCategoria.save(categoria));
	}
	@PutMapping //permite alterações no banco de dados 
	@ResponseStatus(HttpStatus.OK) //permitir um ok para o ususario 
	// ReponseEntity; oq o metodo retorno para o usuario
	public ResponseEntity<Categoria> put (@Valid @RequestBody Categoria categoria){ //paretenseses, oq vai ser convocado
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCategoria.save(categoria));
	}
	
	@DeleteMapping("/{idCategoria}")
	public void delete(@PathVariable Long idCategoria) {
		repositoryCategoria.deleteById(idCategoria);
	}
	
}