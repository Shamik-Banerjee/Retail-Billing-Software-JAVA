package p1;

import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Component;
import java.awt.Container;
//import java.awt.Font;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class RegistrationForm extends JFrame {
	
	JLabel lname, laddr, lemail, lphno, lgendr, lpassword, lrepassword;
	JTextField txtName, txtEmail, textphno;
	JTextArea txtAddr;
	ButtonGroup bgGen;
	JRadioButton rmale, rfemale;
	JPasswordField fpassword, cpassword;
	JPanel Pgen;
	JButton jbt;
	String pass;
	String email;
	String phno;
	String addr;
	String name;
	String gen;

	private static final String homeIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\home_icon1.jpg";
	private static final String backIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\back_icon1.jpg";
	
	
	public RegistrationForm() {
		Container c = getContentPane();
		c.setLayout(null);
		

		
		BufferedImage homeIcon = null;
		try 
		{
			homeIcon = ImageIO.read(new File(homeIAdd));
		} 
		catch (IOException e1) 
		{
			System.out.println("Button Picture not found");
		}
	    JButton homeBut=new JButton(new ImageIcon(homeIcon));
	    homeBut.setBounds(5, 5, 50, 50); homeBut.setBackground(new Color(76, 102, 164));
	    add(homeBut);
	    homeBut.setBorder(BorderFactory.createEmptyBorder());

	    homeBut.addActionListener(e->{
			new Home();
			setVisible(false);
		});
	    
		
		
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
			new Home();
			setVisible(false);
		});
		
		
		
		
		
		
		/*JLabel hlebel = new JLabel("Register Employee Details");
		hlebel.setFont(new Font("STENCIL", Font.BOLD, 18));
		hlebel.setForeground(new Color(0, 0, 255));
		hlebel.setBounds(60, 40, 100, 36);
		c.add(hlebel);*/

		lname = new JLabel("NAME");
		lname.setForeground(new Color(255, 255, 255));
		lname.setBounds(100, 50, 150, 35);
		laddr = new JLabel("ADDRESS");
		laddr.setForeground(new Color(255, 255, 255));
		laddr.setBounds(100, 100, 150, 35);
		lemail = new JLabel("EMAIL-ID");
		lemail.setForeground(new Color(255, 255, 255));
		lemail.setBounds(100, 150, 150, 35);
		lphno = new JLabel("PHONE NUMBER");
		lphno.setForeground(new Color(255, 255, 255));
		lphno.setBounds(100, 200, 150, 35);
		lgendr = new JLabel("GENDER");
		lgendr.setForeground(new Color(255, 255, 255));
		lgendr.setBounds(100, 250, 150, 35);
		lpassword = new JLabel("PASSWORD");
		lpassword.setForeground(new Color(255, 255, 255));
		lpassword.setBounds(100,300,150,35);
		lrepassword = new JLabel("REENTER PASSWORD");
		lrepassword.setForeground(new Color(255, 255, 255));
		lrepassword.setBounds(100,350,150,35);
		txtName = new JTextField(20);
		txtName.setBounds(300, 50, 190, 35);
		txtEmail = new JTextField(40);
		txtEmail.setBounds(300, 150, 190, 35);
		textphno = new JTextField(10);
		textphno.setBounds(300, 200, 190, 35);
		txtAddr = new JTextArea(5, 65);
		txtAddr.setBounds(300, 100, 190, 35);
		bgGen = new ButtonGroup();
		rfemale = new JRadioButton("FEMALE");
		rfemale.setBackground(new Color(76, 102,164));
		rfemale.setBounds(410,250,100,35);
		rmale = new JRadioButton("MALE");
		rmale.setBackground(new Color(76, 102,164));
		rmale.setBounds(200,405,190,35);
		fpassword = new JPasswordField(10);
		fpassword.setBounds(300,300,190,35);
	
		cpassword = new JPasswordField(10);
		cpassword.setBounds(300,350,190,35);
	
		Pgen = new JPanel();
		Pgen.setBounds(300, 250, 190, 35);
		jbt = new JButton("REGISTER");
		jbt.setForeground(new Color(0,0,0));
		jbt.setBounds(200,405,190,35);
		//setLayout(new GridLayout(8, 2));

		bgGen.add(rmale);
		bgGen.add(rfemale);
		Pgen.add(rmale);
		Pgen.add(rfemale);
		Pgen.setBackground(new Color(76,102,164));

		c.add(lname);
		c.add(txtName);
		c.add(laddr);
		c.add(txtAddr);
		c.add(lemail);
		c.add(txtEmail);
		c.add(lphno);
		c.add(textphno);
		c.add(lgendr);
		
		c.add(Pgen);
		c.add(lpassword);
		c.add(fpassword);
		c.add(lrepassword);
		c.add(cpassword);
		c.add(jbt);
		getContentPane().setBackground(new Color(76,102,164));
		setTitle("REGISTRATION");
		setLocation(300, 200);
		setSize(600, 500);
		jbt.addActionListener(e->{
			String name=txtName.getText();
			String addr=txtAddr.getText();
			String email=txtEmail.getText();
			String phno=textphno.getText();
			String gen="";
			if(rmale.isSelected())
			{
				gen="Male";
			}
			else if(rfemale.isSelected())
			{
				gen="Female";
			}
			String fpass=new String(fpassword.getPassword());
			String rpass=new String(cpassword.getPassword());
			if(fpass.equals(rpass))
			{
				pass=fpass;
			}
			Registration reg=new Registration(name, email, addr, phno, gen, pass);
			RegController rcon=new RegController();
			rcon.addRecord(reg);
			setVisible(false);
				
		});
		
		setVisible(true);
		
	}
}
