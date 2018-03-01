package p1;

import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class RegController {
	public RegController() {
		// TODO Auto-generated constructor stub
	}

	public void addRecord(Registration reg) {
		boolean flag = false;
		ArrayList<Registration> arrlist;
		try {
			FileInputStream fin = new FileInputStream("Registration.dat");
			ObjectInputStream oin = new ObjectInputStream(fin);
			arrlist = (ArrayList<Registration>) oin.readObject();

		} catch (Exception e) {
			arrlist = new ArrayList<Registration>();
			System.out.println("Creating the data file for the First Time");
		}

		for (int i = 0; i < arrlist.size() && flag == false; i++) {
			if (arrlist.get(i).getName().equals(reg.getName())) {
				if (arrlist.get(i).getEmail().equalsIgnoreCase(reg.getEmail()))
					flag = true;
				else
					flag = false;
			}
		}
		if (flag == true)
			JOptionPane.showMessageDialog(null, "Already exists!!");
		else {
			arrlist.add(reg);
			try {
				FileOutputStream fout = new FileOutputStream("Registration.dat");
				ObjectOutputStream oout = new ObjectOutputStream(fout);
				oout.writeObject(arrlist);
			} catch (Exception e) {
				System.out.println("Exception has been Observed");
			}
			JOptionPane.showMessageDialog(null, reg.getName()
					+ " Successfully Added in " + reg.getEmail());
			new Login();
		}

	}

	public void loginUser(String userName, String password) {
		boolean flag = false;
		ArrayList<Registration> arrlist;
		try {
			FileInputStream fin = new FileInputStream("Registration.dat");
			ObjectInputStream oin = new ObjectInputStream(fin);
			arrlist = (ArrayList<Registration>) oin.readObject();

		} catch (Exception e) {
			arrlist = new ArrayList<Registration>();
			System.out.println("Creating the data file for the First Time");
		}
		for (int i = 0; i < arrlist.size() && flag == false; i++) {
			if ((arrlist.get(i).getEmail().equals(userName))
					&& (arrlist.get(i).getPass().equals(password))) {
				flag = true;
			} else {
				flag = false;
			}
		}
		if(flag){
			new FirstPage();
		}else{
			JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			new Login();
		}
	}
}