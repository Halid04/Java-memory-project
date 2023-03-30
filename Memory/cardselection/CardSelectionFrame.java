package it.castelli.Memory.cardselection;

import java.awt.Dimension;
import javax.swing.JFrame;
import it.castelli.Memory.resources.GameDifficulty;

/**
 * @see javax.swing.JFrame
 * @see java.awt.Dimension
 * @see it.castelli.Memory.cardselection.CardSelectionFrame
 * @see it.castelli.Memory.resources.GameDifficulty
 * @see it.castelli.Memory.cardselection.CardSelectionPanel
 * @author Maltempi Elisabetta 4CI
 * @author Togni Claudio 4CI
 * @version 1.6
 */
@SuppressWarnings("serial")
public class CardSelectionFrame extends JFrame{
	private GameDifficulty difficulty;
	private String username = "";
	private Dimension frameSize = new Dimension(510,250);
	
	public CardSelectionFrame(GameDifficulty difficulty){
		this.difficulty = difficulty;
		setFrameProperties();
	}
	
	public CardSelectionFrame(GameDifficulty difficulty, String username){
		this.username = username;
		this.difficulty = difficulty;
		setFrameProperties();
	}
	
	private void setFrameProperties() {
		this.setSize(frameSize);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		if(username.length() != 0) {
			this.add(new CardSelectionPanel(this.difficulty, this.username, this));
		}else {
			this.add(new CardSelectionPanel(this.difficulty, this));
		}
		this.setVisible(true);
	}
	
	public void disposePage() {
		this.dispose();
	}
}
