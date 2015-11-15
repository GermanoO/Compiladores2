package arvore.comando;

import java.util.List;

import arvore.expressao.ChamadaFunc;
import arvore.expressao.Expressao;

public class ChamadaFuncCmd implements Comando {
	private String nomeFuncao;
	private List<Expressao> listaExprs;
	
	//alvez seja assim
	private ChamadaFunc chamadaFuncao;

	//Construtor Antigo
	public ChamadaFuncCmd(String nomeFuncao, List<Expressao> listaExprs) {
		super();
		this.nomeFuncao = nomeFuncao;
		this.listaExprs = listaExprs;
	}

	//Construtor Novo
	public ChamadaFuncCmd(ChamadaFunc chamadaFuncao) {
		super();
		this.chamadaFuncao = chamadaFuncao;
	}

	
	
}
