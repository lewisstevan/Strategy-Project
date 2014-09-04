package gui;

import guiInterface.GamePlaySettingsMenuListeners;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * The game-play settings menu for the game.
 * 
 * @author Thompson_000 & Stevan Lewis
 * @version 1.04
 */
public class GameplaySettingsMenu 
{
	
	private static final GamePlaySettingsMenuListeners LISTENERS = new GamePlaySettingsMenuListeners();
	/**
	 * A default Dimension for the fittingPanel's subpanels.
	 */
	private static final Dimension DEFAULT_SUBPANEL_SIZE = new Dimension(250, 250);
	
	/**
	 * The overall frame for this menu.
	 */
	static JFrame guiFrame;
	
	/**
	 * A containing panel for various sub-panels.
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
	 * A button to go back to the main menu.
	 */
	JButton backButton;
	
	/**
	 * A label for the race selection category.
	 */
	JLabel raceSelectionLabel;
	
	/**
	 * A label for the difficulty selection category.
	 */
	JLabel difficultySelectionLabel;
	
	/**
	 * A label for the resource density selection category.
	 */
	JLabel resourceDensityLabel;
	
	/**
	 * A label for the map size selection category.
	 */
	JLabel mapSizeLabel;
	
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
		backButton = new JButton();
		raceSelectionLabel = new JLabel();
		difficultySelectionLabel = new JLabel();
		resourceDensityLabel = new JLabel();
		mapSizeLabel = new JLabel();
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
		guiFrame.setLayout(new FlowLayout());
		
		
		// Sets up all sub-panels of the fittingPanel
		setupRacePanel();
		setupAIDifficultyPanel();
		setupMapSizePanel();
		setupResourceDensityPanel();
		setupStartGamePanel();
		
