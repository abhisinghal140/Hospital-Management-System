package Medicines;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Frame.Frame_Create;
import Launchpage1.Launchpage1;

public class Authorisation implements ActionListener{
   Frame_Create frame;
   JTextField t1;
   JTextField t2;
   JButton b1;
   JButton b2;
   public Authorisation() {
	   JLabel l1=new JLabel();
	   t1=new JTextField();
	   b1=new JButton();
	   b2=new JButton();
	   l1.setBounds(140,80,150,30);
	   l1.setText("Username:");
	   t1.setBounds(230,80,130,30);
	   JLabel l2=new JLabel();
	   t2=new JTextField();
	   l2.setBounds(140,130,150,30);
	   l2.setText("Password:");
	   t2.setBounds(230,130,130,30);
	   b1.setBounds(210, 180, 90, 30);
	   b1.setText("Submit");
	   b1.setFocusable(false);
	   b1.addActionListener(this);
	   b2.setBounds(0, 0, 70, 40);
	   b2.setText("Back");
	   b2.setBackground(Color.BLACK);
	   b2.setForeground(Color.cyan);
	   b2.setBorderPainted(false);
	   b2.setFocusable(false);
	   b2.addActionListener(this);
	   frame=new Frame_Create();
	   frame.setSize(500,280);
	   frame.add(l1);
	   frame.add(t1);
	   frame.add(l2);
	   frame.add(t2);
	   frame.add(b1);
	   frame.add(b2);
	   frame.setVisible(true);
   }
   public static void main(String [] args) {
	   Authorisation a=new Authorisation();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
        if(e.getSource()==b1) {
        	String s="Pharmacy";
        	String p="123456";
        	String usnm=t1.getText();
        	String psswr=t2.getText();
        	if(usnm.equalsIgnoreCase(s) && psswr.equals(p)) {
        		Pharmacy pop=new Pharmacy();
        		frame.dispose();
        	}
        	else {
        		JOptionPane j=new JOptionPane();
        		j.showMessageDialog(null, "Username or Password is Wrong","Error" ,JOptionPane.ERROR_MESSAGE);        		
        	}
        }
        else if(e.getSource()==b2) {
        	Launchpage1 l=new Launchpage1();
        	frame.dispose();
        }
   }
}
