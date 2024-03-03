package MyTodo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel {
	JButton addTask,clear;
	Color orange = new Color(233, 133, 128);
	Color lightColor = new Color(252, 221, 176);
	Border emptyBorder = BorderFactory.createEmptyBorder();
	Footer(){
		
		this.setBackground(lightColor);
		this.setPreferredSize(new Dimension(400,100));
		
		addTask=new JButton("Add Task");
		addTask.setPreferredSize(new Dimension(200,50));
		addTask.setBackground(orange);
		addTask.setBorder(emptyBorder);
		addTask.setVerticalAlignment(JButton.BOTTOM);
		addTask.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		this.add(addTask);
		
		clear=new JButton("Clear Finished Tasks");
		clear.setPreferredSize(new Dimension(400,50));
		clear.setBackground(orange);
		clear.setBorder(emptyBorder);
		clear.setVerticalAlignment(JButton.BOTTOM);
		clear.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		this.add(clear);
		
		
	}
	public  JButton getadded() {
		return addTask;
	}
	
	public  JButton getclear() {
		return clear;
	}
	

}
