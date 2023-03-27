package it.castelli.Memory.usr;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * Label for Signup and Login Page<br><br>
 * Constructor:
 * <ul>
 * 	<li>LabelForSignupAndLogin(text : String)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setLabelProperties(text : String) : private void</li>
 * 	<li>toggleVisibility() : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>font : private Font</li>
 * 	<li>labelForeground : private Color</li>
 * 	<li>dim : private Dimension</li>
 * </ul>
 * @see javax.swing.JLabel
 * @see java.awt.Color
 * @see java.awt.Font
 * @see java.awt.Dimension
 * @author Claudio
 * @version 1.0
 */
@SuppressWarnings("serial")
public class LabelForSignupAndLogin extends JLabel{	
	private Font font = new Font("Arial", Font.BOLD, 20);
	private Color labelForeground = new Color(5, 237, 144);
	private Dimension dim = new Dimension(120,20);
	
	/**
	 * Labels contructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setLabelProperties</li>
	 * </ul>
	 * @param text : String
	 * @see javax.swing.JLabel
	 */
	public LabelForSignupAndLogin(String text){
		setLabelProperties(text);
	}
	
	/**
	 * Sets the label properties<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setText</li>
	 * 	<li>setPreferredSize</li>
	 * 	<li>setForeground</li>
	 * 	<li>setFont</li>
	 * 	<li>setVisible</li>
	 * </ul>
	 * @see javax.swing.JLabel
	 * @see java.awt.Color
	 * @see java.awt.Font
	 * @see java.awt.Dimension
	 * @see it.castelli.Memory.usr.LabelForSignupAndLogin
	 * @param text : String
	 */
	private void setLabelProperties(String text) {
		this.setText(text);
		this.setPreferredSize(dim);
		this.setForeground(labelForeground);
		this.setFont(font);
		this.setVisible(false);
	}
	
	/**
	 * Toggle the label visibility
	 * @see javax.swing.JLabel
	 * @see it.castelli.Memory.usr.LabelForSignupAndLogin
	 */
	public void toggleVisibility() {
		if(this.isVisible()) {
			this.setVisible(false);
		}else {
			this.setVisible(true);
		}
	}
}
