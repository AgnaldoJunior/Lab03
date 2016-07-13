package lp2.lab03;

public class Estoque {
	private int proxPosicao;

	Produtos[] estoque;

	private void duplicaArray() {
		Produtos[] novaArray = new Produtos[2 * estoque.length];
		System.arraycopy(estoque, 0, novaArray, 0, estoque.length);
		estoque = novaArray;

	}

	public void CadastraProdutos(Produtos produto) {
		estoque[proxPosicao] = produto;
		proxPosicao++;
		if (proxPosicao >= estoque.length) {
			duplicaArray();
		}
	}

	public Estoque() {
		estoque = new Produtos[10];
		proxPosicao = 0;
	}

	public Produtos getProduto(String nome) {
		for (int i = 0; i < proxPosicao; i++) {
			if (estoque[i].getNome().equalsIgnoreCase(nome)) {
				return estoque[i];
			}
		}
		return null;
	}

	public Produtos[] getlistaProdutos() {
		Produtos[] listaProdutos = new Produtos[proxPosicao];
		for (int i = 0; i < proxPosicao; i++) {
			listaProdutos[i] = estoque[i];
		}
		return listaProdutos;
	}
}
