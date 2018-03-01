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



public class ProductShow extends JFrame 
{
	public ProductShow() 
	{
		String tabHeading[]={"Item Code","Item Name","Stocks Available","Price per unit"};
		String tabBody[][];
		
		ArrayList <ProductInfo> al=new ArrayList<ProductInfo>();
		
		try {
			FileInputStream fin=new FileInputStream("product.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<ProductInfo>) oin.readObject();
			
			tabBody=new String[al.size()][4];
			
			for(int i=0;i<al.size();i++) {
				ProductInfo ob1=al.get(i);
				
				tabBody[i][0]=""+ob1.getItemCode();
				tabBody[i][1]=ob1.getItemName();
				tabBody[i][2]=""+ob1.getStock();
				tabBody[i][3]=""+ob1.getPrice();
			}
			
			Container c=getContentPane();
			c.setLayout(new BorderLayout());
			JTable dataTable=new JTable(tabBody,tabHeading);
			JScrollPane jsp=new JScrollPane(dataTable);
			c.add(new JLabel("All Products records..."),BorderLayout.NORTH);
			c.add(jsp,BorderLayout.CENTER);
			
			setSize(400,500);
			setLocation(100,200);
			setVisible(true);
		}catch (Exception e) {
			System.out.println("Exception has been observed...");
		}
		
	}
	

	}

