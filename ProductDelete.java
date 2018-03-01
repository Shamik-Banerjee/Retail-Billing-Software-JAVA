package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;





public class ProductDelete 
{
	int searchItemCode;
	boolean flag=false;
	ArrayList <ProductInfo>al=new ArrayList <ProductInfo>();
	public ProductDelete() 
	{
searchItemCode=Integer.parseInt(JOptionPane.showInputDialog("Enter the item code to be deleted..."));
		
		try {
			FileInputStream fin=new FileInputStream("product.dat");
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
				str="Deletion is successfull...";
				str+="\nItem Code = "+ob1.getItemCode();
				str+="\nItem Name = "+ob1.getItemName();
				str+="\nStock Available = "+ob1.getStock();
				str+="\nPrice = "+ob1.getPrice();
				JOptionPane.showMessageDialog(null, str);
				al.remove(i);
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
	}

	}
	

