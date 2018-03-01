package p1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class Home extends JFrame {
	public Home() {
		Container c=getContentPane();
		c.setLayout(null);
		JLabel hlebel=new JLabel("Welcome To BigMARKET");
		hlebel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		hlebel.setForeground(new Color(255,255, 255));
		hlebel.setBounds(60, 40, 520, 36);
		
		JButton lBut=new JButton("LOGIN");
		lBut.setFont(new Font("STENCIL", Font.BOLD, 18));
		lBut.setForeground(new Color(0,0,0));
		lBut.setBounds(320, 250, 200, 30);
		lBut.addActionListener(e->{
			new Login();
			setVisible(false);
		});
		
		JButton rBut=new JButton("REGISTER");
		rBut.setFont(new Font("STENCIL", Font.BOLD, 18));
		rBut.setForeground(new Color(0,0,0));
		rBut.setBounds(320, 280, 200, 30);
		rBut.addActionListener(e->{
			new RegistrationForm();
			setVisible(false);
		});
		
		
		c.add(hlebel);
		c.add(lBut);
		c.add(rBut);
		c.setBackground(new Color(76,102,164));
		setTitle("HOME");
		setLocation(300, 200);
		setSize(600, 450);
		setVisible(true);
	}

	public static void main(String[] args) {	
		new Home();
	}

}
