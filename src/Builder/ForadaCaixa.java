package Builder;

import java.util.ArrayList;

public class ForadaCaixa extends Funcionario{

	public ForadaCaixa(ArrayList<Item> pedidocliente) {
		super();
		Pedido p1= new Pedido();
		
		for (Item c : pedidocliente) {
			if(c.getLocal()) {
				p1.adicionarForaDaCaixa(c.getNome());
				
			}
		}

	}

	@Override
	public void adicionarCaixa(ArrayList<Item> pedidocliente) {
		// TODO Auto-generated method stub
		
	}

}
