package p1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class ShowAllSales extends JFrame 
{
	public ShowAllSales()
	{
		String tabHeading[]={"Bill No","Bill Date","Customer  Name","Item Code","Item  Name","Price per unit","Quantity","Discount","Total Price"};
		String tabBody[][];
		
		ArrayList <SalesReportInfo> arrayList=new ArrayList<SalesReportInfo>();
		
		try {
			FileInputStream fin=new FileInputStream("billinfo.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			arrayList=(ArrayList<SalesReportInfo>) oin.readObject();
			
			tabBody=new String[arrayList.size()][9];
			
			for(int i=0;i<arrayList.size();i++) {
				SalesReportInfo ob1=arrayList.get(i);
				
				tabBody[i][0]=""+ob1.getBillNo();
				tabBody[i][1]=ob1.getBldt();
				tabBody[i][2]=ob1.getCustomerName();
				tabBody[i][3]=""+ob1.getItemCode();
				tabBody[i][4]=ob1.getItemDsc();
				tabBody[i][5]=""+ob1.getPricePU();
				tabBody[i][6]=""+ob1.getQuantity();
				tabBody[i][7]=""+ob1.getDiscount();
				tabBody[i][8]=""+ob1.getTotalPrice();
				
			}
			
			Container c=getContentPane();
			c.setLayout(new BorderLayout());
			JTable dataTable=new JTable(tabBody,tabHeading);
			JScrollPane jsp=new JScrollPane(dataTable);
			c.add(new JLabel("All Products records..."),BorderLayout.NORTH);
			c.add(jsp,BorderLayout.CENTER);
			
			setSize(800,400);
			setLocation(100,200);
			setVisible(true);
		}catch (Exception e) {
			System.out.println("Exception has been observed...");
		}
}
	}

