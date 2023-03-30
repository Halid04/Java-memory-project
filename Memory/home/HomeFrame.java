package it.castelli.Memory.home;

import javax.swing.JFrame;

/**
 * The HomeFrame class creates the main window<br>
 * for the HomePage<br>
 * extends <b>JFrame</b><br><br>
 * Constructors:
 * <ul>
 * 	<li>HomeFrame()</li>
 * 	<li>HomeFrame(loggedIn : boolean)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setFrameProperties : private void</li>
 * 	<li>setFramePropertiesLoggedIn: private void</li>
 * 	<li>disposePage : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>loggedIn : private boolean</li>
 * 	<li>username : private String</li>
 * 	<li>title: private String</li>
 * 	<li>dimension : private Dimension</li>
 * </ul>
 * @see javax.swing.JFrame
 * @see java.awt.Dimension
 * @see it.castelli.Memory.home.HomePanel
 * @author Maltempi Elisabetta 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class HomeFrame extends JFrame{
	private boolean loggedIn = false;
	private String username = "";
	
	/**
	 * HomePage constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setFrameProperties</li>
	 * </ul>
	 */
	public HomeFrame(){
		setFrameProperties();
	}
	
	/**
	 * HomePage constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setFramePropertiesLoggedIn</li>
	 * </ul>
	 * @param loggedIn : boolean
	 * @param username : String
	 */
	public HomeFrame(boolean loggedIn, String username){
		this.username = username;
		this.loggedIn = loggedIn;
		setFramePropertiesLoggedIn();
	}
	
	/**
	 * This method sets the properties of the HomeFrame<br>
	 * It sets the title, size, close operation and adds a HomePane<br><br>
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
	 * @see java.awt.Dimension
	 * @see it.castelli.Memory.home.HomePanel
	 */
	private void setFrameProperties() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setTitle("Memory");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.add(new HomePanel(this));
		
		this.setVisible(true);
	}
	
	/**
	 * This method sets the properties of the HomeFrame when the user is logged in.<br>
	 * It sets the title, size, default close operation, and adds a HomePanel with the 'loggedIn' boolean value to it<br><br>
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
	 * @see java.awt.Dimension
	 * @see it.castelli.Memory.home.HomePanel
	 */
	private void setFramePropertiesLoggedIn() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setTitle("Memory");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.add(new HomePanel(this, loggedIn, username));
		
		this.setVisible(true);
	}
	
	/**
	 * This method disposes the HomeFrame
	 * @see javax.swing.JFrame
	 */
	public void disposePage() {
		this.dispose();
	}
}
