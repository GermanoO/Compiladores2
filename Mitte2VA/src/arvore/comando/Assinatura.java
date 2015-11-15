package arvore.comando;

import arvore.Tipo;

public class Assinatura implements Comando{

	private String nomeFunc;
	private ParametrosFormais parametrosFormais;
	private Tipo tipo;

	/**
	 * Construtor para Assinatura com tipo. 
	 */
	public Assinatura(String nomeFunc, ParametrosFormais parametrosFormais, Tipo tipo) {
		super();
		this.nomeFunc = nomeFunc;
		this.parametrosFormais = parametrosFormais;
		this.tipo = tipo;
	}

	/**
	 * Construtor para assinatura sem tipo. 
	 */
	public Assinatura(String nomeFunc, ParametrosFormais parametrosFormais) {
		super();
		this.nomeFunc = nomeFunc;
		this.parametrosFormais = parametrosFormais;
	}
}
