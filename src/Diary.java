import java.util.Date;

public class Diary extends Item{
	private double storageTemp;
	
	
public Diary(double price, String name, int size, String expiryDate, String classname,double storageTemp) {
		super(price, name, size, expiryDate, classname);
		this.storageTemp=storageTemp;
	}
	public double getStorageTemp() {
		return storageTemp;
	}

	public void setStorageTemp(double storageTemp) {
		this.storageTemp = storageTemp;
	}
}
