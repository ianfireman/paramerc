package models;

import java.util.ArrayList;

public class LoadItens {
	
	public ArrayList<Item> itens;
	
	public void loadItemList(){
		itens = new ArrayList<Item>();
		
		itens.add( new Item("MercadosDistri S.A","28/02/2016",1,"Fósforo","23/05/2016","Utilidade",1.00,"Foguinho"));
		itens.add( new Item("MercadosDistri S.A","29/09/2016",2,"Fósforo","23/05/2016","Utilidade",1.00,"Foguinho"));
		itens.add( new Item("MercadosDistri S.A","30/09/2016",3,"Fósforo","23/05/2016","Utilidade",1.00,"Foguinho"));
		itens.add( new Item("MercadosDistri S.A","01/10/2016",4,"Fósforo","23/05/2016","Utilidade",1.00,"Foguinho"));
		itens.add( new Item("MercadosDistri S.A","02/10/2016",5,"Fósforo","04/06/2016","Utilidade",1.5,"Brasa"));
		itens.add( new Item("MercadosDistri S.A","03/10/2016",6,"Biscoito","04/06/2016","Lanches",2.00,"Treloso"));
		itens.add( new Item("MercadosDistri S.A","04/10/2016",7,"Biscoito","04/06/2016","Lanches",2.00,"Treloso"));
		itens.add( new Item("MercadosDistri S.A","05/10/2016",8,"Biscoito","04/06/2016","Lanches",3.99,"Oreo"));
		itens.add( new Item("MercadosDistri S.A","06/10/2016",9,"Biscoito","07/03/2016","Lanches",2.45,"Guffs"));
		itens.add( new Item("MercadosDistri S.A","07/10/2016",10,"Biscoito","04/06/2016","Lanches",2.45,"Guffs"));
		itens.add( new Item("MercadosDistri S.A","08/10/2016",11,"Leite","01/06/2015","Perecíveis",5.00,"Camponesa"));
		itens.add( new Item("MercadosDistri S.A","09/10/2016",12,"Leite","28/06/2016","Perecíveis",5.00,"Camponesa"));
		itens.add( new Item("MercadosDistri S.A","10/10/2016",13,"Leite","28/06/2016","Perecíveis",5.00,"Camponesa"));
		itens.add( new Item("MercadosDistri S.A","17/06/2016",14,"Leite","07/03/2016","Perecíveis",4.5,"Elegê"));
		itens.add( new Item("MercadosDistri S.A","17/06/2016",15,"Leite","07/03/2016","Perecíveis",4.5,"Elegê"));
		itens.add( new Item("MercadosDistri S.A","13/10/2016",16,"Feijão","28/06/2016","Perecíveis",11.00,"Mulato"));
		itens.add( new Item("MercadosDistri S.A","14/10/2016",17,"Feijão","04/06/2016","Perecíveis",11.00,"Mulato"));
		itens.add( new Item("MercadosDistri S.A","15/10/2016",18,"Feijão","04/06/2016","Perecíveis",11.00,"Mulato"));
		itens.add( new Item("MercadosDistri S.A","16/10/2016",19,"Feijão","28/06/2016","Perecíveis",11.00,"Mulato"));
		itens.add( new Item("MercadosDistri S.A","17/10/2016",20,"Feijão","04/06/2016","Perecíveis",6.3,"Carioca"));
		itens.add( new Item("Nobrega LTDA","18/10/2016",21,"Arroz","04/06/2016","Perecíveis",2.3,"Emoções"));
		itens.add( new Item("Nobrega LTDA","19/10/2016",22,"Arroz","28/06/2016","Perecíveis",2.3,"Emoções"));
		itens.add( new Item("Nobrega LTDA","20/10/2016",23,"Arroz","18/05/2016","Perecíveis",2.66,"Emoções"));
		itens.add( new Item("Nobrega LTDA","21/10/2016",24,"Arroz","18/05/2016","Perecíveis",2.66,"Esterlino"));
		itens.add( new Item("Nobrega LTDA","22/10/2016",25,"Arroz","28/06/2016","Perecíveis",2.66,"Esterlino"));
		itens.add( new Item("Nobrega LTDA","23/10/2016",26,"Banana","28/06/2016","Frutas",0.12,"Frutazil"));
		itens.add( new Item("Nobrega LTDA","24/10/2016",27,"Banana","01/06/2015","Frutas",0.12,"Frutazil"));
		itens.add( new Item("Nobrega LTDA","25/10/2016",28,"Banana","27/06/2016","Frutas",0.12,"Frutazil"));
		itens.add( new Item("Nobrega LTDA","26/10/2016",29,"Banana","04/06/2016","Frutas",0.24,"BrasFruta"));
		itens.add( new Item("Nobrega LTDA","27/10/2016",30,"Banana","04/06/2016","Frutas",0.24,"BrasFruta"));
		itens.add( new Item("Nobrega LTDA","28/10/2016",31,"Chocolate","27/06/2016","Perecíveis",8.35,"Alpino"));
		itens.add( new Item("Nobrega LTDA","29/10/2016",32,"Chocolate","01/06/2015","Perecíveis",8.35,"Alpino"));
		itens.add( new Item("Nobrega LTDA","30/10/2016",33,"Chocolate","27/06/2016","Perecíveis",8.35,"Alpino"));
		itens.add( new Item("Nobrega LTDA","31/10/2016",34,"Chocolate","27/06/2016","Perecíveis",8.35,"Alpino"));
		itens.add( new Item("Nobrega LTDA","04/05/2016",35,"Chocolate","18/02/2016","Perecíveis",8.35,"Alpino"));
		itens.add( new Item("Nobrega LTDA","02/11/2016",36,"Lã de Aço","18/05/2016","Utilidade",1.55,"Açolan"));
		itens.add( new Item("Nobrega LTDA","03/11/2016",37,"Lã de Aço","27/06/2016","Utilidade",1.55,"Açolan"));
		itens.add( new Item("Nobrega LTDA","04/11/2016",38,"Lã de Aço","27/06/2016","Utilidade",2,"Nebelo"));
		itens.add( new Item("Nobrega LTDA","05/11/2016",39,"Lã de Aço","27/06/2016","Utilidade",1.3,"Bom Bril"));
		itens.add( new Item("Nobrega LTDA","06/11/2016",40,"Lã de Aço","27/06/2016","Utilidade",1.3,"Bom Bril"));
		itens.add( new Item("Nobrega LTDA","07/11/2016",41,"Sal","01/06/2015","Condimentos",1.2,"Lagril"));
		itens.add( new Item("Nobrega LTDA","08/11/2016",42,"Sal","28/06/2016","Condimentos",1.2,"Lagril"));
		itens.add( new Item("Nobrega LTDA","09/11/2016",43,"Sal","01/06/2015","Condimentos",1.2,"Lagril"));
		itens.add( new Item("Nobrega LTDA","10/11/2016",44,"Sal","18/05/2016","Condimentos",1.2,"Lagril"));
		itens.add( new Item("Nobrega LTDA","11/11/2016",45,"Sal","28/06/2016","Condimentos",1.65,"Praiero"));
		itens.add( new Item("Nobrega LTDA","12/11/2016",46,"Açúcar","18/05/2016","Condimentos",2.39,"Adocica"));
		itens.add( new Item("Nobrega LTDA","13/11/2016",47,"Açúcar","18/05/2016","Condimentos",2.39,"Adocica"));
		itens.add( new Item("Nobrega LTDA","14/11/2016",48,"Açúcar","18/05/2016","Condimentos",2.79,"Cristal"));
		itens.add( new Item("Nobrega LTDA","15/11/2016",49,"Açúcar","28/06/2016","Condimentos",2.79,"Cristal"));
		itens.add( new Item("Nobrega LTDA","16/11/2016",50,"Açúcar","27/06/2016","Condimentos",2.79,"Cristal"));
		itens.add( new Item("Nobrega LTDA","17/11/2016",51,"Macarrão","27/06/2016","Perecíveis",1.89,"Fininho"));
		itens.add( new Item("Nobrega LTDA","18/11/2016",52,"Macarrão","27/06/2016","Perecíveis",1.89,"Fininho"));
		itens.add( new Item("Nobrega LTDA","19/11/2016",53,"Macarrão","27/06/2016","Perecíveis",1.89,"Fininho"));
		itens.add( new Item("Nobrega LTDA","20/11/2016",54,"Macarrão","18/05/2016","Perecíveis",2.25,"Espaguete"));
		itens.add( new Item("Nobrega LTDA","21/11/2016",55,"Macarrão","01/06/2015","Perecíveis",2.25,"Espaguete"));
	}
	
	public ArrayList<Item> getItemList(){
		
		return itens;
	}
	
	public Item getItemByCodigo(int codigo){
		
		for(Item item : itens){
			
			if(item.getCodigo() == codigo){
				
				return item;
			}			
		}
		
		Item item = null;
		return item;
		
	}

}
