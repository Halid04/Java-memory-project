package it.castelli.Memory.startup;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * The startup is composed of a panel (StartupPanel) that contains a button (StartupBtn) which,<br>
 * when pressed, starts the game by opening the HomeFrame window and closing the StartupFrame window.<br>
 * The StartupFrame class represents the window of the startup page, while the StartupPanel class represents<br>
 * the internal panel of the window.<br><br>
 * Constructors:
 * <ul>
 * 	<li>StartupFrame()</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setFrameProperties : private void</li>
 * 	<li>disposePage : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>panel : private StartupPanel</li>
 * 	<li>frameSize : private Dimension</li>
 * </ul>
 * @see javax.swing.JFrame
 * @see it.castelli.Memory.startup.StartupPanel
 * @see java.awt.Dimension
 * @author Elisabetta
 * @version 1.2
 */
@SuppressWarnings("serial")
public class StartupFrame extends JFrame{
	private StartupPanel panel = new StartupPanel();
	private Dimension frameSize = new Dimension(400,400);
	
	/**
	 * StartupPage constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setFrameProperties</li>
	 * </ul>
	 */
	public StartupFrame() {
		setFrameProperties();
	}
	
	/**
	 * Sets the properties of the frame. In particular, it sets the closing operation of<br>
	 * the application when the frame is closed, dimensions, title, non-resizability, centered positioning,<br>
	 * adds the panel and makes it visible.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setDefaultCloseOperation</b></li>
	 * 	<li><b>setSize</b></li>
	 * 	<li><b>setTitle</b></li>
	 * 	<li><b>setResizable</b></li>
	 * 	<li><b>setLocationRelativeTo</b></li>
	 * 	<li><b>add</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * @see javax.swing.JFrame
	 * @see it.castelli.Memory.startup.StartupPanel
	 */
	private void setFrameProperties() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(frameSize);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Memory");
		
		this.add(panel);
		panel.getFrame(this);
		
		this.setVisible(true);
	}
	
	/**
	 * Closes the current frame.
	 * @see javax.swing.JFrame
	 */
	public void disposePage() {
		this.dispose();
	}
}
