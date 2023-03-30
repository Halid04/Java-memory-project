package it.castelli.Memory.usr;

import javax.swing.JFrame;

/**
 * @see javax.swing.JFrame
 * @see it.castelli.Memory.usr.RulesPanel.RulesPanel
 * @author Maltempi Elisabetta 4CI
 * @version 1.6
 */
@SuppressWarnings("serial")
public class RulesFrame extends JFrame {
	
	public RulesFrame() {
		setFrameProperties();
	}

	private void setFrameProperties() {
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new RulesPanel(this));
        this.setVisible(true);
	}
	
}
