package it.castelli.Memory.usr;

//<Imports for Graphics and Events>
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
//<Import Application Functions>
import it.castelli.Memory.home.HomeFrame;

/**
 * The Signup page creates a form that provides users with the ability to sign up<br>
 * to play a memory game. SignupFrame extends JFrame and has a SignupPanel instance,<br>
 * JMenuBar instance, and JMenuItems. The class defines methods to set the properties of the menu items,<br>
 * menu, and frame. The menu has Home Page, Login Page, and Exit buttons. Home and Login buttons create instances<br>
 * of HomeFrame and LoginFrame classes, while the Exit button terminates the app.<br><br>
 * Constructors:
 * <ul>
 * 	<li>SignupFrame()</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setMenuItemProperties : private void</li>
 * 	<li>setMenuBarProperties : private void</li>
 * 	<li>setFrameProperties : private void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>panel : private SingupPanel</li>
 * 	<li>menuBar : private JMenuBar</li>
 * 	<li>Options : private JMenu</li>
 * 	<li>login : private JMenuItem</li>
 * 	<li>home : private JMenuItem</li>
 * 	<li>exit : private JMenuItem</li>
 * 	<li>color : private Color</li>
 * 	<li>frameSize : private Dimension</li>
 * </ul>
 * @see javax.swing.JFrame
 * @see javax.swing.JMenuItem
 * @see javax.swing.JMenu
 * @see javax.swing.JMenuBar
 * see java.awt.Dimension
 * @see java.awt.Color
 * @see java.awt.event.ActionEvent
 * @see java.awt.event.ActionListener
 * @see java.awt.event.KeyEvent
 * @see it.castelli.Memory.usr.SignupPanel
 * @see it.castelli.Memory.usr.LoginFrame
 * @see it.castelli.Memory.home.HomeFrame
 * @author Claudio
 * @version 1.6
 */
@SuppressWarnings("serial")
public class SignupFrame extends JFrame {
	private SignupPanel panel = new SignupPanel(this);
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem login = new JMenuItem();
	private JMenuItem home = new JMenuItem();
	private JMenuItem exit = new JMenuItem();
	private JMenu Options = new JMenu();
	private JMenu User = new JMenu();
	private Color color = new Color(181, 13, 83);
	private Dimension frameSize = new Dimension(600,400);
	
	/**
	 * Singup Page constructor<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li>setMenuItemProperties</li>
	 * 	<li>setMenuBarProperties</li>
	 * 	<li>setFrameProperties</li>
	 * </ul>
	 */
	public SignupFrame(){
		setMenuItemProperties();
		setMenuBarProperties();
		setFrameProperties();
	}
	
	/**
	 * This method sets the properties for the JMenuItems. It sets the text, foreground color, mnemonic and visibility<br>
	 * of each item. It also adds an ActionListener to each item. When an item is clicked,<br>
	 * it creates a new instance of the associated class and disposes of the current frame.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setText</b></li>
	 * 	<li><b>addActionListener</b></li>
	 *  <li><b>setForeground</b></li>
	 *  <li><b>setMnemonic</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * Items used:
	 * <ul>
	 * 	<li><b>home</b></li>
	 * 	<li><b>exit</b></li>
	 * 	<li><b>login</b></li>
	 * </ul>
	 * @see javax.swing.JMenuItem
	 * @see java.awt.Color
	 * @see java.awt.event.ActionEvent
	 * @see java.awt.event.ActionListener
	 * @see java.awt.event.KeyEvent
	 * @see it.castelli.Memory.home.HomeFrame
	 * @see it.castelli.Memory.usr.LoginFrame
	 */
	private void setMenuItemProperties() {
		//Home Page Button
		home.setText("Home Page");
		home.setForeground(color);
		home.setMnemonic(KeyEvent.VK_H);
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new HomeFrame();
				disposePage();
			}	
		});
		home.setVisible(true);
		
		//Login Page Button
		login.setText("Login Page");
		login.setForeground(color);
		login.setMnemonic(KeyEvent.VK_L);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginFrame();
				disposePage();
			}
		});
		login.setVisible(true);
		
		//Exit Button
		exit.setText("Exit");
		exit.setForeground(Color.red);
		exit.setMnemonic(KeyEvent.VK_E);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setVisible(true);
	}

	/**
	 *  This method sets the properties for the JMenu and JMenuBar components.<br>
	 *  It sets the text, foreground color, and mnemonic for each menu.<br>
	 *  It also adds the appropriate menu items to each menu and sets the visibility of each component.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setText</b></li>
	 *  <li><b>setForeground</b></li>
	 *  <li><b>setMnemonic</b></li>
	 *  <li><b>add</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * Items used:
	 * <ul>
	 * 	<li><b>home</b></li>
	 * 	<li><b>exit</b></li>
	 * 	<li><b>login</b></li>
	 *  <li><b>Options</b></li>
	 *  <li><b>User</b></li>
	 *  <li><b>menuBar</b></li>
	 * </ul>
	 * @see javax.swing.JMenuItem
	 * @see javax.swing.JMenu
	 * @see javax.swing.JMenuBar
	 * @see java.awt.Color
	 * @see java.awt.event.KeyEvent
	 */
	private void setMenuBarProperties() {
		//Option Menu
		Options.setText("Options");
		Options.setForeground(color);
		Options.setMnemonic(KeyEvent.VK_O);
		Options.add(home);
		Options.add(exit);
		Options.setVisible(true);
		
		//User Menu
		User.setText("User");
		User.setForeground(color);
		User.setMnemonic(KeyEvent.VK_U);
		User.add(login);
		User.setVisible(true);
		
		//MenuBar
		menuBar.add(Options);
		menuBar.add(User);
		menuBar.setVisible(true);
	}
	
	/**
	 * Frame Settings.<br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>add</b></li>
	 *  <li><b>setJMenuBar</b></li>
	 *  <li><b>setDefaultCloseOperation</b></li>
	 *  <li><b>setSize</b></li>
	 *  <li><b>setResizable</b></li>
	 *  <li><b>setLocationRelativeTo</b></li>
	 *  <li><b>setVisible</b></li>
	 * </ul>
	 * Item used:
	 * <ul>
	 * 	<li><b>RegistrationPanel</b></li>
	 * 	<li><b>menuBar</b></li>
	 * </ul>
	 * @see javax.swing.JFrame
	 * @see javax.swing.JPanel
	 * @see javax.swing.JMenuBar
	 * @see it.castelli.Memory.usr.SignupPanel
	 */
	private void setFrameProperties() {
		this.add(panel);
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(frameSize);
		this.setTitle("Memory Signup Page");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	/**
	 * @see javax.swing.JFrame
	 * @see it.castelli.Memory.usr.SignupFrame
	 */
	public void disposePage() {
		this.dispose();
	}
}