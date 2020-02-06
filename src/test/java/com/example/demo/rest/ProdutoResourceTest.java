package com.example.demo.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.ProdutoService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProdutoResourceTest {
	
	@Autowired
	private ProdutoService produtoService;

	@Test
	final void testObterListaProdutos() {
		assertThat(produtoService.retornaFonteDados()).isEqualTo("[\r\n" + 
				"\r\n" + 
				"  {\r\n" + 
				"\r\n" + 
				"    \"productName\": \"Gubee Integrador\",\r\n" + 
				"\r\n" + 
				"    \"description\": \"Ferramenta de integração para marketplaces\",\r\n" + 
				"\r\n" + 
				"    \"targetMarket\": [\r\n" + 
				"\r\n" + 
				"      \"Ecommerce\",\r\n" + 
				"\r\n" + 
				"      \"ERP\",\r\n" + 
				"\r\n" + 
				"      \"Lojista que não desejam possuir ecommerce\"\r\n" + 
				"\r\n" + 
				"    ],\r\n" + 
				"\r\n" + 
				"    \"stack\": [\r\n" + 
				"\r\n" + 
				"      \"Java 10\",\r\n" + 
				"\r\n" + 
				"      \"Kotlin\",\r\n" + 
				"\r\n" + 
				"      \"Kafka\",\r\n" + 
				"\r\n" + 
				"      \"Event Stream\",\r\n" + 
				"\r\n" + 
				"      \"Redis\",\r\n" + 
				"\r\n" + 
				"      \"MongoDB\"\r\n" + 
				"\r\n" + 
				"    ]\r\n" + 
				"\r\n" + 
				"  },\r\n" + 
				"\r\n" + 
				"  {\r\n" + 
				"\r\n" + 
				"    \"productName\": \"Gubee Fretes\",\r\n" + 
				"\r\n" + 
				"    \"description\": \"Ferramenta para gestão e calculo de fretes\",\r\n" + 
				"\r\n" + 
				"    \"targetMarket\": [\r\n" + 
				"\r\n" + 
				"      \"Ecommerce\",\r\n" + 
				"\r\n" + 
				"      \"ERP\",\r\n" + 
				"\r\n" + 
				"      \"Loja fisica\"\r\n" + 
				"\r\n" + 
				"    ],\r\n" + 
				"\r\n" + 
				"    \"stack\": [\r\n" + 
				"\r\n" + 
				"      \"NodeJS\",\r\n" + 
				"\r\n" + 
				"      \"MongoDB\"\r\n" + 
				"\r\n" + 
				"    ]\r\n" + 
				"\r\n" + 
				"  },\r\n" + 
				"\r\n" + 
				"  {\r\n" + 
				"\r\n" + 
				"    \"productName\": \"Gubee Fretes\",\r\n" + 
				"\r\n" + 
				"    \"description\": \"Ferramenta para gestão e calculo de fretes\",\r\n" + 
				"\r\n" + 
				"    \"targetMarket\": [\r\n" + 
				"\r\n" + 
				"      \"Ecommerce\",\r\n" + 
				"\r\n" + 
				"      \"ERP\",\r\n" + 
				"\r\n" + 
				"      \"Loja fisica\"\r\n" + 
				"\r\n" + 
				"    ],\r\n" + 
				"\r\n" + 
				"    \"stack\": [\r\n" + 
				"\r\n" + 
				"      \"NodeJS\",\r\n" + 
				"\r\n" + 
				"      \"MongoDB\"\r\n" + 
				"\r\n" + 
				"    ]\r\n" + 
				"\r\n" + 
				"  },\r\n" + 
				"\r\n" + 
				"  {\r\n" + 
				"\r\n" + 
				"    \"productName\": \"Gubee AntiFraude\",\r\n" + 
				"\r\n" + 
				"    \"description\": \"Ferramenta especialistas em detecção e prevenção à fraude\",\r\n" + 
				"\r\n" + 
				"    \"targetMarket\": [\r\n" + 
				"\r\n" + 
				"      \"Ecommerce\",\r\n" + 
				"\r\n" + 
				"      \"Telecom\",\r\n" + 
				"\r\n" + 
				"      \"Venda direta\",\r\n" + 
				"\r\n" + 
				"      \"Mobile First\",\r\n" + 
				"\r\n" + 
				"      \"Digital Onboarding\"\r\n" + 
				"\r\n" + 
				"    ],\r\n" + 
				"\r\n" + 
				"    \"stack\": [\r\n" + 
				"\r\n" + 
				"      \"Big Data Analytics\",\r\n" + 
				"\r\n" + 
				"      \"Hadoop\",\r\n" + 
				"\r\n" + 
				"      \"Kafka\",\r\n" + 
				"\r\n" + 
				"      \"Pig\",\r\n" + 
				"\r\n" + 
				"      \"Cassandra\"\r\n" + 
				"\r\n" + 
				"    ]\r\n" + 
				"\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"]");
	}

}
