package MyTodo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title extends JPanel{

	Color lightColor = new Color(252, 221, 176);
	JLabel text;
	Title(){
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(lightColor);
		
		text=new JLabel("To Do List");
		text.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
		text.setHorizontalAlignment(JLabel.CENTER);
		this.add(text);
		
	}
}
