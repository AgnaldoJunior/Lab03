package lp2.lab03;

public class EconomizaP2 {
	public static void main(String[] args) {

		Supermercado mercado = new Supermercado();

		System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = =");
		int opcao = 0;
		do {
			System.out.println("\nDigite a opção desejada: \n");
			System.out.println("1 - Cadastrar um Produto");
			System.out.println("2 - Vender um Produto");
			System.out.println("3 - Imprimir Balanço");
			System.out.println("4 - Sair\n");
			opcao = EntradaDados.leInteiro("Opção: ");

			switch (opcao) {

			case 1:
				String escolha = "";
				do {
					mercado.cadastro();
					escolha = EntradaDados.leString("Deseja cadastrar outro produto? ");
				} while (escolha.equals("Sim"));
				break;

			case 2:
				String continuar = "";
				do {
					mercado.vendaProdutos();
					continuar = EntradaDados.leString("\nDeseja vender outro produto? ");
				} while (continuar.equalsIgnoreCase("Sim"));
				break;

			case 3:
				mercado.imprimeBalanco();
				break;

			case 4:
				break;

			default:
				System.out.println("\nOperação Inválida. Tente novamente. \n");

			}
		} while (opcao != 4);
	}

}
