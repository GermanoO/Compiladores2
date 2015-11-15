package arvore.comando;

import arvore.Tipo;

public class ParametrosFormais implements Comando{

	//duvida na recusrsão, o cup vai instanciar varios objetos ou isso precisa ser um array??
	private String ident;
	private Tipo tipo;
	
	public ParametrosFormais(String ident, Tipo tipo) {
		super();
		this.ident = ident;
		this.tipo = tipo;
	}
		
}
