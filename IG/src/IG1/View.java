package IG1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View implements ActionListener{
	
	private static String labelPrefix = "Pseudo";
	final static String LOOKANDFEEL = "GTK+";
	
	public void Fram() {
		JButton button = new JButton("");
	}
	
	private static void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("Chat");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello world");
		frame.getContentPane().add(label);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}