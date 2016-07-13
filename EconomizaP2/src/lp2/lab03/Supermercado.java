package lp2.lab03;

public class Supermercado {
	public double totalArrecadado;

	private Estoque estoque = new Estoque();

	public Supermercado() {
		totalArrecadado = 0;
	}

	public void cadastro() {
		String nome = EntradaDados.leString("Digite o nome do produto: ");
		double preco = EntradaDados.leDouble("Digite o preço unitário do produto: ");
		String tipo = EntradaDados.leString("Digite o tipo do produto: ");
		int quantidade = EntradaDados.leInteiro("Digite a quantidade a ser cadastrada: ");
		Produtos novoProduto = new Produtos(nome, tipo, preco, quantidade);
		estoque.CadastraProdutos(novoProduto);
		System.out.println("\n" + nome + " cadastrado com sucesso.\n");
	}

	public void vendaProdutos() {
		System.out.println("= = = = Venda de Produtos = = = =");

		String nome = EntradaDados.leString("Digite o nome do produto: ");

		Produtos produto = estoque.getProduto(nome);
		if (produto == null) {
			System.out.println("\n" + nome + " não cadastrado no sistema.\n");
		} else{
			String tipoProduto = produto.getTipo();
			double precoProduto = produto.getPreco();
			String nomeProduto = produto.getNome();
			System.out.printf("==> %s(%s). R$ %.2f\n", nomeProduto, tipoProduto, precoProduto);
			int quantidadeProdutos = EntradaDados.leInteiro("\nDigite a quantidade que deseja vender: ");
			double precoTotal = precoProduto * quantidadeProdutos;
			totalArrecadado += precoProduto;
			System.out.printf("Total arrecadado: R$ %.2f\n", precoTotal);
		}

	}
	
	public void imprimeBalanco(){
		System.out.println("= = = = Impressao de Balanco = = = =");
		Produtos[] produtos = estoque.getlistaProdutos();
		System.out.println("Produtos cadastrados: ");
		double possivelArrecadacao = 0;
		for (int i = 0; i < produtos.length; i++){
			possivelArrecadacao += produtos[i].getPreco() * produtos[i].getQuantidade(); 
			System.out.println((i+1) + ") " + produtos[i].getNome() +
			"(" + produtos[i].getTipo() + "). R$" + 
			String.format("%.2f", produtos[i].getPreco()));
		}
		System.out.println("Total arrecadado em vendas: R$ " + String.format("%.2f", totalArrecadado));
		System.out.println("Total que pode ser arrecadado: R$ " + String.format("%.2f", possivelArrecadacao));
	}
}
