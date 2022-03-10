import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item implements ItemInterface{

	private double price;
	 String name,classname;
	 int size;
	 Date expiryDate;
	
	public Item(double price,String name,int size,String expiryDate,String classname) {
		try {
			this.expiryDate=new SimpleDateFormat("dd/mm/yyyy").parse(expiryDate);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		this.size=size;
		this.name=name;
		this.price=price;
		this.classname=classname;
	}
	
	public int viewExpiry() {
		Date today=new Date();
		int dayLeft=expiryDate.compareTo(today);
		if(dayLeft<=1)System.out.println("ITEM EXPIRED");
		return dayLeft;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price=price;
	}

}
