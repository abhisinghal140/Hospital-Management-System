package Ward;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Frame.Frame_Create;

public class lets_appoint implements ActionListener{
    Frame_Create frame;
	JTextField t1;
	JButton b1;
	JButton b2;
	JTextField t2;
	public lets_appoint() {
		   frame=new Frame_Create();
	  	   JLabel l1=new JLabel();
	  	   t1=new JTextField();
	  	   t2=new JTextField();
	  	   b1=new JButton();
	  	   b2=new JButton();
	  	   JLabel l2=new JLabel();
	  	   l1.setBounds(90, 50, 140, 30);
	  	   l1.setText("Enter Bed No.:");
	  	   l2.setBounds(90,90,140,30);
	  	   l2.setText("Date:");
	  	   t1.setBounds(240, 50, 100,30);
	  	   t2.setBounds(240, 90, 100, 30);
	  	   b1.setBounds(130, 140,140 ,30);
	  	   b1.setText("Done");
	  	   b1.setFocusable(false);
	  	   b1.addActionListener(this);
	  	   b2.setBounds(0, 0, 70,30);
		   b2.setText("BACK");
		   b2.setBackground(Color.BLACK);
		   b2.setForeground(Color.cyan);
		   b2.setFocusable(false);
		   b2.setBorderPainted(false);
		   b2.addActionListener(this); 
	  	   frame.setSize(400,220);
	  	   frame.add(l1);
	  	   frame.add(t1);
	  	   frame.add(l2);
	  	   frame.add(t2);
	  	   frame.add(b1);
	  	   frame.add(b2);
	  	   frame.setVisible(true);
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   if(e.getSource()==b2) {
			   Window_2 w=new Window_2();
			   frame.dispose();
		   }
	}
}
