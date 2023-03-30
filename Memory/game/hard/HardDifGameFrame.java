package it.castelli.Memory.game.hard;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import it.castelli.Memory.home.HomeFrame;
import it.castelli.Memory.resources.Card;
import it.castelli.Memory.resources.ImageCategory;
import it.castelli.Memory.resources.PointSaving;
import it.castelli.Memory.resources.alerts.Alert;

/**
 * Game panel<br><br>
 * Constructor:
 * <ul>
 * 	<li></li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li></li>
 * </ul>
 * Attibutes:
 * <ul>
 * 	<li></li>
 * </ul>
 * Difficoltà: Difficile
 * @see javax.swing.JFrame
 * @see it.castelli.Memory.game.medium.HardDifGamePanel
 * @author Maltempi Elisabetta 4CI
 * @author Togni Claudio 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class HardDifGameFrame extends JFrame{
	private ImageCategory category;
	private JButton confBtn = new JButton("Conferma");
	private JMenuBar menuBar = new JMenuBar();
	private ArrayList<Card> posizioni;
	private Card card1;
	private Card card2;
	private HardDifGamePanel gamePanel;
	private Alert alert = new Alert();
	private int tentativi = 0;
	private boolean loggedIn = false;
	private String username = "";
	
    public HardDifGameFrame(ImageCategory category){
    	this.category = category;
    	this.gamePanel = new HardDifGamePanel(category);
    	setConfirmButtonProperties();
    	setFrameProperties();
    }
    
    public HardDifGameFrame(boolean loggedIn, String username, ImageCategory category){
    	this.category = category;
    	this.username = username;
    	this.loggedIn = loggedIn;
    	this.gamePanel = new HardDifGamePanel(category);
    	setConfirmButtonProperties();
    	setFrameProperties();
    }
    
    /**
     * @see javax.swing.JButton
     * @see java.awt.event.ActionEvent
     * @see java.awt.event.ActionListener
     * @see java.awt.event.KeyEvent
     * @see java.util.ArrayList
     * @see it.castelli.Memory.resources.Card
     * @see it.castelli.Memory.game.easy.EasyDifGamePanel
     * @see it.castelli.Memory.resources.alerts.Alert
     */
    private void setConfirmButtonProperties() {
    	confBtn.setMnemonic(KeyEvent.VK_ENTER);
    	confBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean completed = false;
				tentativi++;
				gamePanel.updateLabel(tentativi);
				posizioni = (ArrayList<Card>) gamePanel.getButtons();
				for(int i = 0; i < posizioni.size(); i++) {
					if(posizioni.get(i).isTurned()) {
						if(card1 == null) {
							card1 = posizioni.get(i);
						}else {
							card2 = posizioni.get(i);
						}
					}
				}
				if(card1.getValue() == card2.getValue()) {
					System.out.println("Hai trovato una coppia!");
					for(int i = 0; i < posizioni.size(); i++) {
						if(posizioni.get(i).equals(card1) || posizioni.get(i).equals(card2)) {
							posizioni.get(i).setFound(true);
							posizioni.get(i).setTurned(false);
						}
					}
				}else {
					System.out.println("Le due carte sono diverse!");
					for(int i = 0; i < posizioni.size(); i++) {
						if(posizioni.get(i).equals(card1) || posizioni.get(i).equals(card2)) {
							posizioni.get(i).setFound(false);
							posizioni.get(i).setTurned(false);
							posizioni.get(i).coverCard();
						}
					}
				}
				card1 = null;
				card2 = null;
				for(int i = 0; i < posizioni.size(); i++) {
					if(posizioni.get(i).isFound()) {
						completed = true;
					}else {
						completed = false;
						i = posizioni.size();
					}
				}
				if(completed) { 
					alert.gameCompleted(tentativi);
					if(loggedIn) {
						new PointSaving(username, tentativi, "Hard");
					}else {
						new PointSaving("guest", tentativi, "Hard");
					}
					new HomeFrame(loggedIn, username);
					disposePage();
				}
				gamePanel.setButtons(posizioni);
			}	
    	});
    	
    	confBtn.setVisible(true);
    }
    
    /**
     * Game Frame Settings.<br>
     * @see javax.swing.JFrame
     * @see javax.swing.JMenuBar
     * @see it.castelli.Memory.game.easy.EasyDifGamePanel
     */
    private void setFrameProperties() {
    	menuBar.add(confBtn);
        this.setLocationRelativeTo(null);
        this.setSize(630, 680);
		this.setBackground(new Color(102,178,255));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(menuBar);
        this.add(gamePanel);
        
        this.setVisible(true);
    }
    
    /**
     * @see javax.swing.JFrame
     * @see it.castelli.Memory.game.easy.EasyDifGameFrame
     */
    private void disposePage() {
    	this.dispose();
    }
}
