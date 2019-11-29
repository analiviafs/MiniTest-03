package br.ufpb.dcx.aps.livraria;

public class RunFactoryMethod {

	public static void main(String[] args) {
		LivroFactory tipoLivro = new LivroFactory();
		
		Livraria meuObjeto = tipoLivro.gerarLivro("livro");
		meuObjeto.adicionarLivro();
	}

}
