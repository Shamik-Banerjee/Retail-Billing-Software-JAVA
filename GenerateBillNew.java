package p1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GenerateBillNew extends JFrame
{
	JLabel itemcode;
	JTextField itemcode1;
	JLabel quantity;
	JTextField quantity1;
	JLabel product;
	JLabel price;
	JLabel total;
	public GenerateBillNew() 
	{
		itemcode=new JLabel("Item Code");
		itemcode1=new JTextField(10);
		quantity=new JLabel("Quantity");
		quantity1=new JTextField(3);
		
		
	}
	
}
