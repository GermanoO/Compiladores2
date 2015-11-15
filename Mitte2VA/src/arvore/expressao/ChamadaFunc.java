package arvore.expressao;

import java.util.List;

public class ChamadaFunc implements Expressao {
	private String nomeFuncao;
	private List<Expressao> listaExprs;
	
	
	public ChamadaFunc(String nomeFuncao, List<Expressao> listaExprs) {
		super();
		this.nomeFuncao = nomeFuncao;
		this.listaExprs = listaExprs;
	}

	
}
