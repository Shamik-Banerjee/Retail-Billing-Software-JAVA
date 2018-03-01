package p1;

import java.io.Serializable;

public class ProductInfo implements Serializable
{
	int itemCode;
	 String itemName;
	 int stock;
	 double price;
	 
	 public ProductInfo(int ic,String in,int  st,double pr)
	 {
		 itemCode=ic;
			itemName=in;
			stock=st;
			price=pr;
	 }

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	 
}
