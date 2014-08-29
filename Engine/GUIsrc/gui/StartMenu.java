package gui;

import guiInterface.StartMenuListeners;

import javax.swing.*;

import java.awt.*;

/**
 * The start menu GUI for the game.
 * 
 * @author Lewis_000 && Thompson_002
 * @version 1.01
 */
public class StartMenu 
{
	
	/**
	 * A Object containing the two ActionListeners for the StartMenu.
	 */
	private static final StartMenuListeners LISTENERS = new StartMenuListeners();
	
	/**
	 * A default Dimension value for all of the subpanels within the fitting panel.
	 */
	private static final Dimension DEFAULT_SUBPANEL_SIZE = new Dimension(120, 130);
	
	/**
	 * A default Dimension value for the two buttons within the buttons panel.
	 */
	private static final Dimension DEFAULT_BUTTON_SIZE = new Dimension(100, 50);
	
	
//	JFrame optionsFrame = new JFrame(); // currently not used
	
	/**
	 * The overall frame for this menu.
	 */
	static JFrame guiFrame;
	
	/**
	 * The containing panel for various subpanels.
	 */
	JPanel fittingPanel;
	
	/**
	 * A panel for the start and options buttons.
	 */
	JPanel btnPanel;
	
	/**
	 * The start button that brings the user to the GameplaySettingsMenu.
	 */
	JButton NewGameBtn;
	
	/**
	 * The option button that brings the user to another menu detailing various options.
	 */
	JButton LoadBtn; // listener functionality not yet implemented
	
	/**
	 * Initializes the menu's components.
	 */
	public StartMenu()
	{	
		guiFrame = new JFrame();
		fittingPanel = new JPanel();
		btnPanel = new JPanel();
		NewGameBtn = new JButton();
		LoadBtn = new JButton();
		
		setup();
	}
	
	/**
	 * Sets up the GUI's components.
	 */
	private void setup() 
	{
		// Setting up the guiFrame.
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Start Menu");
		guiFrame.setSize(600, 500); 
		guiFrame.setResizable(false);
		guiFrame.setLocationRelativeTo(null);
		guiFrame.setVisible(true);
		
		//Setting up the custom fitting panel
		fittingPanel.setPreferredSize(new Dimension(120, guiFrame.getHeight()));
		fittingPanel.setLayout(new BorderLayout());
		
		// Setting up and adding the button sub-panel to the fitting panel
		btnPanel.setPreferredSize(DEFAULT_SUBPANEL_SIZE); 
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.PAGE_AXIS));
		
		
		// Setting up the start button
		NewGameBtn.setMaximumSize(DEFAULT_BUTTON_SIZE); 
		NewGameBtn.setText("New Game");
		NewGameBtn.addActionListener(LISTENERS.new StartButtonListener());
		
		// Setting up the options button
		LoadBtn.setMaximumSize(DEFAULT_BUTTON_SIZE); 
		LoadBtn.setText("Load Game");
		LoadBtn.addActionListener(LISTENERS.new OptionsButtonListener());
		
		//Adding components to JFrame
		guiFrame.add(fittingPanel, BorderLayout.EAST);
		fittingPanel.add(btnPanel, BorderLayout.SOUTH);
		
		// Adding the buttons to the button panel (including rigid areas for spacing)
		btnPanel.add(Box.createRigidArea(new Dimension(16, 10))); // changed from 30, 100
		btnPanel.add(NewGameBtn);
		btnPanel.add(Box.createRigidArea(new Dimension(16, 10))); // changed from 30, 100
		btnPanel.add(LoadBtn);
		
		//Sets the focus of the gui.
		guiFrame.getRootPane().setDefaultButton(NewGameBtn);
		addFeatures();
	}
	
	/**
	 * Adds music and concept art.
	 */
	private void addFeatures() 
	{
		// add music
		// add concept art to sides of main frame
	}
	
	public static void Close()
	{
		guiFrame.dispose();
	}
	
	
	
	/**
	 * Begins the Strategy Project GUI (only use for testing, delete afterwards).
	 * 
	 * @param args are ignored.
	 */
	public static void main(String[] args)
	{
		new StartMenu();
	}
} 