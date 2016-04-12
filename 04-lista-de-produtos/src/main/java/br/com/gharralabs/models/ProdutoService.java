package br.com.gharralabs.models;

import java.util.List;

public interface ProdutoService {
	List<Produto> obterTodos();
	Produto obterPorId(long id);

}
