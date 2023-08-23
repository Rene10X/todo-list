package todoList;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	Panel panel;
	
	Frame(){
		panel = new Panel();
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
