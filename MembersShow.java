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


public class MembersShow extends JFrame
{
	public MembersShow() 
	{
		String tabHeading[]={"Card No","Member Name","Contact No","Membership Validity"};
		String tabBody[][];
		ArrayList <MembersInfo> al=new ArrayList<MembersInfo>();
		
		try {
			FileInputStream fin=new FileInputStream("membersinfo.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			al=(ArrayList<MembersInfo>) oin.readObject();
			
			tabBody=new String[al.size()][4];
			
			for(int i=0;i<al.size();i++) {
				MembersInfo ob1=al.get(i);
				
				tabBody[i][0]=""+ob1.getCardNo();
				tabBody[i][1]=ob1.getMemberName();
				tabBody[i][2]=""+ob1.getContactNo();
				tabBody[i][3]=""+ob1.getValidity();
			}
			
			Container c=getContentPane();
			c.setLayout(new BorderLayout());
			JTable dataTable=new JTable(tabBody,tabHeading);
			JScrollPane jsp=new JScrollPane(dataTable);
			c.add(new JLabel("All Member records..."),BorderLayout.NORTH);
			c.add(jsp,BorderLayout.CENTER);
			
			setSize(400,500);
			setLocation(100,200);
			setVisible(true);
		}catch (Exception e) {
			System.out.println("Exception has been observed...");
		}
		
	}
	

	}

