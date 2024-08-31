package entities;

import java.util.UUID;

public class Produto {

	private UUID id;
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
			//sobrecarga de métodos construtores
	public Produto(UUID id, String nome, Double preco, Integer quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
