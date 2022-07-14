package Quetion15;

import java.time.LocalDate;

public class Item {
	int itemId;
	String itemName;
	double costprice;
	double sellPrice;
	LocalDate dom;
	LocalDate doe;
	
	public Item(int itemId,String itemName,double costPrice,double sellPrice,LocalDate dom,LocalDate doe)
	{
		super();
		this.itemId=itemId;
		this.itemName=itemName;
		this.costprice=costPrice;
		this.sellPrice=sellPrice;
		this.dom=dom;
		this.doe=doe;	
	}
	Item item = null;
	
	public boolean createObject(Item i)
	{
		if(countDigit(i.itemId)>=3)
			if(i.itemName.matches("[a-zA-Z]+"))
				if(i.sellPrice>0 && i.costprice>0)
					if(i.doe!=LocalDate.now())
						if(i.sellPrice!=i.costprice)
							item=new Item(i.itemId, i.itemName, i.costprice, i.sellPrice, i.dom, i.doe);
		
		if(item!=null)
			return true;
		else
			return false;				
	}
	
	public static int countDigit(int itemId)
	{
		int count=0;
		while(itemId>0) {
			count++;
			itemId/=10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Item i=new Item(101,"Bhupesh",200,250,LocalDate.of(2022, 7, 5),LocalDate.of(2024, 7, 5));
		System.out.println(i.createObject(i));
	}

}
