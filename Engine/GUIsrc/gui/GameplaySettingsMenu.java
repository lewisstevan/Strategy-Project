package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * The gameplay settings menu for the game.
 * 
 * @author Thompson_000
 * @version 1.01
 */
public class GameplaySettingsMenu 
{

	/**
	 * A default Dimension for the fittingPanel's subpanels.
	 */
	private static final Dimension DEFAULT_SUBPANEL_SIZE = new Dimension(100, 100);
	
	/**
	 * A default Dimension for the subpanels' radio buttons.
	 */
	private static final Dimension DEFAULT_BUTTON_SIZE = new Dimension(20, 80);
	
	/**
	 * The overall frame for this menu.
	 */
	JFrame guiFrame;
	
	/**
	 * A containing panel for various subpanels.
	 */
	JPanel fittingPanel;
	
	/**
	 * A panel containing the starting race selections.
	 */
	JPanel racePanel;
	
	/**
	 * A panel containing the AI (computer) difficulty settings.
	 */
	JPanel aiDifficultyPanel;
	
	/**
	 * A panel containing the map size selections.
	 */
	JPanel mapSizePanel;
	
	/**
	 * A panel containing the map's resource density selections.
	 */
	JPanel resourceDensityPanel;
	
	/**
	 * A filler panel (for now).
	 */
	JPanel fillerPanel;
	
	/**
	 * A panel for the start game button.
	 */
	JPanel startGamePanel;
	
	/**
	 * A button to start the game.
	 */
	JButton startGameButton; // no listener currently attached
	
	/**
	 * Initializes the menu's components.
	 */
	public GameplaySettingsMenu() 
	{
		guiFrame = new JFrame();
		fittingPanel = new JPanel();
		racePanel = new JPanel();
		aiDifficultyPanel = new JPanel();
		mapSizePanel = new JPanel();
		resourceDensityPanel = new JPanel();
		fillerPanel = new JPanel();
		startGamePanel = new JPanel();
		startGameButton = new JButton();
		
		setup();
	}
	
	/**
	 * Sets up the GUI's components.
	 */
	private void setup() 
	{
		// Setting up the guiFrame.
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Gameplay Settings Menu");
		guiFrame.setSize(600, 600); // fits nicely with GridLayout
		guiFrame.setResizable(false);
		guiFrame.setLocationRelativeTo(null);
		guiFrame.setVisible(true);
		
		// add titlePanel with titleLabel like StartMenu?
		
		// Setting up and adding the fittingPanel
		fittingPanel.setLayout(new GridLayout(3, 3));
		guiFrame.add(fittingPanel, BorderLayout.CENTER);
		
		// Sets up all subpanels of the fittingPanel
		setupRacePanel();
		setupAIDifficultyPanel();
		setupMapSizePanel();
		setupResourceDensityPanel();
		fillerPanel.setSize(DEFAULT_SUBPANEL_SIZE); // add functionality, define purpose
													// possible use: concept art display?
		setupStartGamePanel();
		
		// Adds all subpanels to the fittingPanel
		fittingPanel.add(racePanel);
		fittingPanel.add(aiDifficultyPanel);
		fittingPanel.add(mapSizePanel);
		fittingPanel.add(resourceDensityPanel);
		fittingPanel.add(fillerPanel);
		fittingPanel.add(startGamePanel);
	}
	
