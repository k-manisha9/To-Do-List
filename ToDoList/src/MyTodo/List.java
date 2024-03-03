package MyTodo;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel {
	
	Color lightColor = new Color(252,221,176);
	List(){
		
		GridLayout layout=new GridLayout(10,1);
		layout.setVgap(5);
		this.setLayout(layout);
		this.setBackground(lightColor);	
		
	}
	public void updateNumbers() {
		
		Component[]listItems=this.getComponents();
		for(int i=0;i<listItems.length;i++) {
			if(listItems[i] instanceof Task) {
				((Task)listItems[i]).changeIndex(i+1);
			}
			
		}
	}
	public void removeTask() {
		
		for(Component c:getComponents()) {
			if(c instanceof Task) {
				if(((Task)c).getState()) {
					remove (c);
					updateNumbers();
				}
			}
			
		}
	}

}
