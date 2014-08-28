package guiInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.GameplaySettingsMenu;

/**
 * Contains the various ActionListeners associated with the StartMenu class.
 * 
 * @author Lewis_000 && Thompson_002
 * @version 1.01
 */
public class StartMenuListeners {
	
	/**
	 * An ActionListener for the StartMenu's start button.
	 */
    public class StartButtonListener implements ActionListener {
		
		/**
		 * The operation performed when the Start button of the StartMenu is clicked.
		 * @param e the incoming event.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			// how to close StartMenu ???
			new GameplaySettingsMenu();
		}
	} // end of StartButtonListener inner class
    
    /**
	 * An ActionListener for the StartMenu's options button.
	 */
    public class OptionsButtonListener implements ActionListener {
		
		/**
		 * The operation performed when the Options button of the StartMenu is clicked.
		 * @param e the incoming event.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			// implement this feature later
		}
	} // end of OptionsButtonListener inner class
} // end of StartMenuListeners class