		// Adds all sub-panels to the fittingPanel
		guiFrame.add(racePanel);
		guiFrame.add(aiDifficultyPanel);
		guiFrame.add(mapSizePanel);
		guiFrame.add(resourceDensityPanel);
		guiFrame.add(startGamePanel);
	}
	
	/**
	 * Sets up the racePanel and its buttons.
	 */
	private void setupRacePanel() 
	{
		// Sets attributes of the racePanel
		racePanel.setPreferredSize(DEFAULT_SUBPANEL_SIZE);
		racePanel.setLayout(new BoxLayout(racePanel, BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially Knight Race button is selected
		final JRadioButton knightRace = new JRadioButton("Knight Race", true);
		knightRace.setAlignmentX(Component.CENTER_ALIGNMENT);
		final JRadioButton techRace = new JRadioButton("Tech Race");
		techRace.setAlignmentX((float) 0.55);
		final JRadioButton mageRace = new JRadioButton("Mage Race");
		mageRace.setAlignmentX((float) 0.53);
		
		// Adds buttons to buttonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(knightRace);
		group.add(techRace);
		group.add(mageRace);
		
		//Sets up the JLabel for the race panel.
		raceSelectionLabel.setText("Select Your Race:");
		raceSelectionLabel.setFont(new Font("serif", Font.PLAIN, 20));
		
		
		// Adds buttons to panel
		raceSelectionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		racePanel.add(raceSelectionLabel);
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
		aiDifficultyPanel.setPreferredSize(DEFAULT_SUBPANEL_SIZE);
		aiDifficultyPanel.setLayout(new BoxLayout(aiDifficultyPanel, BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially Easy button is selected
		final JRadioButton easyDiff = new JRadioButton("Easy Difficulty", true);
		easyDiff.setAlignmentX(Component.CENTER_ALIGNMENT);
		final JRadioButton medDiff = new JRadioButton("Medium Difficulty");
		medDiff.setAlignmentX((float) 0.43);
		final JRadioButton hardDiff = new JRadioButton("Hard Difficulty");
		hardDiff.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// Adds buttons to buttonGroup, the medium Difficulty is selected by default.
		final ButtonGroup group = new ButtonGroup();
		group.add(easyDiff);
		group.add(medDiff);
		group.add(hardDiff);
		medDiff.setSelected(true);
		
		//Sets up the JLabel for the difficulty panel.
		difficultySelectionLabel.setText("Select a Difficulty Level:");
		difficultySelectionLabel.setFont(new Font("serif", Font.PLAIN, 20));
		
		// Adds buttons to panel (includes rigid areas for spacing)
		difficultySelectionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		aiDifficultyPanel.add(difficultySelectionLabel);
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
		mapSizePanel.setPreferredSize(DEFAULT_SUBPANEL_SIZE);
		mapSizePanel.setLayout(new BoxLayout(mapSizePanel, BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel, initially smallSize button is selected
		final JRadioButton smallSize = new JRadioButton("Small Size", true);
		smallSize.setAlignmentX(Component.CENTER_ALIGNMENT);
		final JRadioButton medSize = new JRadioButton("Medium Size");
		medSize.setAlignmentX((float) 0.44);
		final JRadioButton largeSize = new JRadioButton("Large Size");
		largeSize.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		// Adds buttons to buttonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(smallSize);
		group.add(medSize);
		group.add(largeSize);
		medSize.setSelected(true);
		
		//Sets up the JLabel for the map size panel.
		mapSizeLabel.setText("Select the Map Size:");
		mapSizeLabel.setFont(new Font("serif", Font.PLAIN, 20));
		
		// Adds buttons to panel (includes rigid areas for spacing)
		mapSizeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		mapSizePanel.add(mapSizeLabel);
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
		resourceDensityPanel.setPreferredSize(DEFAULT_SUBPANEL_SIZE);
		resourceDensityPanel.setLayout(new BoxLayout(resourceDensityPanel, 
				BoxLayout.PAGE_AXIS));
		
		// Creates the buttons of this panel
		final JRadioButton fewRsrcs = new JRadioButton("Few Resources", true);
		fewRsrcs.setAlignmentX(Component.CENTER_ALIGNMENT);
		final JRadioButton avgRsrcs = new JRadioButton("Average Resources");
		avgRsrcs.setAlignmentX((float) 0.41);
		final JRadioButton manyRsrcs = new JRadioButton("Many Resources");
		manyRsrcs.setAlignmentX((float) 0.47);
		
		// Adds buttons to buttonGroup, average resources selected by default.
		final ButtonGroup group = new ButtonGroup();
		group.add(fewRsrcs);
		group.add(avgRsrcs);
		group.add(manyRsrcs);
		avgRsrcs.setSelected(true);
		
		//Sets up the JLabel for the resource density panel.
		resourceDensityLabel.setText("Select resource Density:");
		resourceDensityLabel.setFont(new Font("serif", Font.PLAIN, 20));
		
		// Adds buttons to panel (includes rigid areas for spacing)
		resourceDensityLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		resourceDensityPanel.add(resourceDensityLabel);
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
		startGamePanel.setPreferredSize(new Dimension(guiFrame.getWidth(), 50));
		startGamePanel.setLayout(new BoxLayout(startGamePanel, BoxLayout.LINE_AXIS));
		
		// Setting up start game button
		startGameButton.setSize(new Dimension(40, 20));
		startGameButton.setText("Start New Game");
		startGameButton.addActionListener(LISTENERS.new NewGameButtonListener());
		// add action listener to startGameButton here
		
		//Setting up the back button
		backButton.setSize(new Dimension(40, 20));
		backButton.setText("Back");
		backButton.addActionListener(LISTENERS.new BackButtonListener());
		
		
		
		// Adding startGameButton to startGamePanel (includes rigid areas for spacing)
		startGamePanel.add(Box.createRigidArea(new Dimension(165, 13)));
		startGamePanel.add(backButton);
		startGamePanel.add(Box.createRigidArea(new Dimension(110, 0)));
		startGamePanel.add(startGameButton);
		
		//Sets the focus of the frame.
		guiFrame.getRootPane().setDefaultButton(startGameButton);
	}
	
	public static void Close()
	{
		guiFrame.dispose();
	}
} // end of GameplaySettingsMenu class