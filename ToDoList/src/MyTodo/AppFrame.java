package MyTodo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame implements ActionListener {

	private Footer ft;
	private Title title;
	private List list;
	
	JButton newTask,clear;
	
	AppFrame(){
		
		this.setVisible(true);
		this.setTitle("To Do List");
		this.setSize(800,650);
		this.setLocation(300,150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		title=new Title();
		list=new List();
		ft=new Footer();
		
		this.add(title,BorderLayout.NORTH);
		this.add(ft,BorderLayout.SOUTH);
		this.add(list,BorderLayout.CENTER);
		
		newTask=ft.getadded();
		clear=ft.getclear();
		
		newTask.addActionListener(this);
		clear.addActionListener(this);
		
	}
	public static void main(String args[]) {
		new AppFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==newTask) {
			Task task=new Task();
			list.add(task);
			list.updateNumbers();
			task.getDone().addMouseListener(new MouseAdapter() {
				
				public void mousePressed(MouseEvent e) {
					task.changeState();
					list.updateNumbers();
					revalidate();
					
				}
				
			});
		}
		else if(e.getSource()==clear) {
			clear.addMouseListener(new MouseAdapter() {
				
				public void mousePressed(MouseEvent e) {
					list.removeTask();
					repaint();
				}
			});
		}
		
	}
}
