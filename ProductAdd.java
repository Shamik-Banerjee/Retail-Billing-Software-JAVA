package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductAdd 
{
	ArrayList <ProductInfo> al;
	public ProductAdd(ProductInfo pi)
	{
		try {
			FileInputStream fin=new FileInputStream("product.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<ProductInfo>) oin.readObject();
			
		}catch (Exception e) {
			al=new ArrayList<ProductInfo>();
			System.out.println("Creating the data file for the first time...");
		}
		
		al.add(pi);
		
		try {
			for(ProductInfo ob2:al) {
				
			}
			
			FileOutputStream fout=new FileOutputStream("product.dat");
			
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			
			oout.writeObject(al);
			
			oout.close();
		}
		catch(Exception e) {
			System.out.println("Exception has been observed..."+e);
			
		}
		
		System.out.println("Writing of new record has been done successfully...");
	}
	
	

}
