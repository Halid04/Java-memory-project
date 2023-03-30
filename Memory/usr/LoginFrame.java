package it.castelli.Memory.usr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import it.castelli.Memory.home.HomeFrame;

/**
 * LoginFrame and LoginPanel are used to create a login form to allow players<br>
 * who want to play to login. The LoginFrame class creates the window and adds<br>
 * the LoginPanel class as its content.<br><br>
 * Constructors:
 * <ul>
 * 	<li>LoginFrame()</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setMenuItemProperties : private void</li>
 * 	<li>setMenuBarProperties : private void</li>
 * 	<li>setFrameProperties : private void</li>
 * 	<li>disposePage : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>menuBar : private JMenuBar</li>
 * 	<li>signup : private JMenuItem</li>
 * 	<li>home : private JMenuItem</li>
 * 	<li>exit : private JMenuItem</li>
 * 	<li>Options : private JMenu</li>
 * 	<li>User : private JMenu</li>
 * 	<li>color : private Color</li>
 * 	<li>frameSize : private Dimension</li>
 * </ul>
 * @see javax.swing.JFrame
 * @see javax.swing.JMenuItem
 * @see javax.swing.JMenu
 * @see javax.swing.JMenuBar
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.awt.event.ActionEvent
 * @see java.awt.event.ActionListener
 * @see java.awt.event.KeyEvent
 * @see it.castelli.Memory.usr.LoginPanel
 * @see it.castelli.Memory.usr.SignupFrame
 * @see it.castelli.Memory.home.HomeFrame
 * @author Cisse Halid 4CI
 * @version 1.6
 */
@SuppressWarnings("serial")
public class LoginFrame extends JFrame{
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem signup = new JMenuItem();
	private JMenuItem home = new JMenuItem();
	private JMenuItem exit = new JMenuItem();
	private JMenu Options = new JMenu();
	private JMenu User = new JMenu();
	private Color color = new Color(181, 13, 83);
	private Dimension frameSize = new Dimension(600,400);
	
	/**
	 * A constructor that initializes the menu bar, its items<br>
	 * and sets the frame properties.<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setMenuItemProperties</li>
	 * 	<li>setMenuBarProperties</li>
	 * 	<li>setFrameProperties</li>
	 * </ul>
	 */
	public LoginFrame(){
		setMenuItemProperties();
		setMenuBarProperties();
		setFrameProperties();
	}
	
	/**
	 * A method that sets the properties of the MenuItems.<br><br>
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
	 * @see it.castelli.Memory.usr.SignupFrame
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
		signup.setText("Signup Page");
		signup.setForeground(color);
		signup.setMnemonic(KeyEvent.VK_L);
		signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignupFrame();
				disposePage();
			}
		});
		signup.setVisible(true);
		
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
	 * A method that sets the properties of the MenuBar.<br><br>
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
	 * 	<li><b>signup</b></li>
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
		User.add(signup);
		User.setVisible(true);
		
		//MenuBar
		menuBar.add(Options);
		menuBar.add(User);
		menuBar.setVisible(true);
	}
	
	/**
	 * A method that sets the properties of the frame.<br><br>
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
	 * 	<li><b>LoginPanel</b></li>
	 * 	<li><b>menuBar</b></li>
	 * </ul>
	 * @see javax.swing.JFrame
	 * @see javax.swing.JMenuBar
	 * @see javax.swing.JMenu
	 * @see javax.swing.JMenuItem
	 * @see it.castelli.Memory.usr.LoginPanel
	 */
	private void setFrameProperties() {
		this.setJMenuBar(menuBar);
		this.setSize(frameSize);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new LoginPanel(this));
        this.setVisible(true);
	}
	
	/**
	 * A method that disposes the current frame.
	 * @see javax.swing.JFrame
	 * @see it.castelli.Memory.usr.LoginFrame
	 */
	public void disposePage() {
		this.dispose();
	}
}