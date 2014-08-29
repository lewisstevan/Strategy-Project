package guiInterface;

import gui.GameplaySettingsMenu;
import gui.StartMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to hold the various button listeners associated with the GameplaySettingsMenu
 * @author lewis_000
 * @version 1.01
 */
public class GamePlaySettingsMenuListeners {
	
	/**
	 * The Back button listener
	 * @author lewis_000
	 * @version 1.01
	 */
	public class BackButtonListener implements ActionListener {
		/**
		 * Describes the action to be taken by this listener should it be called.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			StartMenu.Open();
			GameplaySettingsMenu.Close();
		}	
	}	
	
	/**
	 * The new game button listener.
	 * @author lewis_000
	 * @version 1.01
	 */
	public class NewGameButtonListener implements ActionListener {
		/**
		 * Describes the action to be taken by this listener should it be called.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			//Add unimplemented action of loading the strategic map with the selected elements.
			
		}	
	}
}
