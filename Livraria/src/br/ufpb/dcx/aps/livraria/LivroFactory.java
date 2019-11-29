package br.ufpb.dcx.aps.livraria;

public class LivroFactory {
	public Livraria gerarLivro(String livro) {
		if(livro == "" || livro == null) {
			return null;
		}
		if(livro.toLowerCase().equals("livro")) {
			return new Livro();
		}
		return null;
		
	}
}
