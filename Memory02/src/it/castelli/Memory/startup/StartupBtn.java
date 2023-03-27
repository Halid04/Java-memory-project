package it.castelli.Memory.startup;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import it.castelli.Memory.resources.styles.RoundedBorder;

/**
 * Startup Button<br><br>
 * Constructors:
 * <ul>
 * 	<li>StartupBtn()</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setButtonProperties() : private void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>btnSize : private Dimension</li>
 * 	<li>btnColor : private Color</li>
 * 	<li>btnBorder : private RoundedBorder</li>
 * </ul>
 * @see javax.swing.JButton
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see it.castelli.Memory.resources.styles.RounderBorder
 * @author Elisabetta
 * @version 1.2
 */
@SuppressWarnings("serial")
public class StartupBtn extends JButton{
	private Dimension btnSize = new Dimension(50,30);
	private Color btnColor = new Color(255,152,0);
	private RoundedBorder btnBorder = new RoundedBorder(40);

	/**
	 * StartupPage Button constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setButtonProperties</li>
	 * </ul>
	 */
	StartupBtn(){
		setButtonProperties();
	}
	
	/**
	 * Start Button Settings<br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setPreferredSize</b></li>
	 * 	<li><b>setForeground</b></li>
	 * 	<li><b>setBounds</b></li>
	 * 	<li><b>setContentAreaFilled</b></li>
	 * 	<li><b>setFocusPainted</b></li>
	 * 	<li><b>setBorder</b></li>
	 * 	<li><b>addActionListener</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * @see javax.swing.JButton
	 * @see java.awt.Dimension
	 * @see java.awt.Color
	 * @see java.awt.event.ActionListener
	 * @see java.awt.event.ActionEvent
	 * @see it.castelli.Memory.resources.styles.RoundedBorder
	 * @see it.castelli.Memory.startup.StartupFrame
	 * @see it.castelli.Memory.home.HomeFrame
	 */
	private void setButtonProperties() {
		this.setText("Start");
		this.setPreferredSize(btnSize);
		this.setForeground(btnColor);
		this.setBounds(130,130,120,80);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.setBorder(btnBorder);
		this.setVisible(true);
	}
}
