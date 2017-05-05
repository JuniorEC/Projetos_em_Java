package Outros;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {

	public static void main(String[] args) {
		JLabel northLabel = new JLabel("North" );
		
		ImageIcon labelIcon = new ImageIcon("Tulips.jpg ");
		
		JLabel southLabel = new JLabel (labelIcon);
		
		southLabel.setText("South");
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		application.add(northLabel, BorderLayout.NORTH);
		application.add(southLabel, BorderLayout.SOUTH);
		
		application.setSize(300,300);
		application.setVisible(true);
	}

}
