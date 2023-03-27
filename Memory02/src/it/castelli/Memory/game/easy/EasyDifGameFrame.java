package it.castelli.Memory.game.easy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import it.castelli.Memory.home.HomeFrame;
import it.castelli.Memory.resources.Card;
import it.castelli.Memory.resources.ImageCategory;
import it.castelli.Memory.resources.PointSaving;
import it.castelli.Memory.resources.alerts.Alert;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Game Frame<br>
 * Difficoltà: Facile
 * @see javax.swing.JFrame
 * @see javax.swing.JPanel
 * @see javax.swing.JMenuBar
 * @see javax.swing.JButton
 * @see it.castelli.Memory.resources.Card
 * @see it.castelli.Memory.resources.alerts.Alert
 * @see it.castelli.Memory.game.easy.EasyDifGamePanel
 * @see java.awt.Color
 * @see java.awt.event.ActionEvent
 * @see java.awt.event.ActionListener
 * @see java.awt.event.KeyEvent
 * @see java.util.ArrayList
 * @author Elisabetta
 * @version 1.2
 */
@SuppressWarnings({ "serial" })
public class EasyDifGameFrame extends JFrame {
	private ImageCategory category;
	private JButton confBtn = new JButton("Conferma");
	private JMenuBar menuBar = new JMenuBar();
	private ArrayList<Card> posizioni;
	private Card card1;
	private Card card2;
	private EasyDifGamePanel gamePanel = new EasyDifGamePanel(category);
	private Alert alert = new Alert();
	private int tentativi = 0;
	private boolean loggedIn = false;
	private String username = "";
	
    public EasyDifGameFrame(ImageCategory category){
    	this.category = category;
    	setConfirmButtonProperties();
    	setFrameProperties();
    }
    
    public EasyDifGameFrame(String username, ImageCategory category){
    	this.category = category;
    	this.username = username;
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
						new PointSaving(username, tentativi, "Difficoltà: Facile");
					}else {
						new PointSaving("guest", tentativi, "Difficoltà: Facile");
					}
					new HomeFrame(username);
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
        this.setSize(350, 390);
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