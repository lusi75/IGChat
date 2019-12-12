package IG1;
//BOX LAYOUT A FINIR
/*
 * SwingApplication.java is a 1.4 example that requires
 * no other files.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConnectionView implements ActionListener{
	
	final JLabel labelPseudo = new JLabel("Pseudo :");
	final JLabel labelBut = new JLabel("Connexion !");
	final static String LOOKANDFEEL = "GTK+";
	
	public Component createComponents() {
		JButton button = new JButton("Connexion !");
		button.setMnemonic(KeyEvent.VK_I);
		button.addActionListener(this);
		labelBut.setLabelFor(button);
		
		JPanel listPane = new JPanel();
		JPanel pane = new JPanel(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
		//pane.setMaximumSize(new Dimension(100,50));
		JTextField textPseudo = new JTextField();
		listPane.add(labelPseudo);
		listPane.add(textPseudo);
		//JPanel pane = new JPanel(new GridLayout(0,1));
		listPane.add(button);
		pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		return pane;
	}
	
	public void actionPerformed(ActionEvent event) {
        //Connexion
    }
	
    private static void initLookAndFeel() {
        
        // Swing allows you to specify which look and feel your program uses--Java,
        // GTK+, Windows, and so on as shown below.
        String lookAndFeel = null;
        
        if (LOOKANDFEEL != null) {
            if (LOOKANDFEEL.equals("Metal")) {
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            } else if (LOOKANDFEEL.equals("System")) {
                lookAndFeel = UIManager.getSystemLookAndFeelClassName();
            } else if (LOOKANDFEEL.equals("Motif")) {
                lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            } else if (LOOKANDFEEL.equals("GTK+")) { //new in 1.4.2
                lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
            } else {
                System.err.println("Unexpected value of LOOKANDFEEL specified: "
                        + LOOKANDFEEL);
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            }
            
            try {
                UIManager.setLookAndFeel(lookAndFeel);
            } catch (ClassNotFoundException e) {
                System.err.println("Couldn't find class for specified look and feel:"
                        + lookAndFeel);
                System.err.println("Did you include the L&F library in the class path?");
                System.err.println("Using the default look and feel.");
            } catch (UnsupportedLookAndFeelException e) {
                System.err.println("Can't use the specified look and feel ("
                        + lookAndFeel
                        + ") on this platform.");
                System.err.println("Using the default look and feel.");
            } catch (Exception e) {
                System.err.println("Couldn't get specified look and feel ("
                        + lookAndFeel
                        + "), for some reason.");
                System.err.println("Using the default look and feel.");
                e.printStackTrace();
            }
        }
    }
	
	private static void createAndShowGUI() {
        initLookAndFeel();
		
		//Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame frame = new JFrame("MessageApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(640, 480));
        
        ConnectionView app = new ConnectionView();
        Component contents = app.createComponents();
        contents.setSize(10,100);
        frame.getContentPane().add(contents, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
    }
	
	 public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}