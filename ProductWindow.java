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



public class ProductWindow extends JFrame
{
JLabel lblHeading,lblItemCode,lblItemName,lblStockAvailable,lblPricePerUnit;
	
	JTextField tfItemCode,tfItemName,tfStockAvailable,tfPricePerUnit;
	
	JButton btnReset,btnAdd,btnEdit,btnRemove,btnShow,btnSearch,btnLowStock;

	Container c2;
	
	private static final String homeIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\home_icon1.jpg";
	private static final String backIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\back_icon1.jpg";
	
	public ProductWindow()
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
		
		
		
		
		
		
		lblHeading=new JLabel("Enter Product Details   ");
		lblHeading.setFont(f2);
		//lblHeading.setForeground(Color.BLACK);
		lblHeading.setForeground(new Color(255, 255, 255));lblHeading.setBounds(200,5,400, 35);
		
		
		lblItemCode=new JLabel("Enter Item Code:");lblItemCode.setForeground(new Color(255, 255, 255));lblItemCode.setBounds(150,50,100, 35);
		lblItemName=new JLabel("Enter Item Name:");lblItemName.setForeground(new Color(255, 255, 255));lblItemName.setBounds(150,100,100, 35);
		lblStockAvailable=new JLabel("Enter Stock Available:");lblStockAvailable.setForeground(new Color(255, 255, 255));lblStockAvailable.setBounds(150,150,150, 35);
		lblPricePerUnit=new JLabel("Enter Price per unit:");lblPricePerUnit.setForeground(new Color(255, 255, 255));lblPricePerUnit.setBounds(150,200,150, 35);
		
		//lblItemCode.setFont(f1);
		//lblItemName.setFont(f1);
		//lblStockAvailable.setFont(f1);
		//lblPricePerUnit.setFont(f1);
		
		
		//lblItemCode.setForeground(Color.MAGENTA);
		//lblItemName.setForeground(Color.MAGENTA);
		//lblStockAvailable.setForeground(Color.MAGENTA);
		//lblPricePerUnit.setForeground(Color.MAGENTA);
		
		tfItemCode=new JTextField(20);tfItemCode.setBounds(300, 50, 190, 35);
		tfItemName=new JTextField(20);tfItemName.setBounds(300, 100, 190, 35);
		tfStockAvailable=new JTextField(20);tfStockAvailable.setBounds(300, 150, 190, 35);
		tfPricePerUnit=new JTextField(20);tfPricePerUnit.setBounds(300,200, 190, 35);
		
		btnAdd=new JButton("Add");btnAdd.setForeground(new Color(0,0,0));btnAdd.setBounds(150,250,100,35);
		btnReset=new JButton("Reset");btnReset.setForeground(new Color(0,0,0));btnReset.setBounds(260,250,100,35);
		btnEdit=new JButton("Edit");btnEdit.setForeground(new Color(0,0,0));btnEdit.setBounds(370,250,100,35);
		btnRemove=new JButton("Remove");btnRemove.setForeground(new Color(0,0,0));btnRemove.setBounds(150,300,100,35);
		btnShow=new JButton("Show All");btnShow.setForeground(new Color(0,0,0));btnShow.setBounds(260,300,100,35);
		btnSearch=new JButton("Search");btnSearch.setForeground(new Color(0,0,0));btnSearch.setBounds(370,300,100,35);
		btnLowStock=new JButton("Show Low Stock");btnLowStock.setForeground(new Color(0,0,0));btnLowStock.setBounds(210,350,200,35);
		
		 btnAdd.addActionListener(e->{
			 int ic=Integer.parseInt(tfItemCode.getText().trim());
				String nm=new String(tfItemName.getText().trim());
				int stk=Integer.parseInt(tfStockAvailable.getText().trim());
				double pri=Double.parseDouble(tfPricePerUnit.getText().trim());
				ProductInfo ob1=new ProductInfo(ic,nm,stk,pri);
				new ProductAdd(ob1);
				String str=new String("Adding of new product successful");
				str+="\nItem code= "+ob1.getItemCode(); 
				str+="\nItem name = "+ob1.getItemName();
				str+="\nStock = "+ob1.getStock();
				str+="\nPrice per unit = "+ob1.getPrice();
				
				JOptionPane.showMessageDialog(null, str);
		 });
		 btnReset.addActionListener(e->{
			 tfItemCode.setText(null);
				tfItemName.setText(null);
				tfStockAvailable.setText(null);
				tfPricePerUnit.setText(null);
		 });
		 btnEdit.addActionListener(e->{
			 new ProductEdit();
		 });
		 btnRemove.addActionListener(e->{
			 new ProductDelete();
		 });
		 btnShow.addActionListener(e->{
			 new ProductShow();
		 });
		 btnSearch.addActionListener(e->{
			 new ProductSearch();
		 });
		 btnLowStock.addActionListener(e->{
			 new ProductLowStock();
		 });
		 
		 c2.add(lblHeading); 
		 //c2.add(new JLabel(""));
		 //c2.add(new JLabel(""));
		 //c2.add(new JLabel(""));
		 c2.add(lblItemCode);
		 c2.add(tfItemCode);
		 c2.add(lblItemName);
		 c2.add(tfItemName);
		 c2.add(lblStockAvailable);
		 c2.add(tfStockAvailable);
		 c2.add(lblPricePerUnit);
		 c2.add(tfPricePerUnit);
		 c2.add(btnAdd);
		 c2.add(btnReset);
		 c2.add(btnEdit);
		 c2.add(btnRemove);
		 c2.add(btnShow);
		 c2.add(btnSearch);
		 c2.add(btnLowStock);
		 
		 setTitle("PRODUCT");
		    getContentPane().setBackground(new Color(76,102,164));
			setLocation(300, 200);
			setSize(600, 500);
			
	
		 //setResizable(true);
		 
		 setVisible(true);
		
		
	}
}


