package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {

	private ProdutoDAO pd;

	public List<ProdutoTO> listar() {
		pd = new ProdutoDAO();
		// REGRAS DE NEGÓCIO
		return pd.select();
	}

	public ProdutoTO listar(int id) {
		pd = new ProdutoDAO();
		// REGRAS DE NEGÓCIO
		return pd.select(id);
	}

	public boolean cadastrar(ProdutoTO pto) {
		pd = new ProdutoDAO();
		// REGRAS DE NEGÓCIO
		return pd.insert(pto);
	}

	public void atualiza(ProdutoTO pto) {
		pd = new ProdutoDAO();
		// REGRAS DE NEGÓCIO
		pd.update(pto);
	}

	public void remover(int id) {
		pd = new ProdutoDAO();
		// REGRAS DE NEGÓCIO
		pd.delete(id);
	}

}
