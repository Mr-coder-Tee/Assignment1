
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retail retail=new Retail("shoprite");
		
		Drink drink1=new Drink(12.0,"coke",1,"1/12/2022","Drink","fizzy drink");
		Drink drink2=new Drink(12.0,"coke",1,"9/02/2022","Drink","fizzy drink");
		
		Diary diary1=new Diary(12.99,"milk",1,"1/12/2022","Diary",22.2);
		Diary diary2=new Diary(32.99,"yughurt",10,"1/6/2022","Diary",37.5);
		
		Detergent detergent1=new Detergent(22.0,"old spice",1,"1/4/2022","Detergent","liquid");
		Detergent detergent2=new Detergent(15.99,"sunlight bar",1,"1/3/2022","Detergent","bar");
		
		retail.addItem(drink1);
		retail.addItem(drink2);
		retail.addItem(diary1);
		retail.addItem(diary2);
		retail.addItem(detergent1);
		retail.addItem(detergent2);
		
		retail.viewStock();
	}

}
