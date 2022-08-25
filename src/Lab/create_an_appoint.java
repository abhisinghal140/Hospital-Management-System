package Lab;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Frame.Frame_Create;

public class create_an_appoint implements ActionListener{
    Frame_Create frame;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1;
    JButton b2;
    JButton b3;
    public create_an_appoint() {
    	JLabel l1=new JLabel();
    	JLabel l2=new JLabel();
    	JLabel l3=new JLabel();
    	t1=new JTextField();
    	t2=new JTextField();
    	t3=new JTextField();
    	b1=new JButton();
    	b2=new JButton();
    	b3=new JButton();
    	l1.setBounds(60, 70, 140, 30);
    	l1.setText("Enter Patient's ID:");
    	t1.setBounds(210, 70, 120, 30);
    	l2.setBounds(60, 120, 140, 30);
    	l2.setText("Enter Test ID:");
    	t2.setBounds(210, 120, 120, 30);
    	b1.setBounds(160,170,100,30);
    	b1.setText("Submit");
    	b1.setFocusable(false);
    	b2.setBounds(260, 0, 140, 40);
    	b2.setText("Medicine List");
    	b2.setFocusable(false);
    	b3.setBounds(0,0,70, 40);
  	    b3.setText("Back");
  	    b3.setBackground(Color.BLACK);
  	    b3.setForeground(Color.cyan);
  	    b3.setBorderPainted(false);
  	    b3.addActionListener(this);
  	    b3.setFocusable(false);
    	frame=new Frame_Create();
    	frame.setLayout(null);
    	frame.setSize(400,250);
    	frame.add(l1);
    	frame.add(t1);
    	frame.add(l2);
    	frame.add(t2);
    	frame.add(b1);
    	frame.add(b2);
    	frame.add(b3);
    	frame.setVisible(true);
    }
    public static void main(String [] args) {
    	create_an_appoint a=new create_an_appoint();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b3) {
			Lab_Appointment l=new Lab_Appointment();
			frame.dispose();
			l.Window();
		}
	}
}
