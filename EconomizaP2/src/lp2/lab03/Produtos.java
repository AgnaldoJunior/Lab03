package lp2.lab03;

public class Produtos {
	private String nome;
	private String tipo;
	private double preco;
	private int quantidade;

	public Produtos(String nome_produto, String tipo_produto, double preco_produto, int quantidade_produto) {
		nome = nome_produto;
		tipo = tipo_produto;
		preco = preco_produto;
		quantidade = quantidade_produto;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade(){
		return quantidade;
	}

}