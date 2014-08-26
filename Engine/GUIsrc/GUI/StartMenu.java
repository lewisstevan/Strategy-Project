package GUI;

import guiInterface.StartMenuListeners;

import javax.swing.*;

import java.awt.*;

/**
 * The start menu GUI for our game.
 * @author lewis_000 && Reid Thompson_001
 * @version 1.01
 */
public class StartMenu {
	
	/**
	 * A Object containing the two ActionListeners for the StartMenu.
	 */
	private static final StartMenuListeners LISTENERS = new StartMenuListeners();
	
	JFrame optionsFrame = new JFrame();
	JFrame guiFrame = new JFrame();
	JPanel fittingPanel = new JPanel();
	JPanel btnPanel = new JPanel();
	JButton startBtn = new JButton();
	JButton optionsBtn = new JButton();
	public StartMenu()
	{	
		//Setting up the guiFrame.
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Start Menu");
		guiFrame.setSize(500, 500);
		guiFrame.setLocationRelativeTo(null);
		guiFrame.setVisible(true);
		
		//Setting up and adding the fitting panel to be used for deeper customization of button layout
		fittingPanel.setPreferredSize(new Dimension(150, 250));
		fittingPanel.setLayout(new BorderLayout());
		guiFrame.add(fittingPanel, BorderLayout.EAST);
		
		//Setting up and adding the button panel to the fitting panel
		btnPanel.setPreferredSize(new Dimension(150, 250));
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.PAGE_AXIS));
		fittingPanel.add(btnPanel, BorderLayout.SOUTH);
		
		//Setting up the start button
		startBtn.setMaximumSize(new Dimension(100, 40));
		startBtn.setText("Start");
		startBtn.addActionListener(LISTENERS.new StartButtonListener());
		
		//Setting up the options button
		optionsBtn.setMaximumSize(new Dimension(100, 40));
		optionsBtn.setText("Options");
		optionsBtn.addActionListener(LISTENERS.new OptionsButtonListener());
		
		//Adding the buttons to the button panel (including rigid areas for spacing)
		btnPanel.add(Box.createRigidArea(new Dimension(30, 100)));
		btnPanel.add(startBtn);
		btnPanel.add(Box.createRigidArea(new Dimension(30, 20)));
		btnPanel.add(optionsBtn);
		
		addFeatures();
	}
	
	public void addFeatures() {
		// add music
		// add concept art to sides of main frame
	}
	
	public static void OpenOptionsMenu()
	{
		//optionsFrame.setdefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args)
	{
		new StartMenu();
	}
	
}
