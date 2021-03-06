package guiInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.GameplaySettingsMenu;
import gui.StartMenu;

/**
 * Contains the various ActionListeners associated with the StartMenu class.
 * 
 * @author Lewis_000 && Thompson_002
 * @version 1.01
 */
public class StartMenuListeners 
{
	
	/**
	 * Describes the ActionListener for the start button in StartMenu.java
	 * @author Thompson_002 & Lewis_000
	 * @version 1.04
	 */
    public class StartButtonListener implements ActionListener 
    {
		/**
		 * The operation performed when the Start button of the StartMenu is clicked.
		 * @param e the incoming event.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) 
		{
			StartMenu.Close();
			new GameplaySettingsMenu();
		}
	} 
    
    /**
	 * An ActionListener for the StartMenu's options button.
	 * @author Thompson_002 & Lewis_000
	 * @version 1.01
	 */
    public class OptionsButtonListener implements ActionListener {
		
		/**
		 * The operation performed when the Options button of the StartMenu is clicked.
		 * @param e the incoming event.
		 */
		@Override
		public void actionPerformed(final ActionEvent e) 
		{
			// implement this feature later
		}
	} 
}