package p1;

import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	JLabel user;
	JLabel pass;
	JTextField user1;
	JPasswordField pass1;
	JButton submit;
 
	
	private static final String homeIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\home_icon1.jpg";
	private static final String backIAdd = "C:\\Users\\user\\Shounak\\RetailBillingFinal1\\back_icon1.jpg";
	public Login() throws HeadlessException {
		setLayout(new GridLayout(3, 1));
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
	   
		
		
		user = new JLabel("USER NAME");
		user.setForeground(new Color(255, 255, 255));
		user.setBounds(100, 50, 150, 35);
		
		pass = new JLabel("PASSWORD");
		pass.setForeground(new Color(255, 255, 255));
		pass.setBounds(100, 100, 150, 35);
		
		user1 = new JTextField(10);
		user1.setBounds(300, 50, 190, 35);
		user1.setToolTipText("Your e-mail ID");
		pass1 = new JPasswordField(10);
		pass1.setBounds(300, 100, 190, 35);
		pass1.setToolTipText("Your password must not be more than 10 characters in length");
		submit = new JButton("SUBMIT");
		submit.setForeground(new Color(0, 0, 0));
		submit.setBounds(200, 150, 190, 35);
		/*JPanel jp1 = new JPanel();
		 jp1.setLayout(new GridLayout(2,1));
		jp1.add(user);
		jp1.add(user1);
		JPanel jp2 = new JPanel();
		 jp2.setLayout(new GridLayout(2,1));
		jp2.add(pass);
		jp2.add(pass1);*/
		/*JPanel jp3 = new JPanel();
		 jp3.setLayout(new GridLayout(2,1));
		jp3.add(submit);*/
		/*c.add(jp1);
		c.add(jp2);*/
		c.add(user);
		c.add(user1);
		c.add(pass);
		c.add(pass1);
		c.add(submit);
		getContentPane().setBackground(new Color(76, 102, 164));
		setTitle("LOGIN");

		setSize(600, 450);
		setLocation(300, 200);
		submit.addActionListener(e->{
			String ur1=user1.getText();
			String pas=pass1.getText();
			new RegController().loginUser(ur1, pas);
			
			setVisible(false);
		});
		setVisible(true);
	}
}