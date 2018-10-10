package Builder;

import java.util.ArrayList;




public class Cliente {

	
	
   private ArrayList <Item> pedidocliente;
   private Item i =new Item("Hamburguer",'i');
   private Item j= new Item("Refri",'o');
   public Cliente() {
	   
	   pedidocliente=new ArrayList<>();
	  
	   pedidocliente.add(i);
	   
	   pedidocliente.add(j);
   }
   
  
	
	
	
	
	
}
