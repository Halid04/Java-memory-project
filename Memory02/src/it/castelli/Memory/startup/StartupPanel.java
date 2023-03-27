package it.castelli.Memory.startup;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import it.castelli.Memory.home.HomeFrame;

/**
 * StartupPanel contains a button (StartupBtn) which, when pressed, starts the game by<br>
 * opening the HomeFrame window and closing the StartupFrame window.<br><br>
 * Constructors:
 * <ul>
 * 	<li>StartupPanel()</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setPanelProperties() : private void</li>
 * 	<li>getFrame(frame : JFrame) : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>start : private StartupBtn</li>
 * 	<li>frame : private StartupFrame</li>
 * 	<li>panelSize : private Dimension</li>
 * </ul>
 * @see javax.swing.JPanel
 * @see java.awt.Dimension
 * @see java.awt.Color
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see it.castelli.Memory.home.HomeFrame
 * @see it.castelli.Memory.startup.StartupFrame
 * @see it.castelli.Memory.startup.StartupBtn
 * @author Elisabetta
 * @version 1.2
 */
@SuppressWarnings("serial")
public class StartupPanel extends JPanel{
	private StartupBtn start = new StartupBtn();
	private StartupFrame frame;
	private Dimension panelSize = new Dimension(100,100);
	
	/**
	 * StartupPage Panel constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>addActionListener</li>
	 * 	<li>setPanelProperties</li>
	 * </ul>
	 * @see javax.swing.JPanel
	 * @see javax.swing.JButton
	 * @see java.awt.event.ActionEvent
	 * @see java.awt.event.ActionListener
	 * @see it.castelli.Memory.startup.StartupFrame
	 * @see it.castelli.Memory.startup.StartupBtn
	 * @see it.castelli.Memory.home.HomeFrame
	 */
	StartupPanel(){
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new HomeFrame();
				frame.disposePage();
			}		
		});
		setPanelProperties();
	}

	/**
	 * Sets the properties of the panel. In particular, it sets the dimensions,<br>
	 * background color, layout, adds the start button and makes it visible.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setPreferredSize</b></li>
	 * 	<li><b>setBackground</b></li>
	 * 	<li><b>setLayout</b></li>
	 * 	<li><b>add</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * @see javax.swing.JPanel
	 * @see java.awt.Dimension
	 * @see java.awt.Color
	 * @see it.castelli.Memory.startup.StartupBtn
	 */
	private void setPanelProperties() {
		this.setPreferredSize(panelSize);
		this.setBackground(Color.black);
        this.add(start);
        this.setLayout(null);
        this.setVisible(true);
	}
	
	/**
	 * Assigns the StartupFrame instance received as a parameter to the frame variable.
	 * @param frame : JFrame
	 * @see javax.swing.JFrame
	 * @see it.castelli.Memory.startup.StartupFrame
	 */
	public void getFrame(JFrame frame) {
		this.frame = (StartupFrame) frame;
	}
}