	/**
	 * Sets up the racePanel and its buttons.
	 */
	private void setupRacePanel() 
	{
		// Sets attributes of the racePanel
		racePanel.setSize(DEFAULT_SUBPANEL_SIZE);
		racePanel.setLayout(new BoxLayout(racePanel, BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially Knight Race button is selected
		final JRadioButton knightRace = new JRadioButton("Knight Race", true);
		knightRace.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton techRace = new JRadioButton("Tech Race");
		techRace.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton mageRace = new JRadioButton("Mage Race");
		mageRace.setSize(DEFAULT_BUTTON_SIZE);
		
		// Adds buttons to buttonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(knightRace);
		group.add(techRace);
		group.add(mageRace);
		
		// Adds buttons to panel (includes rigid areas for spacing)
		racePanel.add(Box.createRigidArea(new Dimension(100, 10)));
		racePanel.add(knightRace);
		racePanel.add(techRace);
		racePanel.add(mageRace);
	}
	
	/**
	 * Sets up the aiDifficultyPanel and its buttons.
	 */
	private void setupAIDifficultyPanel() 
	{
		// Sets attributes of the aiDifficultyPanel
		aiDifficultyPanel.setSize(DEFAULT_SUBPANEL_SIZE);
		aiDifficultyPanel.setLayout(new BoxLayout(aiDifficultyPanel, BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially Easy button is selected
		final JRadioButton easyDiff = new JRadioButton("Easy Difficulty", true);
		easyDiff.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton medDiff = new JRadioButton("Medium Difficulty");
		medDiff.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton hardDiff = new JRadioButton("Hard Difficulty");
		hardDiff.setSize(DEFAULT_BUTTON_SIZE);
		
		// Adds buttons to buttonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(easyDiff);
		group.add(medDiff);
		group.add(hardDiff);
		
		// Adds buttons to panel (includes rigid areas for spacing)
		aiDifficultyPanel.add(Box.createRigidArea(new Dimension(100, 10)));
		aiDifficultyPanel.add(easyDiff);
		aiDifficultyPanel.add(medDiff);
		aiDifficultyPanel.add(hardDiff);
	}
	
	/**
	 * Sets up the mapSizePanel and its buttons.
	 */
	private void setupMapSizePanel()
	{
		// Sets attributes of the mapSizePanel
		mapSizePanel.setSize(DEFAULT_SUBPANEL_SIZE);
		mapSizePanel.setLayout(new BoxLayout(mapSizePanel, BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially smallSize button is selected
		final JRadioButton smallSize = new JRadioButton("Small Size", true);
		smallSize.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton medSize = new JRadioButton("Medium Size");
		medSize.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton largeSize = new JRadioButton("Large Size");
		largeSize.setSize(DEFAULT_BUTTON_SIZE);
		
		// Adds buttons to buttonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(smallSize);
		group.add(medSize);
		group.add(largeSize);
		
		// Adds buttons to panel (includes rigid areas for spacing)
		mapSizePanel.add(Box.createRigidArea(new Dimension(100, 10)));
		mapSizePanel.add(smallSize);
		mapSizePanel.add(medSize);
		mapSizePanel.add(largeSize);
	}
	
	/**
	 * Sets up the resourceDensityPanel and its buttons.
	 */
	private void setupResourceDensityPanel()
	{
		// Sets attributes of the resourceDensityPanel
		resourceDensityPanel.setSize(DEFAULT_SUBPANEL_SIZE);
		resourceDensityPanel.setLayout(new BoxLayout(resourceDensityPanel, 
				BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially fewRsrcs button is selected
		final JRadioButton fewRsrcs = new JRadioButton("Few Resources", true);
		fewRsrcs.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton avgRsrcs = new JRadioButton("Average Resources");
		avgRsrcs.setSize(DEFAULT_BUTTON_SIZE);
		final JRadioButton manyRsrcs = new JRadioButton("Many Resources");
		manyRsrcs.setSize(DEFAULT_BUTTON_SIZE);
		
		// Adds buttons to buttonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(fewRsrcs);
		group.add(avgRsrcs);
		group.add(manyRsrcs);
		
		// Adds buttons to panel (includes rigid areas for spacing)
		resourceDensityPanel.add(Box.createRigidArea(new Dimension(100, 10)));
		resourceDensityPanel.add(fewRsrcs);
		resourceDensityPanel.add(avgRsrcs);
		resourceDensityPanel.add(manyRsrcs);
	}
	
	/**
	 * Sets up the startGamePanel and its button.
	 */
	private void setupStartGamePanel()
	{
		// Sets up startGamePanel's attributes.
		startGamePanel.setSize(DEFAULT_SUBPANEL_SIZE);
		startGamePanel.setLayout(new BoxLayout(startGamePanel, BoxLayout.PAGE_AXIS));
		
		// Setting up start game button
		startGameButton.setSize(new Dimension(40, 20));
		startGameButton.setText("Start New Game");
		// add action listener to startGameButton here
		
		// Adding startGameButton to startGamePanel (includes rigid areas for spacing)
		startGamePanel.add(Box.createRigidArea(new Dimension(20, 40)));
		startGamePanel.add(startGameButton);
	}
} // end of GameplaySettingsMenu class