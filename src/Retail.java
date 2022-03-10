import java.util.*;

public class Retail {

	String name;
	ArrayList<Item>stock=new ArrayList<>();
	ArrayList<Item>sold=new ArrayList<>();
//a List containing Items available in the stock and another List containing sold  items.
	// view available stock, that prints Class name of item, name of Item,size of item and total number of items that have same name, and size
// Items are the same if their class name, item name and size are the same.
	public Retail(String name) {
		this.name=name;
	}
	
	public void addItem(Item item) {
		//loop through and check if there is any match if there is increment total by 1, otherwise add.
		stock.add(item);
		
	}
	public double totalSales() {
		double sum=0;
		for(Item item:stock) {
			sum+=item.getPrice();
		}
		return sum;
	}
	public void sell(String name,int size) {
		for(int i=0;i<stock.size();i++) {
			Item item=stock.get(i);
			if(item.name.equals(name)&&item.size==size) {
				Date today=new Date();
				int dayLeft=item.expiryDate.compareTo(today);
				sold.add(item);
				stock.remove(i);
				System.out.println("Name: "+item.name+"\t Size:"+item.size+"\t Days left:"+dayLeft);
				return;
			}
		}
		System.out.println("No stock");
	}
	public void viewStock() {
		//loop through stock
		System.out.println("ClassName\tItemName\tSize\tTotal");
		//get totals of the same items
		HashMap<String,Integer>map=new HashMap<>();
		HashMap<String,Item>track=new HashMap<>();
		for(Item item:stock) {
			String key=item.name+Integer.toString(item.size);
			if(map.containsKey(key)) {
				map.replace(key, map.get(key)+1);
			}else {
				track.put(key,item);
				map.put(key, 1);
			}
		}
		//loop through the map and display
		for(String key:map.keySet()) {
			Item item=track.get(key);
			int total=(int)map.get(key);
		
			if(item.classname.equals("Diary")||item.classname.equals("Drink"))
				System.out.println(item.classname+"\t\t"+item.name+"\t\t"+item.size+"\t"+total);
			else
				System.out.println(item.classname+"\t"+item.name+"\t"+item.size+"\t"+total);
		}
		
	}

}

