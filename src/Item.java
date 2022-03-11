import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item implements ItemInterface{
	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private double price;
	 String name,classname;
	 int size;
	 String expiryDate;
	
	public Item(double price,String name,int size,String expiryDate,String classname) {
		this.expiryDate=expiryDate;
		this.size=size;
		this.name=name;
		this.price=price;
		this.classname=classname;
	}
	
	public int viewExpiry() {
		Date today=new Date();
		int remaining=0;
		try {
			Date exDate=dateFormat.parse(expiryDate);
			Date todayDate=dateFormat.parse(dateFormat.format(today));
			long difference_In_Time= exDate.getTime() - todayDate.getTime();
			long difference_In_Days= (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
			remaining=(int)difference_In_Days;
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		if(remaining<=1)System.out.println("ITEM EXPIRED");
		return remaining;
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
