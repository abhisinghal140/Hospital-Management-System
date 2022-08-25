package Launchpage1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import OPD.Appointment;
import Ward.Ward_Given;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import Frame.Frame_Create;
import Lab.Lab_Appointment;
import Medicines.Authorisation;
//import Medicines.Pharmacy;

import java.awt.Color;
//import java.awt.Dimension;
public class Launchpage1 implements ActionListener{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	Frame_Create frame;
     public Launchpage1() {
	 frame=new Frame_Create();
	 JLabel label=new JLabel();
	 label.setBounds(100, 50, 200, 250);
	 //label.setText("Hi i am Sajal");
	 b1=new JButton();
	 b2=new JButton();
	 b3=new JButton();
	 b4=new JButton();
	 b5=new JButton();
	 //ImageIcon i=new ImageIcon("/Image/back.jpg");
	 b1.setText("OPD");
	 b1.setBounds(50,10,130, 40);
	 b1.setFocusable(false);
	 b1.addActionListener(this);
	 b2.setText("LAB");
	 b2.setBounds(50,60,130,40);
	 b2.setFocusable(false);
	 b2.addActionListener(this);
	 b3.setText("Ward");
	 b3.setBounds(50, 110, 130, 40);
	 b3.setFocusable(false);
	 b3.addActionListener(this);
	 b4.setText("Pharmacy");
	 b4.setFocusable(false);
	 b4.setBounds(50, 160, 130, 40);
	 b4.addActionListener(this);
	 b5.setText("Back");
	 //b5.setIcon(new ImageIcon("/Images/back.jpg"));
	 b5.setFocusable(false);
	 b5.setForeground(Color.cyan);
	 b5.setBounds(0, 0, 70, 40);
	 b5.setBorderPainted(false);
	 b5.setBackground(Color.BLACK);
	 b5.addActionListener(this);
	 label.add(b1);
	 label.add(b2);
	 label.add(b3);
	 label.add(b4);
	 //label.setIcon(i);
	 frame.add(b5);
	 frame.add(label);
	 frame.setSize(420, 350);
	 frame.setVisible(true);
   }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
	  Appointment a=new Appointment();
	  frame.dispose();
	  a.Window();
	}
	else if(e.getSource()==b2) {
	  Lab_Appointment l=new Lab_Appointment();
	  frame.dispose();
	  l.Window();
	}
	else if(e.getSource()==b3) {
	  Ward_Given g=new Ward_Given();
	  frame.dispose();
	  g.Window();
	}
	else if(e.getSource()==b4) {
		Authorisation a=new Authorisation();
		frame.dispose();
	}
	else if(e.getSource()==b5) {
	  System.exit(0);  
	}
  }	
public static void main(String [] args) {
    Launchpage1 l=new Launchpage1();	
 }
}
   
