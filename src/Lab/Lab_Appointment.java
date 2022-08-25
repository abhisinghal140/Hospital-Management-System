package Lab;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import Frame.Frame_Create;
import Launchpage1.Launchpage1;

public class Lab_Appointment implements ActionListener{
   Frame_Create frame;
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
	public void Window() {
	  JLabel label=new JLabel();
	  frame=new Frame_Create();
	  label.setBounds(50, 50,400 ,250);
	  b1=new JButton();
	  b1.setBounds(82, 20, 250, 40);
	  b1.setText("Set a LAB_APPOINTMENT");
	  b1.setFocusable(false);
	  b2=new JButton();
	  b2.setBounds(82, 70, 250, 40);
	  b2.setText("Search a LAB_APPOINTMENT");
	  b2.setFocusable(false);
	  b3=new JButton();
	  b3.setBounds(82, 120, 250, 40);
	  b3.setText("Cancel a LAB_APPOINTMENT");
	  b3.setFocusable(false);
	  b4=new JButton();
	  b4.setBounds(0,0,70, 40);
	  b4.setText("Back");
	  b4.setBackground(Color.BLACK);
	  b4.setForeground(Color.cyan);
	  b4.setBorderPainted(false);
	  b4.addActionListener(this);
	  b4.setFocusable(false);
	  label.add(b1);
	  label.add(b2);
	  label.add(b3);
	  frame.add(b4);
	  frame.setLayout(null);
	  frame.setSize(500,300);
	  frame.add(label);
	  frame.setVisible(true);
   }
   public static void main(String [] args) {
	   Lab_Appointment l1=new Lab_Appointment();
	   l1.Window();
   }
    @Override
    public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	   if(e.getSource()==b4) {
		   Launchpage1 l=new Launchpage1();
		   frame.dispose();
	   }
    }
}
