package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;





public class MembersDelete 
{
	int searchCardNo;
	boolean flag=false;
	ArrayList <MembersInfo>al=new ArrayList <MembersInfo>();
	public MembersDelete()
	{
searchCardNo=Integer.parseInt(JOptionPane.showInputDialog("Enter the member's card no to be deleted..."));
		
		try {
			FileInputStream fin=new FileInputStream("membersinfo.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<MembersInfo>) oin.readObject();
		}catch (Exception e) {
			al=new ArrayList<MembersInfo>();
			System.out.println("Creating the data file for the first time...");
		}
		
		for(int i=0;i<al.size();i++) {
			MembersInfo ob1=al.get(i);
			
			if (ob1.getCardNo()==searchCardNo) {
				flag=true;
				String str=new String();
				str="Deletion successfull...";
				str+="\nCard No = "+ob1.getCardNo();
				str+="\nMember Name = "+ob1.getMemberName();
				str+="\nContact No = "+ob1.getContactNo();
				str+="\nValid Upto = "+ob1.getValidity();
				JOptionPane.showMessageDialog(null, str);
				al.remove(i);
			}
		}
		
		if (flag==true) {
			try {
				FileOutputStream fout=new FileOutputStream("membersinfo.dat");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(al);
			}catch(Exception e) {
				System.out.println("Exception has been observed..."+e);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the card no "+searchCardNo+"...");
		}
	}






	}

