package Builder;

import java.util.ArrayList;




public class Cliente {

	
	
   private ArrayList <Item> pedidocliente;
   private Item i =new Item("Hamburguer",false);
   private Item j= new Item("Refri",true);
   public Cliente() {
	   
	
	   
	   pedidocliente=new ArrayList<>();
		  
	   pedidocliente.add(i);
	   
	   pedidocliente.add(j);

	   Atendente a1 = new Atendente(pedidocliente);
   }
   
  
	
	
	
	
	
}
