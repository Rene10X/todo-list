package todoList;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TaskCreator extends JPanel implements ActionListener{
	
	final int WIDTH = 600;
	final int HEIGHT = 100;
	
	Tasks tasks;
	
	JTextField inputField;
	JButton addTaskButton;
	
	TaskCreator(Tasks tasks){
		this.tasks = tasks;
		inputField = new JTextField();
		addTaskButton = new JButton("add task");
		
		this.setBounds(0, 0, WIDTH, HEIGHT);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		
		initializeInputField();		
		initializeAddTaskButton();
	}

	private void initializeAddTaskButton() {
		addTaskButton.setBounds(470, 35, 90, 30);
		addTaskButton.setFocusable(false);
		addTaskButton.addActionListener(this);
		
		this.add(addTaskButton);
	}

	private void initializeInputField() {		
		inputField.setBounds(70, 35, 350, 30);
		
		this.add(inputField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		tasks.createTask(inputField.getText());
		
	}
	
}
