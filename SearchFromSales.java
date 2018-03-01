package p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class SearchFromSales
{
	int searchBillNo;
	ArrayList <SalesReportInfo>arrayList=new ArrayList <SalesReportInfo>();
	boolean flag;
	
	public SearchFromSales() {
		searchBillNo=Integer.parseInt(JOptionPane.showInputDialog("Enter the bill number to be searched..."));
		
		try {
			FileInputStream fin=new FileInputStream("billinfo.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			arrayList=(ArrayList<SalesReportInfo>) oin.readObject();
		}catch (Exception e) {
			arrayList=new ArrayList<SalesReportInfo>();
			
		}
		
		for(int i=0;i<arrayList.size();i++) {
			SalesReportInfo ob1=arrayList.get(i);
			
			if (ob1.getBillNo()==searchBillNo) {
				flag=true;
				String str=new String();
				str="Searching is successfull...";
				str+="\nBill No ="+ob1.getBillNo();
				str+="\nBill Date ="+ob1.getBldt();
				str+="\nCustomer Name ="+ob1.getCustomerName();
				str+="\n Item Code ="+ob1.getItemCode();
				str+="\nItem Name ="+ob1.getItemDsc();
				str+="\nPrice per unit  ="+ob1.getPricePU();
				str+="\nQuantity ="+ob1.getQuantity();
				str+="\nDiscount ="+ob1.getDiscount();
				str+="\nTotal Price"+ob1.getTotalPrice();
				
				JOptionPane.showMessageDialog(null, str);
			}
		}
		
		if (flag==false) {
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the bill number "+searchBillNo+"...");
		}
	}
}

