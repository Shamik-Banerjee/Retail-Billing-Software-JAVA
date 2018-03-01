package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;





public class MembersEdit 
{
	ArrayList <MembersInfo> al;
	public MembersEdit() 
	{
		int searchCardNo=Integer.parseInt(JOptionPane.showInputDialog("Enter the member's card no. to be edited..."));
		boolean flag=false;
		try {
			FileInputStream fin=new FileInputStream("membersinfo.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<MembersInfo>) oin.readObject();
		}catch (Exception e) {
			System.out.println("Creating the data file for the first time...");
		}
		
		for(int i=0;i<al.size();i++) {
			MembersInfo ob1=al.get(i);
			if (searchCardNo==ob1.getCardNo()) {
				flag=true;
				
				int updcdno=Integer.parseInt(JOptionPane.showInputDialog("Please update card number"));
				ob1.setCardNo(updcdno);
				String updname=JOptionPane.showInputDialog("Please Update the Member Name");
				ob1.setMemberName(updname);
				String updcon=JOptionPane.showInputDialog("Please update Contact No");
				ob1.setContactNo(updcon);
				String updval=JOptionPane.showInputDialog("Please Update validity");
				ob1.setValidity(updval);				
				
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
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the card number "+searchCardNo+"...");
		}
		
		System.out.println("Updating of old record has been done successfully...");
	}

	
	
}
