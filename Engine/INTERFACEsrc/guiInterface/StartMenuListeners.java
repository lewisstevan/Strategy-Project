package guiInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Contains the various ActionListeners associated with the StartMenu class.
 * 
 * @author Stevan Lewis
 * @author Reid Thompson (restructuring)
 * @version 20140825
 */
public class StartMenuListeners {
	
	/**
	 * An ActionListener for the StartMenu's start button.
	 * 
	 * @author Reid Thompson
	 * @version 20140825
	 */
    public class StartButtonListener implements ActionListener {
		
		/**
		 * The operation performed when the Start button of the StartMenu is clicked.
		 * @param e the incoming event.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			// construct GameGUI object
		}
	} // end of StartButtonListener inner class
    
    /**
	 * An ActionListener for the StartMenu's options button.
	 * 
	 * @author Reid Thompson
	 * @version 20140825
	 */
    public class OptionsButtonListener implements ActionListener {
		
		/**
		 * The operation performed when the Options button of the StartMenu is clicked.
		 * @param e the incoming event.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) {
			// construct DisplayOptionsGUI object
		}
	} // end of OptionsButtonListener inner class
} // end of StartMenuListeners class