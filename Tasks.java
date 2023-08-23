package todoList;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tasks extends JPanel{
	
	JLabel tasksLabel;
	JLabel[] listOfTasks = new JLabel[8];
	final int MAX_AMOUNT_OF_TASKS = 8;
	
	Tasks(){
		this.setBounds(0, 100, 600, 550);
		this.setBackground(Color.gray);
		this.setLayout(null);
		
		initializeTasksLabel();		
	}

	private void initializeTasksLabel() {
		tasksLabel = new JLabel("Tasks");
		tasksLabel.setBounds(250, 20, 70, 30);
		tasksLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		
		this.add(tasksLabel);		
	}

	public void createTask(String taskName) {
		
		int freeSpot = -1;
		for(int i = 0; i < MAX_AMOUNT_OF_TASKS; i++) {
			if(listOfTasks[i] == null) {
				freeSpot = i;
				break;
			}
		}
		
		if(freeSpot != -1) {
			
			
			JLabel task = new JLabel(taskName);
			task.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			
			

			if(freeSpot != -1) {
				listOfTasks[freeSpot] = task;
			}
			
			int offsetY = freeSpot * 50;
			
			task.setBounds(50, 100 + offsetY, 350, 40);
			
			this.add(task);
			this.repaint();
		} 
		
		
	}

}
