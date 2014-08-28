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
	private static final Dimension DEFAULT_SUBPANEL_SIZE = new Dimension(200, 500);
	
	/**
	 * A default Dimension value for the two buttons within the buttons panel.
	 */
	private static final Dimension DEFAULT_BUTTON_SIZE = new Dimension(150, 100);
	
	/**
	 * A default String for the title of this game.
	 */
	private static final String DEFAULT_GAME_TITLE = "Our Strategy Game";
	
//	JFrame optionsFrame = new JFrame(); // currently not used
	
	/**
	 * The overall frame for this menu.
	 */
	JFrame guiFrame;
	
	/**
	 * The containing panel for various subpanels.
	 */
	JPanel fittingPanel;
	
	/**
	 * A panel for the start and options buttons.
	 */
	JPanel btnPanel;
	
	/**
	 * The first panel for concept art.
	 */
	JPanel artPanel1;
	
	/**
	 * The second panel for concept art.
	 */
	JPanel artPanel2;
	
	/**
	 * A panel used to display the title of the game.
	 */
	JPanel titlePanel;
	
	/**
	 * The start button that brings the user to the GameplaySettingsMenu.
	 */
	JButton startBtn;
	
	/**
	 * The option button that brings the user to another menu detailing various options.
	 */
	JButton optionsBtn; // listener functionality not yet implemented
	
	/**
	 * A label to hold and display the game title text.
	 */
	JLabel titleLabel;
	
	/**
	 * Initializes the menu's components.
	 */
	public StartMenu()
	{	
		guiFrame = new JFrame();
		fittingPanel = new JPanel();
		btnPanel = new JPanel();
		artPanel1 = new JPanel();
		artPanel2 = new JPanel();
		titlePanel = new JPanel();
		startBtn = new JButton();
		optionsBtn = new JButton();
		titleLabel = new JLabel();
		
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
		guiFrame.setSize(600, 600); // changed size from 500, 500 to more easily divide
								    // overall frame into thirds
		guiFrame.setResizable(false);
		guiFrame.setLocationRelativeTo(null);
		guiFrame.setVisible(true);
		
		// Setting up and adding the title panel
		titlePanel.setSize(new Dimension(200, 100));
		titlePanel.setLayout(new BorderLayout());
		guiFrame.add(titlePanel, BorderLayout.NORTH);
		
		// Setting up and adding the title label to the title panel
		titleLabel.setText(DEFAULT_GAME_TITLE);
		titlePanel.add(titleLabel, BorderLayout.CENTER);
		
		// Setting up and adding the fitting panel, changed its layout from Border to Flow
		guiFrame.add(fittingPanel, BorderLayout.CENTER); // changed from BorderLayout.EAST
		
		// Setting up and adding the first art subpanel to the fitting panel
		artPanel1.setSize(DEFAULT_SUBPANEL_SIZE); // changed from setPreferredSize()
		fittingPanel.add(artPanel1);
		
		// Setting up and adding the button subpanel to the fitting panel
		btnPanel.setSize(DEFAULT_SUBPANEL_SIZE); // changed from setPreferredSize()
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.PAGE_AXIS));
		fittingPanel.add(btnPanel); // changed from BorderLayout.SOUTH
		
		// Setting up the start button, changed from Dimension(100, 40)
		startBtn.setSize(DEFAULT_BUTTON_SIZE); // changed from setMaximumSize()
		startBtn.setText("Start");
		startBtn.addActionListener(LISTENERS.new StartButtonListener());
		
		// Setting up the options button, changed from Dimension(100, 40)
		optionsBtn.setSize(DEFAULT_BUTTON_SIZE); // changed from setMaximumSize()
		optionsBtn.setText("Options");
		optionsBtn.addActionListener(LISTENERS.new OptionsButtonListener());
				
		// Adding the buttons to the button panel (including rigid areas for spacing)
		btnPanel.add(Box.createRigidArea(new Dimension(25, 100))); // changed from 30, 100
		btnPanel.add(startBtn);
		btnPanel.add(Box.createRigidArea(new Dimension(25, 100))); // changed from 30, 100
		btnPanel.add(optionsBtn);
		
		// Setting up and adding the second art subpanel to the fitting panel
		artPanel2.setSize(DEFAULT_SUBPANEL_SIZE);
		fittingPanel.add(artPanel2);
		
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
	
	/*
	 * I think opening the optionsMenu should be left to the options button's listener.
	 */
//	public static void OpenOptionsMenu()
//	{
//		//optionsFrame.setdefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
	
	/**
	 * Begins the Strategy Project application.
	 * 
	 * @param args are ignored.
	 */
	public static void main(String[] args)
	{
		new StartMenu();
	}
} // end of StartMenu class