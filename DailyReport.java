package p1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class DailyReport extends JFrame
{
	String tabHeading[]={"Bill No","Bill Date","Customer  Name","Item Code","Item  Name","Price per unit","Quantity","Discount","Total Price"};
	String tabBody[][];
	
	String datePattern= "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)";
	
	String searchDate=new String(JOptionPane.showInputDialog("Enter date to get specific day report:"));
	
	Scanner sc1 = new Scanner(searchDate);
	String match = sc1.findInLine(datePattern);{
	
	if (match == null)
	{
		
	JOptionPane.showMessageDialog(null, "Please enter date in dd-mm-yyyy format");
	}
	else
		{
	
	
	
	
	ArrayList <SalesReportInfo> arrayList=new ArrayList<SalesReportInfo>();
	
	try {
		FileInputStream fin=new FileInputStream("billinfo.dat");
		ObjectInputStream oin=new ObjectInputStream(fin);
		arrayList=(ArrayList<SalesReportInfo>) oin.readObject();
		
		tabBody=new String[arrayList.size()][9];
		int location=-1;
		
		for(int i=0;i<arrayList.size();i++) {
			SalesReportInfo ob1=arrayList.get(i);
			if((searchDate).equals(ob1.getBldt())){
				location++;
			tabBody[location][0]=""+ob1.getBillNo();
			tabBody[location][1]=ob1.getBldt();
			tabBody[location][2]=ob1.getCustomerName();
			tabBody[location][3]=""+ob1.getItemCode();
			tabBody[location][4]=ob1.getItemDsc();
			tabBody[location][5]=""+ob1.getPricePU();
			tabBody[location][6]=""+ob1.getQuantity();
			tabBody[location][7]=""+ob1.getDiscount();
			tabBody[location][8]=""+ob1.getTotalPrice();
			
			
			}
		
		}
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		JTable dataTable=new JTable(tabBody,tabHeading);
		JScrollPane jsp=new JScrollPane(dataTable);
		c.add(new JLabel("Sales records:"),BorderLayout.NORTH);
		c.add(jsp,BorderLayout.CENTER);
		
		setSize(800,400);
		setLocation(100,200);
		setVisible(true);
	}catch (Exception e) {
		System.out.println("Exception has been observed...");
	}
}

}
}


