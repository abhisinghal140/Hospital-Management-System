package Ward;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Frame.Frame_Create;

public class Window_2 implements ActionListener{
    Frame_Create frame;
    JTextField t1;
    JButton b1;
    JButton b2;
    public Window_2() {
       frame=new Frame_Create();
  	   JLabel l1=new JLabel();
  	   t1=new JTextField();
  	   b1=new JButton();
  	   b2=new JButton();
  	   l1.setBounds(90, 50, 140, 30);
  	   l1.setText("Enter Room No.:");
  	   t1.setBounds(240, 50, 100,30);
  	   b1.setBounds(130, 100,160 ,30);
  	   b1.setText("Check Avalibility");
  	   b1.setFocusable(false);
  	   b1.addActionListener(this);
  	   b2.setBounds(0, 0, 70,30);
	   b2.setText("BACK");
	   b2.setBackground(Color.BLACK);
	   b2.setForeground(Color.cyan);
	   b2.setFocusable(false);
	   b2.setBorderPainted(false);
	   b2.addActionListener(this);
  	   frame.setSize(400,190);
  	   frame.add(l1);
  	   frame.add(t1);
  	   frame.add(b1);
  	   frame.add(b2);
  	   frame.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			lets_appoint a=new lets_appoint();
			frame.dispose();
		}
		else if(e.getSource()==b2) {
			Appoint_a_ward a=new Appoint_a_ward();
			frame.dispose();
		}
	}
}
