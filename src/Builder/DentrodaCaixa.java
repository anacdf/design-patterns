package Builder;

import java.util.ArrayList;

public class DentrodaCaixa extends Funcionario{

	
	public DentrodaCaixa(ArrayList<Item> pedidocliente) {
		super();
		Pedido p1= new Pedido();
		
		for (Item c : pedidocliente) {
			if(!c.getLocal()) {
				p1.adicionarDentroDaCaixa(c.getNome());
				
			}
		}

	}
	
	@Override
	public void adicionarCaixa(ArrayList<Item> pedidocliente) {
		
	}

}
