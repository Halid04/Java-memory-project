package it.castelli.Memory.game.medium;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import it.castelli.Memory.resources.Card;
import it.castelli.Memory.resources.CardValues;
import it.castelli.Memory.resources.GameDifficulty;
import it.castelli.Memory.resources.ImageCategory;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

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
 * Difficoltà: Media
 * @see javax.swing.JPanel
 * @see javax.swing.JLabel
 * @see javax.swing.BorderFactory
 * @see javax.swing.border.Border
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.util.ArrayList
 * @see it.castelli.Memory.resources.Card
 * @see it.castelli.Memory.resources.CardValues
 * @see it.castelli.Memory.resources.ImageCategory
 * @author Maltempi Elisabetta 4CI
 * @author Togni Claudio 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class MediumDifGamePanel extends JPanel{
	private ImageCategory category;
    private ArrayList<Card> posizioni= new ArrayList<Card>(0);
    private CardValues values;
    private Border border= BorderFactory.createLineBorder(Color.WHITE);
    private JLabel label = new JLabel();

    MediumDifGamePanel(ImageCategory category){
    	this.category = category;
    	this.values = new CardValues(0, 0, category, GameDifficulty.MEDIUM);
    	setCardsProperties();
    	setPanelProperties();
        setPanelProperties();
    }
    
    private void setLabelProperties() {
    	this.label.setPreferredSize(new Dimension(100, 20));
    	this.label.setText("Tentativi: 0");
    	this.label.setForeground(Color.black);
    	this.label.setBounds(270,20,100,20);
    }
    
    public void updateLabel(int tentativi) {
    	this.label.setText("Tentativi: " + tentativi);
    }

    private void setCardsProperties(){
    	this.posizioni = values.generateValues(posizioni);
        for(int i=0;i<this.posizioni.size();i++){
            this.posizioni.get(i).setPreferredSize(new Dimension(80,80));
            switch (i+1){
                case 1:
                    this.posizioni.get(i).setBounds(22,22,80,80);
                    break;
                case 2:
                    this.posizioni.get(i).setBounds(117,22,80,80);
                    break;
                case 3:
                    this.posizioni.get(i).setBounds(212,22,80,80);
                    break;
                case 4:
                    this.posizioni.get(i).setBounds(307,22,80,80);
                    break;
                case 5:
                    this.posizioni.get(i).setBounds(402,22,80,80);
                    break;
                case 6:
                    this.posizioni.get(i).setBounds(497,22,80,80);
                    break;
                case  7:
                    this.posizioni.get(i).setBounds(22,117,80,80);
                    break;
                case 8:
                    this.posizioni.get(i).setBounds(117,117,80,80);
                    break;
                case 9:
                    this.posizioni.get(i).setBounds(212,117,80,80);
                    break;
                case 10:
                    this.posizioni.get(i).setBounds(307,117,80,80);
                    break;
                case 11:
                    this.posizioni.get(i).setBounds(402,117,80,80);
                    break;
                case 12:
                    this.posizioni.get(i).setBounds(497,117,80,80);
                    break;
                case 13:
                    this.posizioni.get(i).setBounds(22,212,80,80);
                    break;
                case 14:
                    this.posizioni.get(i).setBounds(117,212,80,80);
                    break;
                case  15:
                    this.posizioni.get(i).setBounds(212,212,80,80);
                    break;
                case 16:
                    this.posizioni.get(i).setBounds(307,212,80,80);
                    break;
                case 17:
                    this.posizioni.get(i).setBounds(402,212,80,80);
                    break;
                case  18:
                    this.posizioni.get(i).setBounds(497,212,80,80);
                    break;
                case 19:
                    this.posizioni.get(i).setBounds(22,307,80,80);
                    break;
                case 20:
                    this.posizioni.get(i).setBounds(117,307,80,80);
                    break;
                case 21:
                    this.posizioni.get(i).setBounds(212,307,80,80);
                    break;
                case 22:
                    this.posizioni.get(i).setBounds(307,307,80,80);
                    break;
                case 23:
                    this.posizioni.get(i).setBounds(402,307,80,80);
                    break;
                case 24:
                    this.posizioni.get(i).setBounds(497,307,80,80);
                    break;
                case 25:
                    this.posizioni.get(i).setBounds(22,402,80,80);
                    break;
                case 26:
                    this.posizioni.get(i).setBounds(117,402,80,80);
                    break;
                case 27:
                    this.posizioni.get(i).setBounds(212,402,80,80);
                    break;
                case 28:
                    this.posizioni.get(i).setBounds(307,402,80,80);
                    break;
                case 29:
                    this.posizioni.get(i).setBounds(402,402,80,80);
                    break;
                case 30:
                    this.posizioni.get(i).setBounds(497,402,80,80);
                    break;
                case 31:
                    this.posizioni.get(i).setBounds(22,497,80,80);
                    break;
                case 32:
                    this.posizioni.get(i).setBounds(117,497,80,80);
                    break;
                case 33:
                    this.posizioni.get(i).setBounds(212,497,80,80);
                    break;
                case 34:
                    this.posizioni.get(i).setBounds(307,497,80,80);
                    break;
                case 35:
                    this.posizioni.get(i).setBounds(402,497,80,80);
                    break;
                case 36:
                    this.posizioni.get(i).setBounds(497,497,80,80);
                    break;
                    
            }
        }
    }

    private void setPanelProperties() {
    	this.setLayout(null);
        addButtons();
        this.add(this.label);
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(new Color(102,178,255));
        this.setBorder(border);
        this.setVisible(true);
    }

    private void addButtons(){
        for(int i = 0; i < posizioni.size(); i++){
            this.add(posizioni.get(i));
        }
    }
    
    public Object getButtons() {
    	return this.posizioni;
    }
    
    public void setButtons(ArrayList<Card> posizioni) {
    	this.posizioni = posizioni;
    }
}
