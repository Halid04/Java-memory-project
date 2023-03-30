package it.castelli.Memory.usr;

import javax.swing.JButton;
import it.castelli.Memory.resources.styles.RoundedBorder;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.Color;

/**
 * Function Button.<br>
 * Class made only for btn style<br>
 * If you implements this class, you can add your own<br>
 * actionListener and KeyEvent<br><br>
 * Constructors:
 * <ul>
 * 	<li>FunctionBtn(text : String)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setButtonProperties(text : String) : private void</li>
 * 	<li>toggleVisibility(visibility : boolean) : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>font : private Font</li>
 * 	<li>dim : private Dimension</li>
 * 	<li>Background : private Color</li>
 * 	<li>Foreground : private Color</li>
 * 	<li>border : private RoundedBorder</li>
 * 	<li>cursor : private Cursor</li>
 * </ul>
 * @see javax.swing.JButton
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.awt.Font
 * @see java.awt.Cursor
 * @see java.awt.event.KeyEvent
 * @see it.castelli.Memory.resources.styles.RoundedBorder
 * @author Togni Claudio 4CI
 * @version 1.0
 */
@SuppressWarnings("serial")
public class FunctionBtn extends JButton {
	private Font font = new Font("Arial", Font.BOLD, 16);
	private Dimension dim = new Dimension(100,30);
	private Color Background = Color.black;
	private Color Foreground = new Color(5, 237, 144);
	private RoundedBorder border = new RoundedBorder(10);
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	/**
	 * Function Button constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setButtonProperties</li>
	 * </ul>
	 * @param text : String
	 */
	public FunctionBtn(String text){
		setButtonProperties(text);
	}
	
	/**
	 * Sets the button properties<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setFont</li>
	 * 	<li>setPreferredSize</li>
	 * 	<li>setText</li>
	 * 	<li>setBackground</li>
	 * 	<li>setForeground</li>
	 * 	<li>setCursor</li>
	 * 	<li>setBorder</li>
	 * 	<li>setContentAreaFilled</li>
	 * 	<li>setFocusPainted</li>
	 * 	<li>setMnemonic</li>
	 * </ul>
	 * @see javax.swing.JButton
	 * @see java.awt.Color
	 * @see java.awt.Font
	 * @see java.awt.Dimension
	 * @see java.awt.Cursor
	 * @see java.awt.event.KeyEvent
	 * @see it.castelli.Memory.usr.FunctionBtn
	 * @see it.castelli.Memory.resources.styles.RoundedBorder
	 * @param text : String
	 */
	private void setButtonProperties(String text) {
		this.setFont(font);
		this.setPreferredSize(dim);
		this.setText(text);
		this.setBackground(Background);
		this.setForeground(Foreground);
		this.setCursor(cursor);
		this.setBorder(border);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.setMnemonic(KeyEvent.VK_ENTER);
	}
	
	/**
	 * Toggle the button visibility
	 * @see javax.swing.JButton
	 * @see it.castelli.Memory.usr.FunctionBtn
	 * @param visibility : boolean
	 */
	public void toggleVisibility(boolean visibility) {
		this.setVisible(visibility);
	}
}
