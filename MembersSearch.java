package p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;




public class MembersSearch 
{
	int searchCardNo;
	ArrayList <MembersInfo>al=new ArrayList <MembersInfo>();
	boolean flag;
	public MembersSearch() 
	{
		searchCardNo=Integer.parseInt(JOptionPane.showInputDialog("Enter the card number to be searched..."));
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
				str="Searching is successfull...";
				str+="\nCard Number = "+ob1.getCardNo();
				str+="\nMember Name = "+ob1.getMemberName();
				str+="\nContact No = "+ob1.getContactNo();
				str+="\nValid Upto = "+ob1.getValidity();
				JOptionPane.showMessageDialog(null, str);
			}
		}
		
		if (flag==false) {
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the card number "+searchCardNo+"...");
		}
	}

	}

