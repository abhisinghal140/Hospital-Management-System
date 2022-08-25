package Medicines;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Frame.Frame_Create;
import Launchpage1.Launchpage1;

public class Pharmacy implements ActionListener{
   Frame_Create frame;
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
   JTextField t1;
   JTextField t2;
   public Pharmacy() {
	   JLabel l1=new JLabel();
	   JLabel l2=new JLabel();
	   t1=new JTextField();
	   t2=new JTextField();
	   b1=new JButton();
	   b2=new JButton();
	   b3=new JButton();
	   b4=new JButton();
	   l1.setBounds(70,60,140,30);
	   l1.setText("Enter Patient's ID:");
	   t1.setBounds(220,60, 100,30);
	   l2.setBounds(70, 100,140,30);
	   t2.setBounds(220, 100, 100,30);
	   l2.setText("Enter Medicine's ID:");
	   b1.setBounds(70,140,110,30);
	   b1.setText("ADD MORE");
	   b1.setFocusable(false);
	   b1.addActionListener(this);
	   b2.setBounds(250,140,130,30);
	   b2.setText("TOTAL COST");
	   b2.setFocusable(false);
	   b3.setBounds(240,0,140,30);
	   b3.setText("Medicine List");
	   b3.setFocusable(false);
	   b4.setBounds(0, 0, 70, 40);
	   b4.setText("Back");
	   b4.setBackground(Color.BLACK);
	   b4.setForeground(Color.cyan);
	   b4.setBorderPainted(false);
	   b4.setFocusable(false);
	   b4.addActionListener(this);
	   frame=new Frame_Create();
	   frame.setSize(400,230);
	   frame.add(l1);
	   frame.add(t1);
	   frame.add(l2);
	   frame.add(t2);
	   frame.add(b1);
	   frame.add(b2);
	   frame.add(b3);
	   frame.add(b4);
	   frame.setVisible(true);
   }
   @Override
    public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	   if(e.getSource()==b1) {
		   Pharmacy p1=new Pharmacy();
		   frame.dispose();
	   }
	   else if(e.getSource()==b4) {
		   Launchpage1 l=new Launchpage1();
	   }
    }
}
