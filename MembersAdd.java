package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;





public class MembersAdd 
{
	ArrayList <MembersInfo> al;
	public MembersAdd(MembersInfo mi) 
	{
		try {
			FileInputStream fin=new FileInputStream("membersinfo.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<MembersInfo>) oin.readObject();
			
		}catch (Exception e) {
			al=new ArrayList<MembersInfo>();
			System.out.println("Creating the data file for the first time...");
		}
		
		al.add(mi);
		
		try {
			for(MembersInfo ob2:al) {
				
			}
			
			FileOutputStream fout=new FileOutputStream("membersinfo.dat");
			
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

