package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton sourceBtn = (JButton) e.getSource();
		System.out.println(sourceBtn);
		String command = sourceBtn.getActionCommand();	
		System.out.println(command);
		
		
		if(command.equals("NB")) {
			
			System.out.println(">>>north");
			
		}else if (command.equals("SB")) {
			
			System.out.println(">>>south");
			
		}
		
	}

}
