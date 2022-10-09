package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {

	private static List<ProdutoTO> listaDeProdutos;

	public ProdutoDAO() {
		if (listaDeProdutos == null) {
			listaDeProdutos = new ArrayList<ProdutoTO>();

			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setTitulo("Chinelo");
			pto.setPreco(32.78);
			pto.setQuantidade(45);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setTitulo("Celular");
			pto.setPreco(2.987);
			pto.setQuantidade(100);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setTitulo("Garrafa Plástica");
			pto.setPreco(1.98);
			pto.setQuantidade(1000);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setTitulo("Pincel");
			pto.setPreco(10.78);
			pto.setQuantidade(20);
			listaDeProdutos.add(pto);

			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setTitulo("Pacote de Sulfite");
			pto.setPreco(25.49);
			pto.setQuantidade(300);
			listaDeProdutos.add(pto);

		}
	}

	// SELECT ALL
	public List<ProdutoTO> select() {
		return listaDeProdutos;
	}

	// SELECT BY_ID
	public ProdutoTO select(int id) {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			if (listaDeProdutos.get(i).getCodigo() == id) {
				return listaDeProdutos.get(i);
			}
		}
		return null;
	}

	// INSERT
	public boolean insert(ProdutoTO pto) {
		pto.setCodigo(listaDeProdutos.size() + 1);
		return listaDeProdutos.add(pto);
	}

	// UPDATE
	public void update(ProdutoTO pto) {
		ProdutoTO p = select(pto.getCodigo());
		p.setPreco(pto.getPreco());
		p.setQuantidade(pto.getQuantidade());
		p.setTitulo(pto.getTitulo());
	}
	
	//DELETE
	public void delete(int id) {
		listaDeProdutos.remove(select(id));
	}

}
