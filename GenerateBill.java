package p1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GenerateBill extends JFrame 
{
JLabel lblHeading,lblBillNo,lblBillDate,lblCustomerName,lblItemCode,lblItemName,lblQuantity,lblPPU,lblDiscount,lblTotal;
	
	Container c;
	
	JButton  btnPrint,btnExit;
	
	int searchBillNo;
	ArrayList <SalesReportInfo>arrayList=new ArrayList <SalesReportInfo>();
	boolean flag;
	SalesReportInfo ob1;
	public GenerateBill() {
		
		/*searchBillNo=Integer.parseInt(JOptionPane.showInputDialog("Enter the bill number to be generated"));
		
		
		try {
			FileInputStream fin=new FileInputStream(new File("billinfo.dat"));
			ObjectInputStream oin=new ObjectInputStream(fin);
			arrayList=(ArrayList<SalesReportInfo>) oin.readObject();
		}catch (Exception e) {
			arrayList=new ArrayList<SalesReportInfo>();
			//System.out.println(e);
			
		}
		
		for(int i=0;i<arrayList.size();i++) {
			ob1=arrayList.get(i);
			
			if (ob1.getBillNo()==searchBillNo) {
				flag=true;
			}
		}
	
			
			
		
		
		
		
		if (flag==false) {
			JOptionPane.showMessageDialog(null, "Unsuccessful searching against the bill number "+searchBillNo+"...");
		}		
		if(flag==true)
		{
			c=getContentPane();
			c.setLayout(null);
			
			Font f1=new Font("Arial", Font.BOLD, 24);
			Font f2=new Font("Times New Roman", Font.BOLD,16);
			
			btnPrint=new JButton("Print");
			btnExit=new JButton("Exit");
			lblHeading=new JLabel("Bill:");
			lblHeading.setFont(f1);
			lblHeading.setForeground(Color.RED);
			
			lblBillNo=new JLabel("Bill No:");
			lblBillNo.setFont(f2);
			
			lblBillDate=new JLabel("Bill Date:");
			lblBillDate.setFont(f2);
			
			lblItemCode=new JLabel("Item Code");
			lblItemCode.setFont(f2);
			
			lblCustomerName=new JLabel("CustomerName:");
			lblCustomerName.setFont(f2);
			
			lblItemName=new JLabel("Item Name");
			lblItemName.setFont(f2);
			
			lblPPU=new JLabel("Price per Unit");
			lblPPU.setFont(f2);
			
			lblQuantity=new JLabel("Quantity");
			lblQuantity.setFont(f2);
			
			lblDiscount=new JLabel("Discount:");
			lblDiscount.setFont(f2);
			
			lblTotal=new JLabel("Total:");
			lblTotal.setFont(f2);
			
			c.add(lblHeading);
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(lblBillNo);
			c.add(new JLabel(""+ob1.getBillNo()));
			c.add(lblBillDate);
			c.add(new JLabel(""+ob1.getBldt()));
			c.add(lblCustomerName);
			c.add(new JLabel(""+ob1.getCustomerName()));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(lblItemCode);
			c.add(lblItemName);
			c.add(lblQuantity);c.add(lblPPU);
			c.add(new JLabel(""+ob1.getItemCode()));
			c.add(new JLabel(""+ob1.getItemDsc()));
			c.add(new JLabel(""+ob1.getQuantity()));
			c.add(new JLabel(""+ob1.getPricePU()));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(lblDiscount);
			c.add(new JLabel(""+ob1.getDiscount()));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(lblTotal);
			c.add(new JLabel(""+ob1.getTotalPrice()));
			c.add(new JLabel(""));
			c.add(new JLabel(""));
			c.add(btnPrint);
			c.add(btnExit);
			
			
			
		}
				
		
		btnPrint.addActionListener((e) -> {
			
			JOptionPane.showMessageDialog(null, "Thankyou for printing");
			
				
		});
		
		btnExit.addActionListener((e)->{
			System.exit(0);
			
		});
			
		setSize(500,400);
		setLocation(300,200);
		//setResizable(false);
		setVisible(true);
	}*/
	
}

