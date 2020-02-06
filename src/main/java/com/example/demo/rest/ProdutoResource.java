package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProdutoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/produto")
public class ProdutoResource {
	
	@GetMapping("/listar")
	public ResponseEntity<?> obterListaProdutos() {
		
		ProdutoService produtoService = new ProdutoService();
		
		String fonteDados = produtoService.retornaFonteDados();
		
		return ResponseEntity.ok().body(fonteDados);
	}

}
