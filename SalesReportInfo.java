package p1;

import java.io.Serializable;
import java.time.LocalDate;

public class SalesReportInfo implements Serializable
{
	int billNo,itemCode,discount,quantity;
	String itemDsc,customerName,bldt;
	double pricePU,totalPrice;
	LocalDate billDate;
	
	public SalesReportInfo(int blno,int itcd,String cusnm,int dis,int qty,LocalDate bldt,String itdsc,double ppu,double tp)
	{
		billNo=blno;
		itemCode=itcd;
		customerName=cusnm;
		discount=dis;
		quantity=qty;
		billDate=bldt;
		itemDsc=itdsc;
		pricePU=ppu;
		totalPrice=tp;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItemDsc() {
		return itemDsc;
	}

	public void setItemDsc(String itemDsc) {
		this.itemDsc = itemDsc;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBldt() {
		return bldt;
	}

	public void setBldt(String bldt) {
		this.bldt = bldt;
	}

	public double getPricePU() {
		return pricePU;
	}

	public void setPricePU(double pricePU) {
		this.pricePU = pricePU;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	
}
