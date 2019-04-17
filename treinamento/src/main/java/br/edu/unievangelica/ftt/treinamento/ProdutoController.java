package br.edu.unievangelica.ftt.treinamento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/produto")


public class ProdutoController {
	
	private List<String> produto = new ArrayList <> (Arrays.asList(" Trento","Sonho de valsa"));
	
	@GetMapping
	public List<String> findAll() {
	return produto;
	}
	
	@GetMapping("{index}")
	public String findByIndex(@PathVariable int index) {
		return produto.get(index);
	}
	
	@DeleteMapping("{index}")
	public boolean delete (@PathVariable int index) {
		produto.remove(index);
	return true;
	}
	
	@PostMapping("{nome}")
	public boolean save(@PathVariable String nome) {
		produto.add(nome);
		return true;
	}
	
	@PutMapping("{index}/{nome}")
	public boolean update (@PathVariable int index, @PathVariable String nome) {
		produto.remove(index);
		produto.add(nome);
		return true;
	}

}
