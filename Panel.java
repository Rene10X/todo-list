package todoList;

import java.awt.Dimension;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	int SCREEN_WIDTH = 600;
	int SCREEN_HEIGHT = 650;
	
	TaskCreator taskCreator;
	Tasks tasks;
	
	Panel(){
		tasks = new Tasks();
		taskCreator = new TaskCreator(tasks);
		
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setLayout(null);
		this.add(tasks);
		this.add(taskCreator);
	}
	
}
