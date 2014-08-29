package gui;

import guiInterface.StartMenuListeners;

import javax.swing.*;

import java.awt.*;
import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.*;

/**
 * The start menu GUI for the game.
 * 
 * @author Lewis_000 && Thompson_002
 * @version 1.01
 */
public class StartMenu 
{
	/**
	 * A Media object to run through the media player.
	 */
	private Media music;
	
	/**
	 * A MediaPlayer object to play the Media objects.
	 */
	private MediaPlayer mediaPlayer;
	
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
		//A JFXPanel to jump-start the toolkit required to play music.
		new JFXPanel();
		
		//Setting up the Media object with the correct path to the mp3 as well as 
		//linking it to the MediaPlayer itself.
		music = new Media(new File("music\\intro.mp3").toURI().toString());
		mediaPlayer = new MediaPlayer(music);
		
		guiFrame = new JFrame();
		fittingPanel = new JPanel();
		btnPanel = new JPanel();
		NewGameBtn = new JButton();
		LoadBtn = new JButton();
		
		setup();
		mediaPlayer.play();
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
	
	/**
	 * Closes the StartMenu without conflicting with music settings
	 * (keeps the actual resource alive).
	 */
	public static void Close()
	{
		guiFrame.setVisible(false);
	}
	
	/**
	 * Re-opens the panel without causing multiple threads of music
	 * to play at once.
	 */
	public static void Open()
	{
		guiFrame.setVisible(true);
	}
	
	/**
	 * Finally kills the panel and all of its resource
	 * allocations once the game starts.
	 */
	public static void Destroy()
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