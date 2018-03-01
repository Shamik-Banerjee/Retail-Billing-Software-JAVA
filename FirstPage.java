package p1;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstPage extends JFrame 
{
	private static final String homeIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\home_icon1.jpg";
	private static final String backIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\back_icon1.jpg";
	
	JButton btnSalesWindow,btnProductDetails,btnMembersDetails;
	Container c1;
	public FirstPage()
	{
		c1=getContentPane();
		c1.setLayout(new GridLayout(5,2));
		c1.setLayout(null);
		
		
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
			new Login();
			setVisible(false);
		});

		
		
		btnSalesWindow=new JButton("Sales Section");btnSalesWindow.setForeground(new Color(0,0,0));btnSalesWindow.setBounds(200,50, 200, 35);
		btnProductDetails=new JButton("Products Information");btnProductDetails.setForeground(new Color(0,0,0));btnProductDetails.setBounds(200,100, 200, 35);
		btnMembersDetails=new JButton("Members Details");btnMembersDetails.setForeground(new Color(0,0,0));btnMembersDetails.setBounds(200,150, 200, 35);
		//btnExit=new JButton("Exit");btnExit.setForeground(new Color(0,0,0));btnExit.setBounds(200,200, 200, 35);
		
		/*
		btnSalesWindow.setBackground(Color.CYAN);
		btnProductDetails.setBackground(Color.CYAN);
		btnMembersDetails.setBackground(Color.CYAN);
		btnExit.setBackground(Color.CYAN);
		*/
		
		
		btnSalesWindow.addActionListener((e) -> {
			SalesWindow ob1=new SalesWindow();
			setVisible(false);
		});
		
		btnProductDetails.addActionListener((e) -> {
			ProductWindow ob1=new ProductWindow();
			setVisible(false);
		});
		
		btnMembersDetails.addActionListener((e) -> {
			MembersWindow ob1=new MembersWindow();
			setVisible(false);
		});
		
		/*
		btnExit.addActionListener((e) -> {
			System.exit(0);
			
		});
		*/
		//c1.add(new JLabel(""));c1.add(new JLabel(""));
		c1.add(btnSalesWindow);c1.add(btnProductDetails);
		//c1.add(new JLabel(""));c1.add(new JLabel(""));
		c1.add(btnMembersDetails);
		//c1.add(btnExit);
		//c1.add(new JLabel(""));c1.add(new JLabel(""));
		
		setTitle("BIGMarket-HOME");
	    getContentPane().setBackground(new Color(76,102,164));
		setLocation(300, 200);
		setSize(600, 500);
		
		
		
		//setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}