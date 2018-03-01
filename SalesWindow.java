package p1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class SalesWindow extends JFrame
{
	JButton btnShow,btnSearch,btnGenerateBill,btnDayReport,btnMonthReport;

	Container c2;

	private static final String homeIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\home_icon1.jpg";
	private static final String backIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\back_icon1.jpg";
	
	public SalesWindow() throws HeadlessException 
	{
		
		c2=getContentPane();
		c2.setLayout(new GridLayout(6,2));
		c2.setLayout(null);
		
		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,16);
		Font f2=new Font("Arial", Font.BOLD, 18);
		
		
		 
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
		
		
		
		btnShow=new JButton("Show All");btnShow.setForeground(new Color(0,0,0));btnShow.setBounds(200,50, 200, 35);
		btnSearch=new JButton("Search");btnSearch.setForeground(new Color(0,0,0));btnSearch.setBounds(200,100, 200, 35);
		btnGenerateBill=new JButton("Generate Bill");btnGenerateBill.setForeground(new Color(0,0,0));btnGenerateBill.setBounds(200,150, 200, 35);
		btnDayReport=new JButton("Day Report");btnDayReport.setForeground(new Color(0,0,0));btnDayReport.setBounds(200,250, 200, 35);
		btnMonthReport=new JButton("Monthly Report");btnMonthReport.setForeground(new Color(0,0,0));btnMonthReport.setBounds(200,300, 200, 35);
		//btnQuit=new JButton("Quit");
		
		/*
		btnShow.setBackground(Color.CYAN);
		btnSearch.setBackground(Color.CYAN);
		btnGenerateBill.setBackground(Color.CYAN);
		btnDayReport.setBackground(Color.CYAN);
		btnMonthReport.setBackground(Color.CYAN);
		btnQuit.setBackground(Color.CYAN);
		*/
		 
		 btnShow.addActionListener((e) ->{
			 new ShowAllSales();
		 });
		 
		 btnSearch.addActionListener((e) ->{
			new SearchFromSales();
		 });
		 
		 btnGenerateBill.addActionListener((e) ->{
			 new GenerateBill();
		 });
		 
		 btnDayReport.addActionListener((e) ->{
			 new DailyReport();
		 });
		 btnMonthReport.addActionListener((e) ->{
			 new MonthlyReport();
		 });
		 
		 /*
		 btnQuit.addActionListener((e) ->{
			System.exit(0); 
		 });
		 */
		 
		 c2.add(btnGenerateBill);
		 c2.add(btnShow);
		 c2.add(btnSearch);
		 c2.add(btnDayReport);
		 c2.add(btnMonthReport);
		 //c2.add(btnQuit);
		 
		 
		 setTitle("SALES");
		    getContentPane().setBackground(new Color(76,102,164));
			setLocation(300, 200);
			setSize(600, 500);
		 		 
		 setVisible(true);
		 

	}
	}
	

