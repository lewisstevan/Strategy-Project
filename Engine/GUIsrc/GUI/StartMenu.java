
package GUI;
import javax.swing.*;
import java.awt.*;


public class StartMenu {
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
		
		fittingPanel.setPreferredSize(new Dimension(150, 250));
		fittingPanel.setLayout(new BorderLayout());
		guiFrame.add(fittingPanel, BorderLayout.EAST);
		
		btnPanel.setPreferredSize(new Dimension(150, 250));
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.PAGE_AXIS));
		fittingPanel.add(btnPanel, BorderLayout.SOUTH);
		
		startBtn.setMaximumSize(new Dimension(100, 40));
		startBtn.setText("Start");
		optionsBtn.setMaximumSize(new Dimension(100, 40));
		optionsBtn.setText("Options");
		btnPanel.add(Box.createRigidArea(new Dimension(30,100)));
		btnPanel.add(startBtn);
		btnPanel.add(Box.createRigidArea(new Dimension(30, 20)));
		btnPanel.add(optionsBtn);
		
		
	}
	
	public static void main(String[] args)
	{
		new StartMenu();
	}
	
}
