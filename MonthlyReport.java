package p1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class MonthlyReport extends JFrame
{
	public MonthlyReport()
	{
		String tabHeading[]={"Item Code","Item Name","Quantity","Total Sales"};
		String tabBody[][];
		String searchMonth=new String(JOptionPane.showInputDialog("enter month"));
		String searchYear=new String(JOptionPane.showInputDialog("enter year"));
		int mon=Integer.parseInt(searchMonth);
		int year=Integer.parseInt(searchYear);
		double totalSales = 0;
		int qty = 0;
		
		
		ArrayList <SalesReportInfo> al2=new ArrayList<SalesReportInfo>();
		ArrayList <ProductInfo> al1=new ArrayList<ProductInfo>();
		
		try{
			FileInputStream fin1=new FileInputStream("pro.dat");
			ObjectInputStream oin1=new ObjectInputStream(fin1);
			al1=(ArrayList<ProductInfo>) oin1.readObject();
			
			String prodName[]=new String[al1.size()];
			
			FileInputStream fin2=new FileInputStream("billinfo.dat");
			ObjectInputStream oin2=new ObjectInputStream(fin2);
			al2=(ArrayList<SalesReportInfo>) oin2.readObject();
			
			tabBody=new String[al2.size()][4];
			
			for(int i=0;i<al1.size();i++){
				ProductInfo ob1=al1.get(i);
				prodName[i]=ob1.getItemName();
				for(int j=0;j<al2.size();j++){
					SalesReportInfo ob2=al2.get(j);
					if(prodName[i].equals(ob2.getItemDsc())){
						if(mon==ob2.getBillDate().getMonthValue()){
							if(year==ob2.getBillDate().getYear()){
								
							
							qty+=ob2.getQuantity();
							totalSales+=ob2.getTotalPrice();
							}
						}
					}
						
						tabBody[i][0]=""+ob1.getItemCode();
						
						tabBody[i][1]=ob1.getItemName();
						
						tabBody[i][2]=""+qty;
						
						tabBody[i][3]=""+totalSales;
						     
					
				}
			}
			

			Container c=getContentPane();
			c.setLayout(new BorderLayout());
			JTable dataTable=new JTable(tabBody,tabHeading);
			JScrollPane jsp=new JScrollPane(dataTable);
			c.add(new JLabel("Month Record..."),BorderLayout.NORTH);
			c.add(jsp,BorderLayout.CENTER);
			
			setSize(800,400);
			setLocation(100,200);
			setVisible(true);
		}catch (Exception e) {
			System.out.println("Exception has been observed..."+e);
			
			
			
		}
	}
	}

