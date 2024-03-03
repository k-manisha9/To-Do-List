package MyTodo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {

	JLabel index;
	JTextField tfname;
	JButton done;
	Color pink = new Color(255, 161, 161);
	Color green = new Color(188, 226, 158);
	Color doneColor = new Color(233,119,119);
	public boolean checked;
	Task(){
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(pink);
		
		checked=false;
		
		index=new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setFont(new Font("Times New Roman",Font.BOLD,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		
		tfname=new JTextField("");
		tfname.setBorder(BorderFactory.createEmptyBorder());
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		tfname.setBackground(pink);
//		tfname.setMargin(new java.awt.Insets(50, 20, 0, 0));
		this.add(tfname);
		
		done=new JButton("Done");
		done.setPreferredSize(new Dimension(80,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setFont(new Font("Times New Roman",Font.BOLD,20));
		done.setBackground(doneColor);
		done.setFocusPainted(false);
		this.add(done,BorderLayout.EAST);
		
	}
	public void changeIndex(int n) {
		
		this.index.setText(n+"");
		this.revalidate();//refresh
	}

	public boolean getState() {
		return checked;
	}
	public JButton getDone() {
		return done;
	}
	public void changeState() {
		this.setBackground(green);
		tfname.setBackground(green);
		checked=true;
		this.revalidate();//refresh
	}
}
