package p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class ProductSearch
{
	int searchItemCode;
	ArrayList <ProductInfo>al=new ArrayList <ProductInfo>();
	boolean flag;
	public ProductSearch() 
	{
searchItemCode=Integer.parseInt(JOptionPane.showInputDialog("Enter the item code to be searched..."));
		
		try {
			FileInputStream fin=new FileInputStream("pro.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<ProductInfo>) oin.readObject();
		}catch (Exception e) {
			al=new ArrayList<ProductInfo>();
			System.out.println("Creating the data file for the first time...");
		}
		
		for(int i=0;i<al.size();i++) {
			ProductInfo ob1=al.get(i);
			
			if (ob1.getItemCode()==searchItemCode) {
				flag=true;
				String str=new String();
				str="Searching is successfull...";
				str+="\nItem Code = "+ob1.getItemCode();
				str+="\nItem Name = "+ob1.getItemName();
				str+="\nStock Available = "+ob1.getStock();
				str+="\nPrice = "+ob1.getPrice();
				JOptionPane.showMessageDialog(null, str);
			}
		}
		
		if (flag==false) {
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the item code "+searchItemCode+"...");
		}
	}

	}

