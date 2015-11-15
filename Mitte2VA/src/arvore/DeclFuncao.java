package arvore;

import arvore.comando.Assinatura;
import arvore.comando.Bloco;

public class DeclFuncao implements DeclGlobal {
	
	private Assinatura assinatura;
	private Bloco bloco;

	public DeclFuncao(Assinatura assinatura, Bloco bloco) {
		super();
		this.assinatura = assinatura;
		this.bloco = bloco;
	}
	
}
