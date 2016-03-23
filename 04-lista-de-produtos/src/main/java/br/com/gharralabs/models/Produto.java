package br.com.gharralabs.models;

public class Produto {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Number getPreco() {
		return preco;
	}
	public void setPreco(Number preco) {
		this.preco = preco;
	}
	private long id;
	private String nome;
	private Number preco;

}
