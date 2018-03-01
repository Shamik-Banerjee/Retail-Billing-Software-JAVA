package p1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class MembersWindow extends JFrame
{
    JLabel lblHeading,lblCardNo,lblMemberName,lblContactNo,lblValidity;
	JTextField tfCardNo,tfMemberName,tfContactNo,tfValidity;
	JButton btnReset,btnAdd,btnEdit,btnRemove,btnShow,btnSearch;

	private static final String homeIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\home_icon1.jpg";
	private static final String backIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\back_icon1.jpg";
	
	Container c2;
	public MembersWindow() 
	{
		c2=getContentPane();
		c2.setLayout(new GridLayout(5,4));
		c2.setLayout(null);
		
		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,16);
		Font f2=new Font("Arial", Font.BOLD, 25);
		
		
		 
	    BufferedImage backIcon = null;
		try 
		{
			backIcon = ImageIO.read(new File(backIAdd));
		} 
		catch (IOException e1) 
		{
			System.out.println("Button Picture not found");
		}
	    JButton backBut=new JButton(new ImageIcon(backIcon));
	    backBut.setBounds(5,405, 50, 50); backBut.setBackground(new Color(76, 102, 164));
	    add(backBut);
	    backBut.setBorder(BorderFactory.createEmptyBorder());
	    
 	    backBut.addActionListener(e->{
			new FirstPage();
			setVisible(false);
		});
		
		
		
		lblHeading=new JLabel("Enter Member Details :");
		lblHeading.setFont(f2);
		//lblHeading.setForeground(Color.BLACK);
		lblHeading.setForeground(new Color(255, 255, 255));lblHeading.setBounds(200,5,400, 35);
		
		
		lblCardNo=new JLabel("Enter Card No:");lblCardNo.setForeground(new Color(255, 255, 255));lblCardNo.setBounds(100,50,200, 35);
		lblMemberName=new JLabel("Enter Member Name:");lblMemberName.setForeground(new Color(255, 255, 255));lblMemberName.setBounds(100,100,200, 35);
		lblContactNo=new JLabel("Enter Contact No:");lblContactNo.setForeground(new Color(255, 255, 255));lblContactNo.setBounds(100,150,200, 35);
		lblValidity=new JLabel("Enter Validity of Membership:");lblValidity.setForeground(new Color(255, 255, 255));lblValidity.setBounds(100,200,200, 35);
		/*
		lblCardNo.setFont(f1);
		lblMemberName.setFont(f1);
		lblContactNo.setFont(f1);
		lblValidity.setFont(f1);
		
		
		lblCardNo.setForeground(Color.RED);
		lblMemberName.setForeground(Color.RED);
		lblContactNo.setForeground(Color.RED);
		lblValidity.setForeground(Color.RED);
		*/
		tfCardNo=new JTextField(20);tfCardNo.setBounds(300, 50, 190, 35);
		tfMemberName=new JTextField(20);tfMemberName.setBounds(300, 100, 190, 35);
		tfContactNo=new JTextField(20);tfContactNo.setBounds(300, 150, 190, 35);
		tfValidity=new JTextField(20);tfValidity.setBounds(300, 200, 190, 35);
		
		btnAdd=new JButton("Add");btnAdd.setForeground(new Color(0,0,0));btnAdd.setBounds(150,250,100,35);
		btnReset=new JButton("Reset");btnReset.setForeground(new Color(0,0,0));btnReset.setBounds(260,250,100,35);
		btnEdit=new JButton("Edit");btnEdit.setForeground(new Color(0,0,0));btnEdit.setBounds(370,250,100,35);
		btnRemove=new JButton("Remove");btnRemove.setForeground(new Color(0,0,0));btnRemove.setBounds(150,300,100,35);
		btnShow=new JButton("Show All");btnShow.setForeground(new Color(0,0,0));btnShow.setBounds(260,300,100,35);
		btnSearch=new JButton("Search");btnSearch.setForeground(new Color(0,0,0));btnSearch.setBounds(370,300,100,35);
		
		 btnAdd.addActionListener(e->{
			 int cdno=Integer.parseInt(tfCardNo.getText().trim());
				String nm=new String(tfMemberName.getText().trim());
				String con=new String(tfContactNo.getText().trim());
				String val=new String(tfValidity.getText().trim());
				MembersInfo ob1=new MembersInfo(cdno,nm,val,con);
				new MembersAdd(ob1);
				String str=new String("Adding of new member successful");
				str+="\nCard no= "+ob1.getCardNo();
				str+="\nMember name = "+ob1.getMemberName();
				str+="\nContact no = "+ob1.getContactNo();
				str+="\n Validity = "+ob1.getValidity();
				
				JOptionPane.showMessageDialog(null, str);
		 });
		 btnReset.addActionListener(e->{
			 tfCardNo.setText(null);
				tfMemberName.setText(null);
				tfContactNo.setText(null);
				tfValidity.setText(null);
		 });
		 btnEdit.addActionListener(e->{
			 new MembersEdit();
		 });
		 btnRemove.addActionListener(e->{
			 new MembersDelete();
		 });
		 	
		 btnShow.addActionListener(e->{
			 new MembersShow();
		 });
		 btnSearch.addActionListener(e->{
			 new MembersSearch();
		 });
		
		 c2.add(lblHeading); c2.add(new JLabel(""));c2.add(new JLabel(""));c2.add(new JLabel(""));
		 c2.add(lblCardNo);c2.add(tfCardNo);c2.add(lblMemberName);c2.add(tfMemberName);
		 c2.add(lblContactNo);c2.add(tfContactNo);c2.add(lblValidity);c2.add(tfValidity);
		 c2.add(btnAdd);c2.add(btnReset);c2.add(btnEdit);c2.add(btnRemove);
		 c2.add(btnShow);c2.add(btnSearch);
		 
		
		
		 setTitle("MEMBERS");
		    getContentPane().setBackground(new Color(76,102,164));
			setLocation(300, 200);
			setSize(600, 500);
			
		 setVisible(true);
		
		
	}
	
	}
	
	


