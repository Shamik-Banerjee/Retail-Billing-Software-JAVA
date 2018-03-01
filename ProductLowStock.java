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



public class ProductLowStock extends JFrame
{
	public ProductLowStock() 
	{
		String tabHeading[]={"Item  Code","Item  Name","Stock Available","Price per unit"};
		String tabBody[][];
		
		ArrayList <ProductInfo> al=new ArrayList<ProductInfo>();
		
		try {
			FileInputStream fin=new FileInputStream("pro.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<ProductInfo>) oin.readObject();
			
			tabBody=new String[al.size()][4];
			int location=-1;
			
			for(int i=0;i<al.size();i++) {
				ProductInfo ob1=al.get(i);
				if(ob1.getStock()<15){
					location++;
				
				tabBody[location][0]=""+ob1.getItemCode();
				tabBody[location][1]=ob1.getItemName();
				tabBody[location][2]=""+ob1.getStock();
				tabBody[location][3]=""+ob1.getPrice();
				}
			}
			Container c=getContentPane();
			c.setLayout(new BorderLayout());
			JTable dataTable=new JTable(tabBody,tabHeading);
			JScrollPane jsp=new JScrollPane(dataTable);
			c.add(new JLabel("Products with stocks less then 15..."),BorderLayout.NORTH);
			c.add(jsp,BorderLayout.CENTER);
			
			setSize(400,500);
			setLocation(100,200);
			setVisible(true);
		
		}catch (Exception e) {
			System.out.println("Exception has been observed...");
		}
		
	}


	}

