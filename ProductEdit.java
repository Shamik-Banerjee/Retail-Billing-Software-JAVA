package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class ProductEdit 
{
	ArrayList <ProductInfo> al;
	public ProductEdit()
	{
		int searchItemCode=Integer.parseInt(JOptionPane.showInputDialog("Enter the item code to be searched..."));
		boolean flag=false;
		
		try {
			FileInputStream fin=new FileInputStream("product.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<ProductInfo>) oin.readObject();
		}catch (Exception e) {
			System.out.println("Creating the data file for the first time...");
		}
		
		for(int i=0;i<al.size();i++) {
			ProductInfo ob1=al.get(i);
			if (searchItemCode==ob1.getItemCode()) {
				flag=true;
				
				int updic=Integer.parseInt(JOptionPane.showInputDialog("Please update item code"));
				ob1.setItemCode(updic);
				String updname=JOptionPane.showInputDialog("Please Update the item Name");
				ob1.setItemName(updname);;
				int updstock=Integer.parseInt(JOptionPane.showInputDialog("Please update Stock"));
				ob1.setStock(updstock);
				int updprice=Integer.parseInt(JOptionPane.showInputDialog("Please Update price"));
				ob1.setPrice(updprice);				
				
			}
		}
		
		if (flag==true) {
			try {
				FileOutputStream fout=new FileOutputStream("product.dat");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(al);
			}catch(Exception e) {
			
				System.out.println("Exception has been observed..."+e);
			} 
		} else {
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the item code "+searchItemCode+"...");
		}
		
		System.out.println("Updating of old record has been done successfully...");
	}

	}

