package Frame;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame_Create extends JFrame{
	public Frame_Create() {
	  this.setSize(400,400);
	  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  this.setTitle("Hospital Management System");
	  this.getContentPane().setBackground(Color.WHITE);
	  this.setLayout(null);
	  //this.pack();
  }
}
